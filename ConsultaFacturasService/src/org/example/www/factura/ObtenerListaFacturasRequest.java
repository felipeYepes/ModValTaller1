/**
 * ObtenerListaFacturasRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.factura;

public class ObtenerListaFacturasRequest  implements java.io.Serializable {
    private org.example.www.factura.Factura factura;

    public ObtenerListaFacturasRequest() {
    }

    public ObtenerListaFacturasRequest(
           org.example.www.factura.Factura factura) {
           this.factura = factura;
    }


    /**
     * Gets the factura value for this ObtenerListaFacturasRequest.
     * 
     * @return factura
     */
    public org.example.www.factura.Factura getFactura() {
        return factura;
    }


    /**
     * Sets the factura value for this ObtenerListaFacturasRequest.
     * 
     * @param factura
     */
    public void setFactura(org.example.www.factura.Factura factura) {
        this.factura = factura;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObtenerListaFacturasRequest)) return false;
        ObtenerListaFacturasRequest other = (ObtenerListaFacturasRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.factura==null && other.getFactura()==null) || 
             (this.factura!=null &&
              this.factura.equals(other.getFactura())));
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
        if (getFactura() != null) {
            _hashCode += getFactura().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObtenerListaFacturasRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/factura/", ">obtenerListaFacturasRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("factura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "factura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.example.org/factura/", "Factura"));
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
