/**
 * Producto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.producto;

public class Producto  implements java.io.Serializable {
    private java.lang.String tipo;

    private java.lang.String numeroPoducto;

    private java.lang.String nombreProducto;

    private double saldo;

    public Producto() {
    }

    public Producto(
           java.lang.String tipo,
           java.lang.String numeroPoducto,
           java.lang.String nombreProducto,
           double saldo) {
           this.tipo = tipo;
           this.numeroPoducto = numeroPoducto;
           this.nombreProducto = nombreProducto;
           this.saldo = saldo;
    }


    /**
     * Gets the tipo value for this Producto.
     * 
     * @return tipo
     */
    public java.lang.String getTipo() {
        return tipo;
    }


    /**
     * Sets the tipo value for this Producto.
     * 
     * @param tipo
     */
    public void setTipo(java.lang.String tipo) {
        this.tipo = tipo;
    }


    /**
     * Gets the numeroPoducto value for this Producto.
     * 
     * @return numeroPoducto
     */
    public java.lang.String getNumeroPoducto() {
        return numeroPoducto;
    }


    /**
     * Sets the numeroPoducto value for this Producto.
     * 
     * @param numeroPoducto
     */
    public void setNumeroPoducto(java.lang.String numeroPoducto) {
        this.numeroPoducto = numeroPoducto;
    }


    /**
     * Gets the nombreProducto value for this Producto.
     * 
     * @return nombreProducto
     */
    public java.lang.String getNombreProducto() {
        return nombreProducto;
    }


    /**
     * Sets the nombreProducto value for this Producto.
     * 
     * @param nombreProducto
     */
    public void setNombreProducto(java.lang.String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }


    /**
     * Gets the saldo value for this Producto.
     * 
     * @return saldo
     */
    public double getSaldo() {
        return saldo;
    }


    /**
     * Sets the saldo value for this Producto.
     * 
     * @param saldo
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Producto)) return false;
        Producto other = (Producto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.tipo==null && other.getTipo()==null) || 
             (this.tipo!=null &&
              this.tipo.equals(other.getTipo()))) &&
            ((this.numeroPoducto==null && other.getNumeroPoducto()==null) || 
             (this.numeroPoducto!=null &&
              this.numeroPoducto.equals(other.getNumeroPoducto()))) &&
            ((this.nombreProducto==null && other.getNombreProducto()==null) || 
             (this.nombreProducto!=null &&
              this.nombreProducto.equals(other.getNombreProducto()))) &&
            this.saldo == other.getSaldo();
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
        if (getTipo() != null) {
            _hashCode += getTipo().hashCode();
        }
        if (getNumeroPoducto() != null) {
            _hashCode += getNumeroPoducto().hashCode();
        }
        if (getNombreProducto() != null) {
            _hashCode += getNombreProducto().hashCode();
        }
        _hashCode += new Double(getSaldo()).hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Producto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "Producto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("tipo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "tipo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numeroPoducto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "numeroPoducto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nombreProducto");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "nombreProducto"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("saldo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/producto/", "saldo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
