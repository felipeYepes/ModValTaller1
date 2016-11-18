/**
 * ProveedorRespuesta.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package bancoabc.www.proveedor;

public class ProveedorRespuesta  implements java.io.Serializable {
    private bancoabc.www.proveedor.RespuestaServicio respuesta;

    private bancoabc.www.proveedor.Proveedor[] proveedores;

    public ProveedorRespuesta() {
    }

    public ProveedorRespuesta(
           bancoabc.www.proveedor.RespuestaServicio respuesta,
           bancoabc.www.proveedor.Proveedor[] proveedores) {
           this.respuesta = respuesta;
           this.proveedores = proveedores;
    }


    /**
     * Gets the respuesta value for this ProveedorRespuesta.
     * 
     * @return respuesta
     */
    public bancoabc.www.proveedor.RespuestaServicio getRespuesta() {
        return respuesta;
    }


    /**
     * Sets the respuesta value for this ProveedorRespuesta.
     * 
     * @param respuesta
     */
    public void setRespuesta(bancoabc.www.proveedor.RespuestaServicio respuesta) {
        this.respuesta = respuesta;
    }


    /**
     * Gets the proveedores value for this ProveedorRespuesta.
     * 
     * @return proveedores
     */
    public bancoabc.www.proveedor.Proveedor[] getProveedores() {
        return proveedores;
    }


    /**
     * Sets the proveedores value for this ProveedorRespuesta.
     * 
     * @param proveedores
     */
    public void setProveedores(bancoabc.www.proveedor.Proveedor[] proveedores) {
        this.proveedores = proveedores;
    }

    public bancoabc.www.proveedor.Proveedor getProveedores(int i) {
        return this.proveedores[i];
    }

    public void setProveedores(int i, bancoabc.www.proveedor.Proveedor _value) {
        this.proveedores[i] = _value;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof ProveedorRespuesta)) return false;
        ProveedorRespuesta other = (ProveedorRespuesta) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.respuesta==null && other.getRespuesta()==null) || 
             (this.respuesta!=null &&
              this.respuesta.equals(other.getRespuesta()))) &&
            ((this.proveedores==null && other.getProveedores()==null) || 
             (this.proveedores!=null &&
              java.util.Arrays.equals(this.proveedores, other.getProveedores())));
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
        if (getRespuesta() != null) {
            _hashCode += getRespuesta().hashCode();
        }
        if (getProveedores() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getProveedores());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getProveedores(), i);
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
        new org.apache.axis.description.TypeDesc(ProveedorRespuesta.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "ProveedorRespuesta"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("respuesta");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "respuesta"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "RespuestaServicio"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("proveedores");
        elemField.setXmlName(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "proveedores"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.bancoabc/proveedor/", "Proveedor"));
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
