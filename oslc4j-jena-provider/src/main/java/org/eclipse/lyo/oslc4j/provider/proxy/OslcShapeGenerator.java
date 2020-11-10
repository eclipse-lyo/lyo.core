package org.eclipse.lyo.oslc4j.provider.proxy;

import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.lang.reflect.Modifier;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import org.apache.jena.rdf.model.Resource;
import org.eclipse.lyo.oslc4j.core.model.IExtendedResource;
import org.eclipse.lyo.oslc4j.provider.jena.JenaModelHelper;

@SuppressWarnings("ALL")
public class OslcShapeGenerator {
    public static <T extends IExtendedResource> T newShape(Resource r, Class<? extends T> shapeClass, Class<T> shapeInterface,
            List<Class> rdfInterfaces)
            throws IntrospectionException {
//        final BeanInfo shapeBeanInfo = Introspector.getBeanInfo(shapeClass);
        if (Modifier.isAbstract(shapeClass.getModifiers())) {
            throw new IllegalArgumentException("Shape class must be concrete");
        }
        if (!shapeInterface.isInterface()) {
            throw new IllegalArgumentException("Shape interface must be a Java interface");
        }
        if(!shapeInterface.isAssignableFrom(shapeClass)) {
            throw new IllegalArgumentException("Shape interface must be assignable from a Shape class");
        }
        for (Class rdfInterface : rdfInterfaces) {
            if (!rdfInterface.isInterface()) {
                throw new IllegalArgumentException("RDF Class interfaces must be Java interfaces");
            }
        }
        final ArrayList<Class> proxyClasses = new ArrayList<>(rdfInterfaces.size() + 1);
        proxyClasses.add(shapeInterface);
        proxyClasses.addAll(rdfInterfaces);
        final T shapeBean = JenaModelHelper.unmarshal(r, shapeClass);
        final T shape = (T) Proxy.newProxyInstance(shapeInterface.getClassLoader(),
                proxyClasses.toArray(new Class[0]), (proxy, method, args) -> {
                    System.out.printf("%s called\n", method.toString());
                    return method.invoke(shapeBean, args);
                });
        return shape;
    }
}
