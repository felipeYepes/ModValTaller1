/**
 * ProductoRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.producto;

public class ProductoRequest  implements java.io.Serializable {
    private java.lang.String idCliente;

    private java.lang.String tipoProducto;

    private java.lang.String numeroProducto;

    public ProductoRequest() {
    }

    public ProductoRequest(
           java.lang.String idCliente,
           java.lang.String tipoProducto,
           java.lang.String numeroProducto) {
           this.idCliente = idCliente;
           this.tipoProducto = tipoProducto;
           this.numeroProducto = numeroProducto;
    }


    /**
     * Gets the idCliente value for this ProductoRequest.
     * 
     * @return idCliente
     */
    public java.lang.String getIdCliente() {
        return idCliente;
    }


    /**
     * Sets the idCliente value for this ProductoRequest.
     * 
     * @param idCliente
     */
    public void setIdCliente(java.lang.String idCliente) {
        this.idCliente = idCliente;
    }


    /**
     * Gets the tipoProducto value for this ProductoRequest.
     * 
     * @return tipoProducto
     */
    public java.lang.String getTipoProducto() {
        return tipoProducto;
    }


    /**
     * Sets the tipoProducto value for this ProductoRequest.
     * 
     * @param tipoProducto
     */
    public void setTipoProducto(java.lang.String tipoProducto) {
        this.tipoProducto = tipoProducto;
    }


    /**
     * Gets the numeroProducto value for this ProductoRequest.
     * 
     * @return numeroProducto
     */
    public java.lang.String getNumeroProducto() {
        return numeroProducto;
    }


    /**
     * Sets the numeroProducto value for this ProductoRequest.
     * 
     * @param numeroProducto
     */
    public void setNumeroProducto(java.lang.String numeroProducto) {
        this.numeroProducto = numeroProducto;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProductoRequest)) return false;
        ProductoRequest other = (ProductoRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.idCliente==null && other.getIdCliente()==null) || 
             (this.idCliente!=null &&
              this.idCliente.equals(other.getIdCliente()))) &&
            ((this.tipoProducto==null && other.getTipoProducto()==null) || 
             (this.tipoProducto!=null &&
              this.tipoProducto.equals(other.getTipoProducto()))) &&
            ((this.numeroProducto==null && other.getNumeroProducto()==null) || 
             (this.numeroProducto!=null &&
              this.numeroProducto.equals(other.getNumeroProducto())));
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
        if (getIdCliente() != null) {
            _hashCode += getIdCliente().hashCode();
        }
        if (getTipoProducto() != null) {
            _hashCode += getTipoProducto().hashCode();
        }
        if (getNumeroProducto() != null) {
            _hashCode += getNumeroProducto().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ProductoRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "productoRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("idCliente");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "idCliente"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipoProducto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "tipoProducto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroProducto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "numeroProducto"));
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
