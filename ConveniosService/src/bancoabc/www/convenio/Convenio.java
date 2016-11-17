/**
 * Convenio.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.convenio;

public class Convenio  implements java.io.Serializable {
    private java.lang.String codigoConvenio;

    private java.lang.String nombreConvenio;

    private java.lang.String idReferenciaPago;

    private java.lang.String fechaLimite;

    public Convenio() {
    }

    public Convenio(
           java.lang.String codigoConvenio,
           java.lang.String nombreConvenio,
           java.lang.String idReferenciaPago,
           java.lang.String fechaLimite) {
           this.codigoConvenio = codigoConvenio;
           this.nombreConvenio = nombreConvenio;
           this.idReferenciaPago = idReferenciaPago;
           this.fechaLimite = fechaLimite;
    }


    /**
     * Gets the codigoConvenio value for this Convenio.
     * 
     * @return codigoConvenio
     */
    public java.lang.String getCodigoConvenio() {
        return codigoConvenio;
    }


    /**
     * Sets the codigoConvenio value for this Convenio.
     * 
     * @param codigoConvenio
     */
    public void setCodigoConvenio(java.lang.String codigoConvenio) {
        this.codigoConvenio = codigoConvenio;
    }


    /**
     * Gets the nombreConvenio value for this Convenio.
     * 
     * @return nombreConvenio
     */
    public java.lang.String getNombreConvenio() {
        return nombreConvenio;
    }


    /**
     * Sets the nombreConvenio value for this Convenio.
     * 
     * @param nombreConvenio
     */
    public void setNombreConvenio(java.lang.String nombreConvenio) {
        this.nombreConvenio = nombreConvenio;
    }


    /**
     * Gets the idReferenciaPago value for this Convenio.
     * 
     * @return idReferenciaPago
     */
    public java.lang.String getIdReferenciaPago() {
        return idReferenciaPago;
    }


    /**
     * Sets the idReferenciaPago value for this Convenio.
     * 
     * @param idReferenciaPago
     */
    public void setIdReferenciaPago(java.lang.String idReferenciaPago) {
        this.idReferenciaPago = idReferenciaPago;
    }


    /**
     * Gets the fechaLimite value for this Convenio.
     * 
     * @return fechaLimite
     */
    public java.lang.String getFechaLimite() {
        return fechaLimite;
    }


    /**
     * Sets the fechaLimite value for this Convenio.
     * 
     * @param fechaLimite
     */
    public void setFechaLimite(java.lang.String fechaLimite) {
        this.fechaLimite = fechaLimite;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Convenio)) return false;
        Convenio other = (Convenio) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoConvenio==null && other.getCodigoConvenio()==null) || 
             (this.codigoConvenio!=null &&
              this.codigoConvenio.equals(other.getCodigoConvenio()))) &&
            ((this.nombreConvenio==null && other.getNombreConvenio()==null) || 
             (this.nombreConvenio!=null &&
              this.nombreConvenio.equals(other.getNombreConvenio()))) &&
            ((this.idReferenciaPago==null && other.getIdReferenciaPago()==null) || 
             (this.idReferenciaPago!=null &&
              this.idReferenciaPago.equals(other.getIdReferenciaPago()))) &&
            ((this.fechaLimite==null && other.getFechaLimite()==null) || 
             (this.fechaLimite!=null &&
              this.fechaLimite.equals(other.getFechaLimite())));
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
        if (getCodigoConvenio() != null) {
            _hashCode += getCodigoConvenio().hashCode();
        }
        if (getNombreConvenio() != null) {
            _hashCode += getNombreConvenio().hashCode();
        }
        if (getIdReferenciaPago() != null) {
            _hashCode += getIdReferenciaPago().hashCode();
        }
        if (getFechaLimite() != null) {
            _hashCode += getFechaLimite().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Convenio.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/convenio/", "Convenio"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoConvenio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/convenio/", "codigoConvenio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreConvenio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/convenio/", "nombreConvenio"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idReferenciaPago");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/convenio/", "idReferenciaPago"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fechaLimite");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/convenio/", "fechaLimite"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
