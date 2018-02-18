/**
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.camel.dataformat.soap.springboot;

import javax.annotation.Generated;
import org.apache.camel.spring.boot.DataFormatConfigurationPropertiesCommon;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * SOAP is a data format which uses JAXB2 and JAX-WS annotations to marshal and
 * unmarshal SOAP payloads.
 * 
 * Generated by camel-package-maven-plugin - do not edit this file!
 */
@Generated("org.apache.camel.maven.packaging.SpringBootAutoConfigurationMojo")
@ConfigurationProperties(prefix = "camel.dataformat.soapjaxb")
public class SoapJaxbDataFormatConfiguration
        extends
            DataFormatConfigurationPropertiesCommon {

    /**
     * Package name where your JAXB classes are located.
     */
    private String contextPath;
    /**
     * To overrule and use a specific encoding
     */
    private String encoding;
    /**
     * Refers to an element strategy to lookup from the registry. An element
     * name strategy is used for two purposes. The first is to find a xml
     * element name for a given object and soap action when marshaling the
     * object into a SOAP message. The second is to find an Exception class for
     * a given soap fault name. The following three element strategy class name
     * is provided out of the box. QNameStrategy - Uses a fixed qName that is
     * configured on instantiation. Exception lookup is not supported
     * TypeNameStrategy - Uses the name and namespace from the XMLType
     * annotation of the given type. If no namespace is set then package-info is
     * used. Exception lookup is not supported ServiceInterfaceStrategy - Uses
     * information from a webservice interface to determine the type name and to
     * find the exception class for a SOAP fault All three classes is located in
     * the package name org.apache.camel.dataformat.soap.name If you have
     * generated the web service stub code with cxf-codegen or a similar tool
     * then you probably will want to use the ServiceInterfaceStrategy. In the
     * case you have no annotated service interface you should use QNameStrategy
     * or TypeNameStrategy.
     */
    private String elementNameStrategyRef;
    /**
     * SOAP version should either be 1.1 or 1.2. Is by default 1.1
     */
    private String version = "1.1";
    /**
     * When marshalling using JAXB or SOAP then the JAXB implementation will
     * automatic assign namespace prefixes, such as ns2, ns3, ns4 etc. To
     * control this mapping, Camel allows you to refer to a map which contains
     * the desired mapping.
     */
    private String namespacePrefixRef;
    /**
     * To validate against an existing schema. Your can use the prefix
     * classpath:, file: or http: to specify how the resource should by
     * resolved. You can separate multiple schema files by using the ','
     * character.
     */
    private String schema;
    /**
     * Whether the data format should set the Content-Type header with the type
     * from the data format if the data format is capable of doing so. For
     * example application/xml for data formats marshalling to XML, or
     * application/json for data formats marshalling to JSon etc.
     */
    private Boolean contentTypeHeader = false;

    public String getContextPath() {
        return contextPath;
    }

    public void setContextPath(String contextPath) {
        this.contextPath = contextPath;
    }

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public String getElementNameStrategyRef() {
        return elementNameStrategyRef;
    }

    public void setElementNameStrategyRef(String elementNameStrategyRef) {
        this.elementNameStrategyRef = elementNameStrategyRef;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getNamespacePrefixRef() {
        return namespacePrefixRef;
    }

    public void setNamespacePrefixRef(String namespacePrefixRef) {
        this.namespacePrefixRef = namespacePrefixRef;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public Boolean getContentTypeHeader() {
        return contentTypeHeader;
    }

    public void setContentTypeHeader(Boolean contentTypeHeader) {
        this.contentTypeHeader = contentTypeHeader;
    }
}