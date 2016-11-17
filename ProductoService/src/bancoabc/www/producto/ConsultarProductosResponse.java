/**
 * ConsultarProductosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.producto;

public class ConsultarProductosResponse  implements java.io.Serializable {
    private bancoabc.www.producto.ProductoResponse productoResponse;

    public ConsultarProductosResponse() {
    }

    public ConsultarProductosResponse(
           bancoabc.www.producto.ProductoResponse productoResponse) {
           this.productoResponse = productoResponse;
    }


    /**
     * Gets the productoResponse value for this ConsultarProductosResponse.
     * 
     * @return productoResponse
     */
    public bancoabc.www.producto.ProductoResponse getProductoResponse() {
        return productoResponse;
    }


    /**
     * Sets the productoResponse value for this ConsultarProductosResponse.
     * 
     * @param productoResponse
     */
    public void setProductoResponse(bancoabc.www.producto.ProductoResponse productoResponse) {
        this.productoResponse = productoResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultarProductosResponse)) return false;
        ConsultarProductosResponse other = (ConsultarProductosResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.productoResponse==null && other.getProductoResponse()==null) || 
             (this.productoResponse!=null &&
              this.productoResponse.equals(other.getProductoResponse())));
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
        if (getProductoResponse() != null) {
            _hashCode += getProductoResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultarProductosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/producto/", ">consultarProductosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productoResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "productoResponse"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "productoResponse"));
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
