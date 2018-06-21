
package com.venki;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.venki package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _GetProductCatagories_QNAME = new QName("http://venki.com/", "getProductCatagories");
    private final static QName _AddProduct_QNAME = new QName("http://venki.com/", "addProduct");
    private final static QName _GetProductsResponse_QNAME = new QName("http://venki.com/", "getProductsResponse");
    private final static QName _AddProductResponse_QNAME = new QName("http://venki.com/", "addProductResponse");
    private final static QName _GetProductCatagoriesResponse_QNAME = new QName("http://venki.com/", "getProductCatagoriesResponse");
    private final static QName _GetProducts_QNAME = new QName("http://venki.com/", "getProducts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.venki
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AddProduct }
     * 
     */
    public AddProduct createAddProduct() {
        return new AddProduct();
    }

    /**
     * Create an instance of {@link GetProductCatagories }
     * 
     */
    public GetProductCatagories createGetProductCatagories() {
        return new GetProductCatagories();
    }

    /**
     * Create an instance of {@link AddProductResponse }
     * 
     */
    public AddProductResponse createAddProductResponse() {
        return new AddProductResponse();
    }

    /**
     * Create an instance of {@link GetProductsResponse }
     * 
     */
    public GetProductsResponse createGetProductsResponse() {
        return new GetProductsResponse();
    }

    /**
     * Create an instance of {@link GetProductCatagoriesResponse }
     * 
     */
    public GetProductCatagoriesResponse createGetProductCatagoriesResponse() {
        return new GetProductCatagoriesResponse();
    }

    /**
     * Create an instance of {@link GetProducts }
     * 
     */
    public GetProducts createGetProducts() {
        return new GetProducts();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductCatagories }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://venki.com/", name = "getProductCatagories")
    public JAXBElement<GetProductCatagories> createGetProductCatagories(GetProductCatagories value) {
        return new JAXBElement<GetProductCatagories>(_GetProductCatagories_QNAME, GetProductCatagories.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProduct }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://venki.com/", name = "addProduct")
    public JAXBElement<AddProduct> createAddProduct(AddProduct value) {
        return new JAXBElement<AddProduct>(_AddProduct_QNAME, AddProduct.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductsResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://venki.com/", name = "getProductsResponse")
    public JAXBElement<GetProductsResponse> createGetProductsResponse(GetProductsResponse value) {
        return new JAXBElement<GetProductsResponse>(_GetProductsResponse_QNAME, GetProductsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AddProductResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://venki.com/", name = "addProductResponse")
    public JAXBElement<AddProductResponse> createAddProductResponse(AddProductResponse value) {
        return new JAXBElement<AddProductResponse>(_AddProductResponse_QNAME, AddProductResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProductCatagoriesResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://venki.com/", name = "getProductCatagoriesResponse")
    public JAXBElement<GetProductCatagoriesResponse> createGetProductCatagoriesResponse(GetProductCatagoriesResponse value) {
        return new JAXBElement<GetProductCatagoriesResponse>(_GetProductCatagoriesResponse_QNAME, GetProductCatagoriesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetProducts }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://venki.com/", name = "getProducts")
    public JAXBElement<GetProducts> createGetProducts(GetProducts value) {
        return new JAXBElement<GetProducts>(_GetProducts_QNAME, GetProducts.class, null, value);
    }

}
