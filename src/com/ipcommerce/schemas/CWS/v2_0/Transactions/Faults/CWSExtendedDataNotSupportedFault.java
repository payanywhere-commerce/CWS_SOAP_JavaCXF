/**
 * CWSExtendedDataNotSupportedFault.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults;


/**
 * <summary>
 *             Indicates that extended credit card data, such as Level
 * 2, Level 3, and/or Managed Billing data, is not supported by the Service
 * Provider.
 *             </summary>
 */
public class CWSExtendedDataNotSupportedFault  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Faults.CWSBaseFault  implements java.io.Serializable {
    public CWSExtendedDataNotSupportedFault() {
    }

    public CWSExtendedDataNotSupportedFault(
           java.lang.String batchId,
           java.lang.Integer errorID,
           java.lang.String helpURL,
           java.lang.String operation,
           java.lang.String problemType,
           java.lang.String transactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState transactionState) {
        super(
            batchId,
            errorID,
            helpURL,
            operation,
            problemType,
            transactionId,
            transactionState);
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof CWSExtendedDataNotSupportedFault)) return false;
        CWSExtendedDataNotSupportedFault other = (CWSExtendedDataNotSupportedFault) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj);
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CWSExtendedDataNotSupportedFault.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/Faults", "CWSExtendedDataNotSupportedFault"));
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


    /**
     * Writes the exception data to the faultDetails
     */
    public void writeDetails(javax.xml.namespace.QName qname, org.apache.axis.encoding.SerializationContext context) throws java.io.IOException {
        context.serialize(qname, null, this);
    }
}