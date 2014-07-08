/**
 * StoredValueTransactionResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue;


/**
 * <summary>
 *             Response to the Stored Value transaction (gift card).
 * Expected.
 *             </summary>
 */
public class StoredValueTransactionResponse  extends com.ipcommerce.schemas.CWS.v2_0.Transactions.Response  implements java.io.Serializable {
    /* <summary>
     *             Specifies the authorization amount of the transaction.
     * This is the actual amount authorized and should be used in settlement
     * instead of the request amount. Required.
     *             </summary> */
    private java.math.BigDecimal amount;

    /* <summary>
     *             Indicates fees charged to process transaction if applicable.
     * Optional.
     *             </summary> */
    private java.math.BigDecimal feeAmount;

    /* <summary>
     *             A value returned when a transaction is approved. Required.
     * </summary> */
    private java.lang.String approvalCode;

    /* <summary>
     *             Response code returned by the card issuer indicating the
     * result of Card Verification (CVV2/CVC2/CID). Optional.
     *             </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.CVResult CVResult;

    /* <summary>
     *             The amount to return to the cardholder in another tender.
     * Optional.
     *             </summary> */
    private java.math.BigDecimal cashBackAmount;

    /* <summary>
     *             The value on the card that is locked due to balance lock
     * transaction received. Optional.
     *             </summary> */
    private java.math.BigDecimal lockAmount;

    /* <summary>
     *             The account balance after the transaction. Required.
     *             </summary> */
    private java.math.BigDecimal newBalance;

    /* <summary>
     *             The account balance prior to the transaction. Optional.
     * </summary> */
    private java.math.BigDecimal previousBalance;

    /* <summary>
     *             Indicates the status of the card if one is present. Optional.
     * </summary> */
    private com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardStatus cardStatus;

    /* <summary>
     *             Virtual card account number. Conditional, required for
     * virtual card activation.
     *             </summary> */
    private java.lang.String accountNumber;

    /* <summary>
     *             CVD2 data (gift card security code) for virtual card activations.
     * Optional.
     *             </summary> */
    private java.lang.String CVData;

    /* <summary>
     *             Specifies the gift card restriction value assigned to
     * a specific card. Optional.
     *             </summary> */
    private java.lang.String cardRestrictionValue;

    /* <summary>
     *             Token specified by a tokenization (offsite payment account
     * data storage) Service Provider, used to retrieve securely stored payment
     * account data. Conditional, required if any one of the following must
     * be provided: CardDataToken, SecureCardData, or tender-specific payment
     * account data.
     *             </summary> */
    private java.lang.String paymentAccountDataToken;

    /* <summary>
     *             Masked PAN for storage. Optional.
     *             </summary> */
    private java.lang.String maskedPAN;

    /* <summary>
     *             The order id generated by CWS. Often used by service providers
     * for transaction correlation. Optional.
     *             </summary> */
    private java.lang.String orderId;

    /* <summary>
     *             Card expiration. Optional.
     *             </summary> */
    private java.lang.String expire;

    public StoredValueTransactionResponse() {
    }

    public StoredValueTransactionResponse(
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Status status,
           java.lang.String statusCode,
           java.lang.String statusMessage,
           java.lang.String transactionId,
           java.lang.String originatorTransactionId,
           java.lang.String serviceTransactionId,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.ServiceTransactionDateTime serviceTransactionDateTime,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.Addendum addendum,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.CaptureState captureState,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.TransactionState transactionState,
           java.lang.Boolean isAcknowledged,
           java.lang.String reference,
           java.math.BigDecimal amount,
           java.math.BigDecimal feeAmount,
           java.lang.String approvalCode,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.CVResult CVResult,
           java.math.BigDecimal cashBackAmount,
           java.math.BigDecimal lockAmount,
           java.math.BigDecimal newBalance,
           java.math.BigDecimal previousBalance,
           com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardStatus cardStatus,
           java.lang.String accountNumber,
           java.lang.String CVData,
           java.lang.String cardRestrictionValue,
           java.lang.String paymentAccountDataToken,
           java.lang.String maskedPAN,
           java.lang.String orderId,
           java.lang.String expire) {
        super(
            status,
            statusCode,
            statusMessage,
            transactionId,
            originatorTransactionId,
            serviceTransactionId,
            serviceTransactionDateTime,
            addendum,
            captureState,
            transactionState,
            isAcknowledged,
            reference);
        this.amount = amount;
        this.feeAmount = feeAmount;
        this.approvalCode = approvalCode;
        this.CVResult = CVResult;
        this.cashBackAmount = cashBackAmount;
        this.lockAmount = lockAmount;
        this.newBalance = newBalance;
        this.previousBalance = previousBalance;
        this.cardStatus = cardStatus;
        this.accountNumber = accountNumber;
        this.CVData = CVData;
        this.cardRestrictionValue = cardRestrictionValue;
        this.paymentAccountDataToken = paymentAccountDataToken;
        this.maskedPAN = maskedPAN;
        this.orderId = orderId;
        this.expire = expire;
    }


    /**
     * Gets the amount value for this StoredValueTransactionResponse.
     * 
     * @return amount   * <summary>
     *             Specifies the authorization amount of the transaction.
     * This is the actual amount authorized and should be used in settlement
     * instead of the request amount. Required.
     *             </summary>
     */
    public java.math.BigDecimal getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this StoredValueTransactionResponse.
     * 
     * @param amount   * <summary>
     *             Specifies the authorization amount of the transaction.
     * This is the actual amount authorized and should be used in settlement
     * instead of the request amount. Required.
     *             </summary>
     */
    public void setAmount(java.math.BigDecimal amount) {
        this.amount = amount;
    }


    /**
     * Gets the feeAmount value for this StoredValueTransactionResponse.
     * 
     * @return feeAmount   * <summary>
     *             Indicates fees charged to process transaction if applicable.
     * Optional.
     *             </summary>
     */
    public java.math.BigDecimal getFeeAmount() {
        return feeAmount;
    }


    /**
     * Sets the feeAmount value for this StoredValueTransactionResponse.
     * 
     * @param feeAmount   * <summary>
     *             Indicates fees charged to process transaction if applicable.
     * Optional.
     *             </summary>
     */
    public void setFeeAmount(java.math.BigDecimal feeAmount) {
        this.feeAmount = feeAmount;
    }


    /**
     * Gets the approvalCode value for this StoredValueTransactionResponse.
     * 
     * @return approvalCode   * <summary>
     *             A value returned when a transaction is approved. Required.
     * </summary>
     */
    public java.lang.String getApprovalCode() {
        return approvalCode;
    }


    /**
     * Sets the approvalCode value for this StoredValueTransactionResponse.
     * 
     * @param approvalCode   * <summary>
     *             A value returned when a transaction is approved. Required.
     * </summary>
     */
    public void setApprovalCode(java.lang.String approvalCode) {
        this.approvalCode = approvalCode;
    }


    /**
     * Gets the CVResult value for this StoredValueTransactionResponse.
     * 
     * @return CVResult   * <summary>
     *             Response code returned by the card issuer indicating the
     * result of Card Verification (CVV2/CVC2/CID). Optional.
     *             </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.CVResult getCVResult() {
        return CVResult;
    }


    /**
     * Sets the CVResult value for this StoredValueTransactionResponse.
     * 
     * @param CVResult   * <summary>
     *             Response code returned by the card issuer indicating the
     * result of Card Verification (CVV2/CVC2/CID). Optional.
     *             </summary>
     */
    public void setCVResult(com.ipcommerce.schemas.CWS.v2_0.Transactions.CVResult CVResult) {
        this.CVResult = CVResult;
    }


    /**
     * Gets the cashBackAmount value for this StoredValueTransactionResponse.
     * 
     * @return cashBackAmount   * <summary>
     *             The amount to return to the cardholder in another tender.
     * Optional.
     *             </summary>
     */
    public java.math.BigDecimal getCashBackAmount() {
        return cashBackAmount;
    }


    /**
     * Sets the cashBackAmount value for this StoredValueTransactionResponse.
     * 
     * @param cashBackAmount   * <summary>
     *             The amount to return to the cardholder in another tender.
     * Optional.
     *             </summary>
     */
    public void setCashBackAmount(java.math.BigDecimal cashBackAmount) {
        this.cashBackAmount = cashBackAmount;
    }


    /**
     * Gets the lockAmount value for this StoredValueTransactionResponse.
     * 
     * @return lockAmount   * <summary>
     *             The value on the card that is locked due to balance lock
     * transaction received. Optional.
     *             </summary>
     */
    public java.math.BigDecimal getLockAmount() {
        return lockAmount;
    }


    /**
     * Sets the lockAmount value for this StoredValueTransactionResponse.
     * 
     * @param lockAmount   * <summary>
     *             The value on the card that is locked due to balance lock
     * transaction received. Optional.
     *             </summary>
     */
    public void setLockAmount(java.math.BigDecimal lockAmount) {
        this.lockAmount = lockAmount;
    }


    /**
     * Gets the newBalance value for this StoredValueTransactionResponse.
     * 
     * @return newBalance   * <summary>
     *             The account balance after the transaction. Required.
     *             </summary>
     */
    public java.math.BigDecimal getNewBalance() {
        return newBalance;
    }


    /**
     * Sets the newBalance value for this StoredValueTransactionResponse.
     * 
     * @param newBalance   * <summary>
     *             The account balance after the transaction. Required.
     *             </summary>
     */
    public void setNewBalance(java.math.BigDecimal newBalance) {
        this.newBalance = newBalance;
    }


    /**
     * Gets the previousBalance value for this StoredValueTransactionResponse.
     * 
     * @return previousBalance   * <summary>
     *             The account balance prior to the transaction. Optional.
     * </summary>
     */
    public java.math.BigDecimal getPreviousBalance() {
        return previousBalance;
    }


    /**
     * Sets the previousBalance value for this StoredValueTransactionResponse.
     * 
     * @param previousBalance   * <summary>
     *             The account balance prior to the transaction. Optional.
     * </summary>
     */
    public void setPreviousBalance(java.math.BigDecimal previousBalance) {
        this.previousBalance = previousBalance;
    }


    /**
     * Gets the cardStatus value for this StoredValueTransactionResponse.
     * 
     * @return cardStatus   * <summary>
     *             Indicates the status of the card if one is present. Optional.
     * </summary>
     */
    public com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardStatus getCardStatus() {
        return cardStatus;
    }


    /**
     * Sets the cardStatus value for this StoredValueTransactionResponse.
     * 
     * @param cardStatus   * <summary>
     *             Indicates the status of the card if one is present. Optional.
     * </summary>
     */
    public void setCardStatus(com.ipcommerce.schemas.CWS.v2_0.Transactions.StoredValue.CardStatus cardStatus) {
        this.cardStatus = cardStatus;
    }


    /**
     * Gets the accountNumber value for this StoredValueTransactionResponse.
     * 
     * @return accountNumber   * <summary>
     *             Virtual card account number. Conditional, required for
     * virtual card activation.
     *             </summary>
     */
    public java.lang.String getAccountNumber() {
        return accountNumber;
    }


    /**
     * Sets the accountNumber value for this StoredValueTransactionResponse.
     * 
     * @param accountNumber   * <summary>
     *             Virtual card account number. Conditional, required for
     * virtual card activation.
     *             </summary>
     */
    public void setAccountNumber(java.lang.String accountNumber) {
        this.accountNumber = accountNumber;
    }


    /**
     * Gets the CVData value for this StoredValueTransactionResponse.
     * 
     * @return CVData   * <summary>
     *             CVD2 data (gift card security code) for virtual card activations.
     * Optional.
     *             </summary>
     */
    public java.lang.String getCVData() {
        return CVData;
    }


    /**
     * Sets the CVData value for this StoredValueTransactionResponse.
     * 
     * @param CVData   * <summary>
     *             CVD2 data (gift card security code) for virtual card activations.
     * Optional.
     *             </summary>
     */
    public void setCVData(java.lang.String CVData) {
        this.CVData = CVData;
    }


    /**
     * Gets the cardRestrictionValue value for this StoredValueTransactionResponse.
     * 
     * @return cardRestrictionValue   * <summary>
     *             Specifies the gift card restriction value assigned to
     * a specific card. Optional.
     *             </summary>
     */
    public java.lang.String getCardRestrictionValue() {
        return cardRestrictionValue;
    }


    /**
     * Sets the cardRestrictionValue value for this StoredValueTransactionResponse.
     * 
     * @param cardRestrictionValue   * <summary>
     *             Specifies the gift card restriction value assigned to
     * a specific card. Optional.
     *             </summary>
     */
    public void setCardRestrictionValue(java.lang.String cardRestrictionValue) {
        this.cardRestrictionValue = cardRestrictionValue;
    }


    /**
     * Gets the paymentAccountDataToken value for this StoredValueTransactionResponse.
     * 
     * @return paymentAccountDataToken   * <summary>
     *             Token specified by a tokenization (offsite payment account
     * data storage) Service Provider, used to retrieve securely stored payment
     * account data. Conditional, required if any one of the following must
     * be provided: CardDataToken, SecureCardData, or tender-specific payment
     * account data.
     *             </summary>
     */
    public java.lang.String getPaymentAccountDataToken() {
        return paymentAccountDataToken;
    }


    /**
     * Sets the paymentAccountDataToken value for this StoredValueTransactionResponse.
     * 
     * @param paymentAccountDataToken   * <summary>
     *             Token specified by a tokenization (offsite payment account
     * data storage) Service Provider, used to retrieve securely stored payment
     * account data. Conditional, required if any one of the following must
     * be provided: CardDataToken, SecureCardData, or tender-specific payment
     * account data.
     *             </summary>
     */
    public void setPaymentAccountDataToken(java.lang.String paymentAccountDataToken) {
        this.paymentAccountDataToken = paymentAccountDataToken;
    }


    /**
     * Gets the maskedPAN value for this StoredValueTransactionResponse.
     * 
     * @return maskedPAN   * <summary>
     *             Masked PAN for storage. Optional.
     *             </summary>
     */
    public java.lang.String getMaskedPAN() {
        return maskedPAN;
    }


    /**
     * Sets the maskedPAN value for this StoredValueTransactionResponse.
     * 
     * @param maskedPAN   * <summary>
     *             Masked PAN for storage. Optional.
     *             </summary>
     */
    public void setMaskedPAN(java.lang.String maskedPAN) {
        this.maskedPAN = maskedPAN;
    }


    /**
     * Gets the orderId value for this StoredValueTransactionResponse.
     * 
     * @return orderId   * <summary>
     *             The order id generated by CWS. Often used by service providers
     * for transaction correlation. Optional.
     *             </summary>
     */
    public java.lang.String getOrderId() {
        return orderId;
    }


    /**
     * Sets the orderId value for this StoredValueTransactionResponse.
     * 
     * @param orderId   * <summary>
     *             The order id generated by CWS. Often used by service providers
     * for transaction correlation. Optional.
     *             </summary>
     */
    public void setOrderId(java.lang.String orderId) {
        this.orderId = orderId;
    }


    /**
     * Gets the expire value for this StoredValueTransactionResponse.
     * 
     * @return expire   * <summary>
     *             Card expiration. Optional.
     *             </summary>
     */
    public java.lang.String getExpire() {
        return expire;
    }


    /**
     * Sets the expire value for this StoredValueTransactionResponse.
     * 
     * @param expire   * <summary>
     *             Card expiration. Optional.
     *             </summary>
     */
    public void setExpire(java.lang.String expire) {
        this.expire = expire;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof StoredValueTransactionResponse)) return false;
        StoredValueTransactionResponse other = (StoredValueTransactionResponse) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.feeAmount==null && other.getFeeAmount()==null) || 
             (this.feeAmount!=null &&
              this.feeAmount.equals(other.getFeeAmount()))) &&
            ((this.approvalCode==null && other.getApprovalCode()==null) || 
             (this.approvalCode!=null &&
              this.approvalCode.equals(other.getApprovalCode()))) &&
            ((this.CVResult==null && other.getCVResult()==null) || 
             (this.CVResult!=null &&
              this.CVResult.equals(other.getCVResult()))) &&
            ((this.cashBackAmount==null && other.getCashBackAmount()==null) || 
             (this.cashBackAmount!=null &&
              this.cashBackAmount.equals(other.getCashBackAmount()))) &&
            ((this.lockAmount==null && other.getLockAmount()==null) || 
             (this.lockAmount!=null &&
              this.lockAmount.equals(other.getLockAmount()))) &&
            ((this.newBalance==null && other.getNewBalance()==null) || 
             (this.newBalance!=null &&
              this.newBalance.equals(other.getNewBalance()))) &&
            ((this.previousBalance==null && other.getPreviousBalance()==null) || 
             (this.previousBalance!=null &&
              this.previousBalance.equals(other.getPreviousBalance()))) &&
            ((this.cardStatus==null && other.getCardStatus()==null) || 
             (this.cardStatus!=null &&
              this.cardStatus.equals(other.getCardStatus()))) &&
            ((this.accountNumber==null && other.getAccountNumber()==null) || 
             (this.accountNumber!=null &&
              this.accountNumber.equals(other.getAccountNumber()))) &&
            ((this.CVData==null && other.getCVData()==null) || 
             (this.CVData!=null &&
              this.CVData.equals(other.getCVData()))) &&
            ((this.cardRestrictionValue==null && other.getCardRestrictionValue()==null) || 
             (this.cardRestrictionValue!=null &&
              this.cardRestrictionValue.equals(other.getCardRestrictionValue()))) &&
            ((this.paymentAccountDataToken==null && other.getPaymentAccountDataToken()==null) || 
             (this.paymentAccountDataToken!=null &&
              this.paymentAccountDataToken.equals(other.getPaymentAccountDataToken()))) &&
            ((this.maskedPAN==null && other.getMaskedPAN()==null) || 
             (this.maskedPAN!=null &&
              this.maskedPAN.equals(other.getMaskedPAN()))) &&
            ((this.orderId==null && other.getOrderId()==null) || 
             (this.orderId!=null &&
              this.orderId.equals(other.getOrderId()))) &&
            ((this.expire==null && other.getExpire()==null) || 
             (this.expire!=null &&
              this.expire.equals(other.getExpire())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getFeeAmount() != null) {
            _hashCode += getFeeAmount().hashCode();
        }
        if (getApprovalCode() != null) {
            _hashCode += getApprovalCode().hashCode();
        }
        if (getCVResult() != null) {
            _hashCode += getCVResult().hashCode();
        }
        if (getCashBackAmount() != null) {
            _hashCode += getCashBackAmount().hashCode();
        }
        if (getLockAmount() != null) {
            _hashCode += getLockAmount().hashCode();
        }
        if (getNewBalance() != null) {
            _hashCode += getNewBalance().hashCode();
        }
        if (getPreviousBalance() != null) {
            _hashCode += getPreviousBalance().hashCode();
        }
        if (getCardStatus() != null) {
            _hashCode += getCardStatus().hashCode();
        }
        if (getAccountNumber() != null) {
            _hashCode += getAccountNumber().hashCode();
        }
        if (getCVData() != null) {
            _hashCode += getCVData().hashCode();
        }
        if (getCardRestrictionValue() != null) {
            _hashCode += getCardRestrictionValue().hashCode();
        }
        if (getPaymentAccountDataToken() != null) {
            _hashCode += getPaymentAccountDataToken().hashCode();
        }
        if (getMaskedPAN() != null) {
            _hashCode += getMaskedPAN().hashCode();
        }
        if (getOrderId() != null) {
            _hashCode += getOrderId().hashCode();
        }
        if (getExpire() != null) {
            _hashCode += getExpire().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(StoredValueTransactionResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "StoredValueTransactionResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("feeAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "FeeAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("approvalCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "ApprovalCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CVResult");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CVResult"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions", "CVResult"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cashBackAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CashBackAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lockAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "LockAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "NewBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "PreviousBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardStatus");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardStatus"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardStatus"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "AccountNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CVData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CVData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardRestrictionValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "CardRestrictionValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentAccountDataToken");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "PaymentAccountDataToken"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maskedPAN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "MaskedPAN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("orderId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "OrderId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expire");
        elemField.setXmlName(new javax.xml.namespace.QName("http://schemas.ipcommerce.com/CWS/v2.0/Transactions/StoredValue", "Expire"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
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