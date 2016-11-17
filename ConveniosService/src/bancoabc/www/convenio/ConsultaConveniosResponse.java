/**
 * ConsultaConveniosResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.convenio;

public class ConsultaConveniosResponse  implements java.io.Serializable {
    private bancoabc.www.convenio.ConvenioRespuesta convenioResp;

    public ConsultaConveniosResponse() {
    }

    public ConsultaConveniosResponse(
           bancoabc.www.convenio.ConvenioRespuesta convenioResp) {
           this.convenioResp = convenioResp;
    }


    /**
     * Gets the convenioResp value for this ConsultaConveniosResponse.
     * 
     * @return convenioResp
     */
    public bancoabc.www.convenio.ConvenioRespuesta getConvenioResp() {
        return convenioResp;
    }


    /**
     * Sets the convenioResp value for this ConsultaConveniosResponse.
     * 
     * @param convenioResp
     */
    public void setConvenioResp(bancoabc.www.convenio.ConvenioRespuesta convenioResp) {
        this.convenioResp = convenioResp;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ConsultaConveniosResponse)) return false;
        ConsultaConveniosResponse other = (ConsultaConveniosResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.convenioResp==null && other.getConvenioResp()==null) || 
             (this.convenioResp!=null &&
              this.convenioResp.equals(other.getConvenioResp())));
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
        if (getConvenioResp() != null) {
            _hashCode += getConvenioResp().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ConsultaConveniosResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/convenio/", ">consultaConveniosResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("convenioResp");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/convenio/", "convenioResp"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/convenio/", "ConvenioRespuesta"));
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
