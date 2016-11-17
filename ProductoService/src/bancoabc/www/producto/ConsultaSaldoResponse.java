/**
 * ConsultaSaldoResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.producto;

public class ConsultaSaldoResponse  implements java.io.Serializable {
    private bancoabc.www.producto.ProductoResponse saldosResponse;

    public ConsultaSaldoResponse() {
    }

    public ConsultaSaldoResponse(
           bancoabc.www.producto.ProductoResponse saldosResponse) {
           this.saldosResponse = saldosResponse;
    }


    /**
     * Gets the saldosResponse value for this ConsultaSaldoResponse.
     * 
     * @return saldosResponse
     */
    public bancoabc.www.producto.ProductoResponse getSaldosResponse() {
        return saldosResponse;
    }


    /**
     * Sets the saldosResponse value for this ConsultaSaldoResponse.
     * 
     * @param saldosResponse
     */
    public void setSaldosResponse(bancoabc.www.producto.ProductoResponse saldosResponse) {
        this.saldosResponse = saldosResponse;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaSaldoResponse)) return false;
        ConsultaSaldoResponse other = (ConsultaSaldoResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.saldosResponse==null && other.getSaldosResponse()==null) || 
             (this.saldosResponse!=null &&
              this.saldosResponse.equals(other.getSaldosResponse())));
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
        if (getSaldosResponse() != null) {
            _hashCode += getSaldosResponse().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaSaldoResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/producto/", ">consultaSaldoResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldosResponse");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "SaldosResponse"));
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
