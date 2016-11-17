/**
 * ConsultarProductosRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.producto;

public class ConsultarProductosRequest  implements java.io.Serializable {
    private bancoabc.www.producto.ProductoRequest productoRequest;

    public ConsultarProductosRequest() {
    }

    public ConsultarProductosRequest(
           bancoabc.www.producto.ProductoRequest productoRequest) {
           this.productoRequest = productoRequest;
    }


    /**
     * Gets the productoRequest value for this ConsultarProductosRequest.
     * 
     * @return productoRequest
     */
    public bancoabc.www.producto.ProductoRequest getProductoRequest() {
        return productoRequest;
    }


    /**
     * Sets the productoRequest value for this ConsultarProductosRequest.
     * 
     * @param productoRequest
     */
    public void setProductoRequest(bancoabc.www.producto.ProductoRequest productoRequest) {
        this.productoRequest = productoRequest;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarProductosRequest)) return false;
        ConsultarProductosRequest other = (ConsultarProductosRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productoRequest==null && other.getProductoRequest()==null) || 
             (this.productoRequest!=null &&
              this.productoRequest.equals(other.getProductoRequest())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getProductoRequest() != null) {
            _hashCode += getProductoRequest().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarProductosRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/producto/", ">consultarProductosRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productoRequest");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "productoRequest"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "productoRequest"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
