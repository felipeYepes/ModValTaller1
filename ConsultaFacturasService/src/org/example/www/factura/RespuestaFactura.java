/**
 * RespuestaFactura.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package org.example.www.factura;

public class RespuestaFactura  implements java.io.Serializable {
    private org.example.www.factura.Factura[] facturas;

    private org.example.www.factura.RespuestaServicio respuestaServicio;

    public RespuestaFactura() {
    }

    public RespuestaFactura(
           org.example.www.factura.Factura[] facturas,
           org.example.www.factura.RespuestaServicio respuestaServicio) {
           this.facturas = facturas;
           this.respuestaServicio = respuestaServicio;
    }


    /**
     * Gets the facturas value for this RespuestaFactura.
     * 
     * @return facturas
     */
    public org.example.www.factura.Factura[] getFacturas() {
        return facturas;
    }


    /**
     * Sets the facturas value for this RespuestaFactura.
     * 
     * @param facturas
     */
    public void setFacturas(org.example.www.factura.Factura[] facturas) {
        this.facturas = facturas;
    }

    public org.example.www.factura.Factura getFacturas(int i) {
        return this.facturas[i];
    }

    public void setFacturas(int i, org.example.www.factura.Factura _value) {
        this.facturas[i] = _value;
    }


    /**
     * Gets the respuestaServicio value for this RespuestaFactura.
     * 
     * @return respuestaServicio
     */
    public org.example.www.factura.RespuestaServicio getRespuestaServicio() {
        return respuestaServicio;
    }


    /**
     * Sets the respuestaServicio value for this RespuestaFactura.
     * 
     * @param respuestaServicio
     */
    public void setRespuestaServicio(org.example.www.factura.RespuestaServicio respuestaServicio) {
        this.respuestaServicio = respuestaServicio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaFactura)) return false;
        RespuestaFactura other = (RespuestaFactura) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.facturas==null && other.getFacturas()==null) || 
             (this.facturas!=null &&
              java.util.Arrays.equals(this.facturas, other.getFacturas()))) &&
            ((this.respuestaServicio==null && other.getRespuestaServicio()==null) || 
             (this.respuestaServicio!=null &&
              this.respuestaServicio.equals(other.getRespuestaServicio())));
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
        if (getFacturas() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getFacturas());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getFacturas(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getRespuestaServicio() != null) {
            _hashCode += getRespuestaServicio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaFactura.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.example.org/factura/", "RespuestaFactura"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("facturas");
        elemField.setXmlName(new javax.xml.namespace.QName("", "facturas"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.example.org/factura/", "Factura"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuestaServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("", "respuestaServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.example.org/factura/", "RespuestaServicio"));
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
