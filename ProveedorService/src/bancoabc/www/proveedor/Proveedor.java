/**
 * Proveedor.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.proveedor;

public class Proveedor  implements java.io.Serializable {
    private java.lang.String codigoProveedor;

    private java.lang.String nombreProveedor;

    private java.lang.String codigoConvenio;

    public Proveedor() {
    }

    public Proveedor(
           java.lang.String codigoProveedor,
           java.lang.String nombreProveedor,
           java.lang.String codigoConvenio) {
           this.codigoProveedor = codigoProveedor;
           this.nombreProveedor = nombreProveedor;
           this.codigoConvenio = codigoConvenio;
    }


    /**
     * Gets the codigoProveedor value for this Proveedor.
     * 
     * @return codigoProveedor
     */
    public java.lang.String getCodigoProveedor() {
        return codigoProveedor;
    }


    /**
     * Sets the codigoProveedor value for this Proveedor.
     * 
     * @param codigoProveedor
     */
    public void setCodigoProveedor(java.lang.String codigoProveedor) {
        this.codigoProveedor = codigoProveedor;
    }


    /**
     * Gets the nombreProveedor value for this Proveedor.
     * 
     * @return nombreProveedor
     */
    public java.lang.String getNombreProveedor() {
        return nombreProveedor;
    }


    /**
     * Sets the nombreProveedor value for this Proveedor.
     * 
     * @param nombreProveedor
     */
    public void setNombreProveedor(java.lang.String nombreProveedor) {
        this.nombreProveedor = nombreProveedor;
    }


    /**
     * Gets the codigoConvenio value for this Proveedor.
     * 
     * @return codigoConvenio
     */
    public java.lang.String getCodigoConvenio() {
        return codigoConvenio;
    }


    /**
     * Sets the codigoConvenio value for this Proveedor.
     * 
     * @param codigoConvenio
     */
    public void setCodigoConvenio(java.lang.String codigoConvenio) {
        this.codigoConvenio = codigoConvenio;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Proveedor)) return false;
        Proveedor other = (Proveedor) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.codigoProveedor==null && other.getCodigoProveedor()==null) || 
             (this.codigoProveedor!=null &&
              this.codigoProveedor.equals(other.getCodigoProveedor()))) &&
            ((this.nombreProveedor==null && other.getNombreProveedor()==null) || 
             (this.nombreProveedor!=null &&
              this.nombreProveedor.equals(other.getNombreProveedor()))) &&
            ((this.codigoConvenio==null && other.getCodigoConvenio()==null) || 
             (this.codigoConvenio!=null &&
              this.codigoConvenio.equals(other.getCodigoConvenio())));
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
        if (getCodigoProveedor() != null) {
            _hashCode += getCodigoProveedor().hashCode();
        }
        if (getNombreProveedor() != null) {
            _hashCode += getNombreProveedor().hashCode();
        }
        if (getCodigoConvenio() != null) {
            _hashCode += getCodigoConvenio().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Proveedor.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "Proveedor"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoProveedor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "codigoProveedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreProveedor");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "nombreProveedor"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("codigoConvenio");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "codigoConvenio"));
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
