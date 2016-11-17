/**
 * ConsultaSaldoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.producto;

public class ConsultaSaldoRequest  implements java.io.Serializable {
    private bancoabc.www.producto.ProductoRequest requestSaldo;

    public ConsultaSaldoRequest() {
    }

    public ConsultaSaldoRequest(
           bancoabc.www.producto.ProductoRequest requestSaldo) {
           this.requestSaldo = requestSaldo;
    }


    /**
     * Gets the requestSaldo value for this ConsultaSaldoRequest.
     * 
     * @return requestSaldo
     */
    public bancoabc.www.producto.ProductoRequest getRequestSaldo() {
        return requestSaldo;
    }


    /**
     * Sets the requestSaldo value for this ConsultaSaldoRequest.
     * 
     * @param requestSaldo
     */
    public void setRequestSaldo(bancoabc.www.producto.ProductoRequest requestSaldo) {
        this.requestSaldo = requestSaldo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaSaldoRequest)) return false;
        ConsultaSaldoRequest other = (ConsultaSaldoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.requestSaldo==null && other.getRequestSaldo()==null) || 
             (this.requestSaldo!=null &&
              this.requestSaldo.equals(other.getRequestSaldo())));
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
        if (getRequestSaldo() != null) {
            _hashCode += getRequestSaldo().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaSaldoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/producto/", ">consultaSaldoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestSaldo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "requestSaldo"));
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
