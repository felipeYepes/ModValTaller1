/**
 * ValidarClienteRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.cliente;

public class ValidarClienteRequest  implements java.io.Serializable {
    private bancoabc.www.cliente.ValidaClienteRequest validaCliente;

    public ValidarClienteRequest() {
    }

    public ValidarClienteRequest(
           bancoabc.www.cliente.ValidaClienteRequest validaCliente) {
           this.validaCliente = validaCliente;
    }


    /**
     * Gets the validaCliente value for this ValidarClienteRequest.
     * 
     * @return validaCliente
     */
    public bancoabc.www.cliente.ValidaClienteRequest getValidaCliente() {
        return validaCliente;
    }


    /**
     * Sets the validaCliente value for this ValidarClienteRequest.
     * 
     * @param validaCliente
     */
    public void setValidaCliente(bancoabc.www.cliente.ValidaClienteRequest validaCliente) {
        this.validaCliente = validaCliente;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ValidarClienteRequest)) return false;
        ValidarClienteRequest other = (ValidarClienteRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.validaCliente==null && other.getValidaCliente()==null) || 
             (this.validaCliente!=null &&
              this.validaCliente.equals(other.getValidaCliente())));
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
        if (getValidaCliente() != null) {
            _hashCode += getValidaCliente().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ValidarClienteRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/cliente/", ">validarClienteRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("validaCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/cliente/", "validaCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/cliente/", "ValidaClienteRequest"));
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
