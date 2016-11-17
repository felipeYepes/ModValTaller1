/**
 * RespuestaCliente.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.cliente;

public class RespuestaCliente  implements java.io.Serializable {
    private boolean clienteExiste;

    private bancoabc.www.cliente.ResultadoServicio estadoServicio;

    public RespuestaCliente() {
    }

    public RespuestaCliente(
           boolean clienteExiste,
           bancoabc.www.cliente.ResultadoServicio estadoServicio) {
           this.clienteExiste = clienteExiste;
           this.estadoServicio = estadoServicio;
    }


    /**
     * Gets the clienteExiste value for this RespuestaCliente.
     * 
     * @return clienteExiste
     */
    public boolean isClienteExiste() {
        return clienteExiste;
    }


    /**
     * Sets the clienteExiste value for this RespuestaCliente.
     * 
     * @param clienteExiste
     */
    public void setClienteExiste(boolean clienteExiste) {
        this.clienteExiste = clienteExiste;
    }


    /**
     * Gets the estadoServicio value for this RespuestaCliente.
     * 
     * @return estadoServicio
     */
    public bancoabc.www.cliente.ResultadoServicio getEstadoServicio() {
        return estadoServicio;
    }


    /**
     * Sets the estadoServicio value for this RespuestaCliente.
     * 
     * @param estadoServicio
     */
    public void setEstadoServicio(bancoabc.www.cliente.ResultadoServicio estadoServicio) {
        this.estadoServicio = estadoServicio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof RespuestaCliente)) return false;
        RespuestaCliente other = (RespuestaCliente) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            this.clienteExiste == other.isClienteExiste() &&
            ((this.estadoServicio==null && other.getEstadoServicio()==null) || 
             (this.estadoServicio!=null &&
              this.estadoServicio.equals(other.getEstadoServicio())));
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
        _hashCode += (isClienteExiste() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        if (getEstadoServicio() != null) {
            _hashCode += getEstadoServicio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RespuestaCliente.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/cliente/", "RespuestaCliente"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("clienteExiste");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/cliente/", "clienteExiste"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/cliente/", "estadoServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/cliente/", "ResultadoServicio"));
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
