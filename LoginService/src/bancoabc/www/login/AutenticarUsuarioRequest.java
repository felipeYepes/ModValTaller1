/**
 * AutenticarUsuarioRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.login;

public class AutenticarUsuarioRequest  implements java.io.Serializable {
    private bancoabc.www.login.AutenticarRequest respuestaAutenticacion;

    public AutenticarUsuarioRequest() {
    }

    public AutenticarUsuarioRequest(
           bancoabc.www.login.AutenticarRequest respuestaAutenticacion) {
           this.respuestaAutenticacion = respuestaAutenticacion;
    }


    /**
     * Gets the respuestaAutenticacion value for this AutenticarUsuarioRequest.
     * 
     * @return respuestaAutenticacion
     */
    public bancoabc.www.login.AutenticarRequest getRespuestaAutenticacion() {
        return respuestaAutenticacion;
    }


    /**
     * Sets the respuestaAutenticacion value for this AutenticarUsuarioRequest.
     * 
     * @param respuestaAutenticacion
     */
    public void setRespuestaAutenticacion(bancoabc.www.login.AutenticarRequest respuestaAutenticacion) {
        this.respuestaAutenticacion = respuestaAutenticacion;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AutenticarUsuarioRequest)) return false;
        AutenticarUsuarioRequest other = (AutenticarUsuarioRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.respuestaAutenticacion==null && other.getRespuestaAutenticacion()==null) || 
             (this.respuestaAutenticacion!=null &&
              this.respuestaAutenticacion.equals(other.getRespuestaAutenticacion())));
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
        if (getRespuestaAutenticacion() != null) {
            _hashCode += getRespuestaAutenticacion().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AutenticarUsuarioRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/login/", ">autenticarUsuarioRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuestaAutenticacion");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/login/", "respuestaAutenticacion"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/login/", "autenticarRequest"));
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