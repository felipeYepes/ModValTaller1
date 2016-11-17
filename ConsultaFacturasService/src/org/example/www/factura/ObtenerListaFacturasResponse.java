/**
 * ObtenerListaFacturasResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.factura;

public class ObtenerListaFacturasResponse  implements java.io.Serializable {
    private org.example.www.factura.RespuestaFactura respuestaFactura;

    public ObtenerListaFacturasResponse() {
    }

    public ObtenerListaFacturasResponse(
           org.example.www.factura.RespuestaFactura respuestaFactura) {
           this.respuestaFactura = respuestaFactura;
    }


    /**
     * Gets the respuestaFactura value for this ObtenerListaFacturasResponse.
     * 
     * @return respuestaFactura
     */
    public org.example.www.factura.RespuestaFactura getRespuestaFactura() {
        return respuestaFactura;
    }


    /**
     * Sets the respuestaFactura value for this ObtenerListaFacturasResponse.
     * 
     * @param respuestaFactura
     */
    public void setRespuestaFactura(org.example.www.factura.RespuestaFactura respuestaFactura) {
        this.respuestaFactura = respuestaFactura;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ObtenerListaFacturasResponse)) return false;
        ObtenerListaFacturasResponse other = (ObtenerListaFacturasResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.respuestaFactura==null && other.getRespuestaFactura()==null) || 
             (this.respuestaFactura!=null &&
              this.respuestaFactura.equals(other.getRespuestaFactura())));
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
        if (getRespuestaFactura() != null) {
            _hashCode += getRespuestaFactura().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ObtenerListaFacturasResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/factura/", ">obtenerListaFacturasResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuestaFactura");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respuestaFactura"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.example.org/factura/", "RespuestaFactura"));
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
