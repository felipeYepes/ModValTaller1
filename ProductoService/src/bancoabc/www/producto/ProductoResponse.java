/**
 * ProductoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.producto;

public class ProductoResponse  implements java.io.Serializable {
    private bancoabc.www.producto.ResultadoServicio resultadoServicio;

    private bancoabc.www.producto.Producto[] productos;

    public ProductoResponse() {
    }

    public ProductoResponse(
           bancoabc.www.producto.ResultadoServicio resultadoServicio,
           bancoabc.www.producto.Producto[] productos) {
           this.resultadoServicio = resultadoServicio;
           this.productos = productos;
    }


    /**
     * Gets the resultadoServicio value for this ProductoResponse.
     * 
     * @return resultadoServicio
     */
    public bancoabc.www.producto.ResultadoServicio getResultadoServicio() {
        return resultadoServicio;
    }


    /**
     * Sets the resultadoServicio value for this ProductoResponse.
     * 
     * @param resultadoServicio
     */
    public void setResultadoServicio(bancoabc.www.producto.ResultadoServicio resultadoServicio) {
        this.resultadoServicio = resultadoServicio;
    }


    /**
     * Gets the productos value for this ProductoResponse.
     * 
     * @return productos
     */
    public bancoabc.www.producto.Producto[] getProductos() {
        return productos;
    }


    /**
     * Sets the productos value for this ProductoResponse.
     * 
     * @param productos
     */
    public void setProductos(bancoabc.www.producto.Producto[] productos) {
        this.productos = productos;
    }

    public bancoabc.www.producto.Producto getProductos(int i) {
        return this.productos[i];
    }

    public void setProductos(int i, bancoabc.www.producto.Producto _value) {
        this.productos[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductoResponse)) return false;
        ProductoResponse other = (ProductoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.resultadoServicio==null && other.getResultadoServicio()==null) || 
             (this.resultadoServicio!=null &&
              this.resultadoServicio.equals(other.getResultadoServicio()))) &&
            ((this.productos==null && other.getProductos()==null) || 
             (this.productos!=null &&
              java.util.Arrays.equals(this.productos, other.getProductos())));
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
        if (getResultadoServicio() != null) {
            _hashCode += getResultadoServicio().hashCode();
        }
        if (getProductos() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProductos());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProductos(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "productoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("resultadoServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "resultadoServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "resultadoServicio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("productos");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "productos"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "Producto"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
