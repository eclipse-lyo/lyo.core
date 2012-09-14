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
 *     Steve Pitschke  - initial API and implementation
 *******************************************************************************/

using System;
using System.Diagnostics;
using System.Net;
using System.Net.Http;
using System.Net.Http.Formatting;
using System.Net.Http.Headers;
using System.IO;
using System.Text;
using System.Collections.Generic;
using System.Linq;

using Microsoft.VisualStudio.TestTools.UnitTesting;

using Org.Eclipse.Lyo.ChangeManagement;
using Org.Eclipse.Lyo.Core.DotNetRdfProvider;
using Org.Eclipse.Lyo.Core.Model;

namespace DotNetRdfProviderTests
{
    [TestClass]
    public class RdfXmlMediaTypeFormatterTests
    {
        [TestMethod]
        public void TestXmlRdfSerialization()
        {
            ChangeRequest changeRequest1 = new ChangeRequest(new Uri("http://com/somewhere/changeReuest"));

            changeRequest1.SetFixed(true);
            changeRequest1.AddAffectedByDefect(new Link(new Uri("http://com/somewhere/changeRequest2"), "Test of links"));

            RdfXmlMediaTypeFormatter formatter = new RdfXmlMediaTypeFormatter();

            string rdfXml = Serialize<ChangeRequest>(formatter, changeRequest1);

            Debug.WriteLine(rdfXml);

            ChangeRequest changeRequest2 = Deserialize<ChangeRequest>(formatter, rdfXml);

            Assert.AreEqual(changeRequest1, changeRequest2);
        }

        // dotNetRdf RdfXmlWriter and RdfXmlParser close the stream after writing, which doesn't
        // work for Serialize() and Deserialize() memory streams below.
        private class MyMemoryStream : MemoryStream
        {
            public override void Close() { }
        }

        private string Serialize<T>(MediaTypeFormatter formatter, T value)
        {
            Stream stream = new MyMemoryStream();
            var content = new StreamContent(stream);

            formatter.WriteToStreamAsync(typeof(T), value, stream, content, null).Wait();
            stream.Position = 0;

            return content.ReadAsStringAsync().Result;
        }

        private T Deserialize<T>(MediaTypeFormatter formatter, string str) where T : class
        {
            Stream stream = new MyMemoryStream();
            StreamWriter writer = new StreamWriter(stream);

            writer.Write(str);
            writer.Flush();

            stream.Position = 0;

            return formatter.ReadFromStreamAsync(typeof(T), stream, null, null).Result as T;
        }
    }
}
