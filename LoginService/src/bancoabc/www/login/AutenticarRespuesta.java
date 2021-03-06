/**
 * AutenticarRespuesta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.login;

public class AutenticarRespuesta  implements java.io.Serializable {
    private java.lang.String valido;

    private bancoabc.www.login.EstadoServicio estadoServicio;

    public AutenticarRespuesta() {
    }

    public AutenticarRespuesta(
           java.lang.String valido,
           bancoabc.www.login.EstadoServicio estadoServicio) {
           this.valido = valido;
           this.estadoServicio = estadoServicio;
    }


    /**
     * Gets the valido value for this AutenticarRespuesta.
     * 
     * @return valido
     */
    public java.lang.String getValido() {
        return valido;
    }


    /**
     * Sets the valido value for this AutenticarRespuesta.
     * 
     * @param valido
     */
    public void setValido(java.lang.String valido) {
        this.valido = valido;
    }


    /**
     * Gets the estadoServicio value for this AutenticarRespuesta.
     * 
     * @return estadoServicio
     */
    public bancoabc.www.login.EstadoServicio getEstadoServicio() {
        return estadoServicio;
    }


    /**
     * Sets the estadoServicio value for this AutenticarRespuesta.
     * 
     * @param estadoServicio
     */
    public void setEstadoServicio(bancoabc.www.login.EstadoServicio estadoServicio) {
        this.estadoServicio = estadoServicio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutenticarRespuesta)) return false;
        AutenticarRespuesta other = (AutenticarRespuesta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.valido==null && other.getValido()==null) || 
             (this.valido!=null &&
              this.valido.equals(other.getValido()))) &&
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
        if (getValido() != null) {
            _hashCode += getValido().hashCode();
        }
        if (getEstadoServicio() != null) {
            _hashCode += getEstadoServicio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutenticarRespuesta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/login/", "autenticarRespuesta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("valido");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/login/", "valido"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("estadoServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/login/", "estadoServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/login/", "estadoServicio"));
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
