//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a>
// Any modifications to this file will be lost upon recompilation of the source schema.
// Generated on: 2014.01.21 at 01:52:19 PM IST
//
package org.netbeans.jpa.modeler.spec;

import javax.lang.model.element.Element;
import javax.lang.model.element.VariableElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import org.eclipse.persistence.internal.jpa.metadata.accessors.mappings.TransientAccessor;
import org.netbeans.jpa.modeler.spec.extend.BaseAttribute;
import org.netbeans.jpa.source.JavaSourceParserUtil;
import static org.netbeans.jpa.source.Package.LANG_PACKAGE;
import org.netbeans.modeler.core.NBModelerUtil;

/**
 *
 *
 * @Target({METHOD, FIELD}) @Retention(RUNTIME) public @interface Transient {}
 *
 *
 *
 * <p>
 * Java class for transient complex type.
 *
 * <p>
 * The following schema fragment specifies the expected content contained within
 * this class.
 *
 * <pre>
 * &lt;complexType name="transient">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "transient")
public class Transient extends BaseAttribute {

    
    @XmlAttribute(name = "attribute-type", required = true)
    private String attributeType;
    
        @Override
     public String getAttributeType() {
        return attributeType;
    }

        /**
     * @param attributeType the attributeType to set
     */
    public void setAttributeType(String attributeType) {
        if (attributeType.indexOf(LANG_PACKAGE) == 0) {
            this.attributeType = attributeType.substring(LANG_PACKAGE.length() + 1);
        } else {
            this.attributeType = attributeType;
        }
    }
    
    public static Transient load(Element element, VariableElement variableElement) {
//        AnnotationMirror annotationMirror = JpaControllerUtil.findAnnotation(element, "javax.persistence.Transient");
        Transient _transient = new Transient();
        _transient.setId(NBModelerUtil.getAutoGeneratedStringId());
        _transient.name = variableElement.getSimpleName().toString();
        _transient.setAttributeType(variableElement.asType().toString());
        JavaSourceParserUtil.addNonEEAnnotation(_transient, element);
        return _transient;
    }

}