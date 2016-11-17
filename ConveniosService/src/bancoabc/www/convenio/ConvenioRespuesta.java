/**
 * ConvenioRespuesta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.convenio;

public class ConvenioRespuesta  implements java.io.Serializable {
    private bancoabc.www.convenio.RespuestaServicio respuestaServicio;

    private bancoabc.www.convenio.Convenio[] convenios;

    public ConvenioRespuesta() {
    }

    public ConvenioRespuesta(
           bancoabc.www.convenio.RespuestaServicio respuestaServicio,
           bancoabc.www.convenio.Convenio[] convenios) {
           this.respuestaServicio = respuestaServicio;
           this.convenios = convenios;
    }


    /**
     * Gets the respuestaServicio value for this ConvenioRespuesta.
     * 
     * @return respuestaServicio
     */
    public bancoabc.www.convenio.RespuestaServicio getRespuestaServicio() {
        return respuestaServicio;
    }


    /**
     * Sets the respuestaServicio value for this ConvenioRespuesta.
     * 
     * @param respuestaServicio
     */
    public void setRespuestaServicio(bancoabc.www.convenio.RespuestaServicio respuestaServicio) {
        this.respuestaServicio = respuestaServicio;
    }


    /**
     * Gets the convenios value for this ConvenioRespuesta.
     * 
     * @return convenios
     */
    public bancoabc.www.convenio.Convenio[] getConvenios() {
        return convenios;
    }


    /**
     * Sets the convenios value for this ConvenioRespuesta.
     * 
     * @param convenios
     */
    public void setConvenios(bancoabc.www.convenio.Convenio[] convenios) {
        this.convenios = convenios;
    }

    public bancoabc.www.convenio.Convenio getConvenios(int i) {
        return this.convenios[i];
    }

    public void setConvenios(int i, bancoabc.www.convenio.Convenio _value) {
        this.convenios[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConvenioRespuesta)) return false;
        ConvenioRespuesta other = (ConvenioRespuesta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.respuestaServicio==null && other.getRespuestaServicio()==null) || 
             (this.respuestaServicio!=null &&
              this.respuestaServicio.equals(other.getRespuestaServicio()))) &&
            ((this.convenios==null && other.getConvenios()==null) || 
             (this.convenios!=null &&
              java.util.Arrays.equals(this.convenios, other.getConvenios())));
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
        if (getRespuestaServicio() != null) {
            _hashCode += getRespuestaServicio().hashCode();
        }
        if (getConvenios() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getConvenios());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getConvenios(), i);
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
        new org.apache.axis.description.TypeDesc(ConvenioRespuesta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/convenio/", "ConvenioRespuesta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuestaServicio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/convenio/", "respuestaServicio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/convenio/", "RespuestaServicio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convenios");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/convenio/", "convenios"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/convenio/", "Convenio"));
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
