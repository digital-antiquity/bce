//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.01.18 at 09:17:02 AM MST 
//

package topicmap.v2_0;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the topicmap package.
 * <p>
 * An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups. Factory methods for each of these are
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Value_QNAME = new QName("http://www.topicmaps.org/xtm/", "value");
    private final static QName _ResourceData_QNAME = new QName("http://www.topicmaps.org/xtm/", "resourceData");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: topicmap
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Role }
     * 
     */
    public Role createRole() {
        return new Role();
    }

    /**
     * Create an instance of {@link ItemIdentity }
     * 
     */
    public ItemIdentity createItemIdentity() {
        return new ItemIdentity();
    }

    /**
     * Create an instance of {@link Type }
     * 
     */
    public Type createType() {
        return new Type();
    }

    /**
     * Create an instance of {@link TopicRef }
     * 
     */
    public TopicRef createTopicRef() {
        return new TopicRef();
    }

    /**
     * Create an instance of {@link Association }
     * 
     */
    public Association createAssociation() {
        return new Association();
    }

    /**
     * Create an instance of {@link Scope }
     * 
     */
    public Scope createScope() {
        return new Scope();
    }

    /**
     * Create an instance of {@link Occurrence }
     * 
     */
    public Occurrence createOccurrence() {
        return new Occurrence();
    }

    /**
     * Create an instance of {@link ResourceRef }
     * 
     */
    public ResourceRef createResourceRef() {
        return new ResourceRef();
    }

    /**
     * Create an instance of {@link AnyMarkup }
     * 
     */
    public AnyMarkup createAnyMarkup() {
        return new AnyMarkup();
    }

    /**
     * Create an instance of {@link InstanceOf }
     * 
     */
    public InstanceOf createInstanceOf() {
        return new InstanceOf();
    }

    /**
     * Create an instance of {@link SubjectIdentifier }
     * 
     */
    public SubjectIdentifier createSubjectIdentifier() {
        return new SubjectIdentifier();
    }

    /**
     * Create an instance of {@link Name }
     * 
     */
    public Name createName() {
        return new Name();
    }

    /**
     * Create an instance of {@link Variant }
     * 
     */
    public Variant createVariant() {
        return new Variant();
    }

    /**
     * Create an instance of {@link Topic }
     * 
     */
    public Topic createTopic() {
        return new Topic();
    }

    /**
     * Create an instance of {@link SubjectLocator }
     * 
     */
    public SubjectLocator createSubjectLocator() {
        return new SubjectLocator();
    }

    /**
     * Create an instance of {@link MergeMap }
     * 
     */
    public MergeMap createMergeMap() {
        return new MergeMap();
    }

    /**
     * Create an instance of {@link TopicMap }
     * 
     */
    public TopicMap createTopicMap() {
        return new TopicMap();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topicmaps.org/xtm/", name = "value")
    public JAXBElement<String> createValue(String value) {
        return new JAXBElement<String>(_Value_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AnyMarkup }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.topicmaps.org/xtm/", name = "resourceData")
    public JAXBElement<AnyMarkup> createResourceData(AnyMarkup value) {
        return new JAXBElement<AnyMarkup>(_ResourceData_QNAME, AnyMarkup.class, null, value);
    }

}
