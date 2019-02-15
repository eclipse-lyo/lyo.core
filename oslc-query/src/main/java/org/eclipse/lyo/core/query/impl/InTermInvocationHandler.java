/*******************************************************************************
 * Copyright (c) 2012 IBM Corporation.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * and Eclipse Distribution License v. 1.0 which accompanies this distribution. 
 *
 * The Eclipse Public License is available at http://www.eclipse.org/legal/epl-v10.html
 * and the Eclipse Distribution License is available at 
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * Contributors:
 *
 *	  Steve Pitschke - initial API and implementation
 *******************************************************************************/

package org.eclipse.lyo.core.query.impl;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import org.antlr.runtime.tree.Tree;
import org.eclipse.lyo.core.query.InTerm;
import org.eclipse.lyo.core.query.SimpleTerm.Type;
import org.eclipse.lyo.core.query.Value;

/**
 * Proxy implementation of {@link InTerm} interface
 */
class InTermInvocationHandler extends SimpleTermInvocationHandler
{
	public
	InTermInvocationHandler(
		Tree tree,
		Map<String, String> prefixMap
   )
	{
		super(tree, Type.IN_TERM, prefixMap);
	}
	
	/**
	 * @see java.lang.reflect.InvocationHandler#invoke(java.lang.Object, java.lang.reflect.Method, java.lang.Object[])
	 */
	@Override
	public Object
	invoke(
		Object proxy,
		Method method,
		Object[] args
	) throws Throwable
	{
		String methodName = method.getName();
		boolean isValues = methodName.equals("values");
		
		if (! isValues &&
			! methodName.equals("toString")) {
			return super.invoke(proxy, method, args);
		}
		
		if (values == null) {
			
			Tree currentTree = tree.getChild(1);
			
			values = new ArrayList<Value>(currentTree.getChildCount() - 1);
			
			for (int index = 0; index < currentTree.getChildCount(); index++) {
				
				Tree treeValue = currentTree.getChild(index);
				
				Value value =
					ComparisonTermInvocationHandler.createValue(
							treeValue, "unspported literal value type",
							prefixMap);
				
				values.add(value);
			}
			
			values = Collections.unmodifiableList(values);
		}
		
		if (isValues) {
			return values;
		}
		
		StringBuffer buffer = new StringBuffer();
		
		buffer.append(((InTerm)proxy).property().toString());
		buffer.append(" in [");
		
		boolean first = true;
		
		for (Value value : values) {
			
			if (first) {
				first = false;
			} else {
				buffer.append(',');
			}
			
			buffer.append(value.toString());
		}
		
		buffer.append(']');
		
		return buffer.toString();
	}
	
	private List<Value> values = null;
}
