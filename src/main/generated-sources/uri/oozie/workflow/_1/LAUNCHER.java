//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.3.0 
// See <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.01.04 at 02:58:57 PM CST 
//


package uri.oozie.workflow._1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for LAUNCHER complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="LAUNCHER"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice maxOccurs="unbounded"&gt;
 *         &lt;element name="memory.mb" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="vcores" type="{http://www.w3.org/2001/XMLSchema}unsignedInt" minOccurs="0"/&gt;
 *         &lt;element name="java-opts" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="env" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="queue" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="sharelib" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="view-acl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="modify-acl" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "LAUNCHER", propOrder = {
    "memoryMbOrVcoresOrJavaOpts"
})
public class LAUNCHER {

    @XmlElementRefs({
        @XmlElementRef(name = "memory.mb", namespace = "uri:oozie:workflow:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "vcores", namespace = "uri:oozie:workflow:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "java-opts", namespace = "uri:oozie:workflow:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "env", namespace = "uri:oozie:workflow:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "queue", namespace = "uri:oozie:workflow:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "sharelib", namespace = "uri:oozie:workflow:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "view-acl", namespace = "uri:oozie:workflow:1.0", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "modify-acl", namespace = "uri:oozie:workflow:1.0", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<? extends Serializable>> memoryMbOrVcoresOrJavaOpts;

    /**
     * Gets the value of the memoryMbOrVcoresOrJavaOpts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the memoryMbOrVcoresOrJavaOpts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMemoryMbOrVcoresOrJavaOpts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link Long }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<? extends Serializable>> getMemoryMbOrVcoresOrJavaOpts() {
        if (memoryMbOrVcoresOrJavaOpts == null) {
            memoryMbOrVcoresOrJavaOpts = new ArrayList<JAXBElement<? extends Serializable>>();
        }
        return this.memoryMbOrVcoresOrJavaOpts;
    }

}
