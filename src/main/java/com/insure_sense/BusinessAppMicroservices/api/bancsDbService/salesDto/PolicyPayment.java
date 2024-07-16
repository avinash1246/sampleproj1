package com.insure_sense.BusinessAppMicroservices.api.bancsDbService.salesDto;

import lombok.NoArgsConstructor;


import java.time.LocalDate;
@NoArgsConstructor
public class PolicyPayment extends BaseEntity {

    public PolicyPayment(Long policyId, String paymentId, String currency, Double paymentAmount,
                         String txnType, Integer txnNo, LocalDate txnDate, String orderId,
                         Long accountId, String txnStatus, String receiptId, String paymentChannel,
                         String paymentSignature) {
        this.policyId = policyId;
        this.paymentId = paymentId;
        this.currency = currency;
        this.paymentAmount = paymentAmount;
        this.txnType = txnType;
        this.txnNo = txnNo;
        this.txnDate = txnDate;
        this.orderId = orderId;
        this.accountId = accountId;
        this.txnStatus = txnStatus;
        this.receiptId = receiptId;
        this.paymentChannel = paymentChannel;
        this.paymentSignature = paymentSignature;
    }


    private Long policyId;


    private String paymentId;

    private String currency;
    private Double paymentAmount;
    private String txnType;
    private Integer txnNo;
    private LocalDate txnDate;
    private String orderId;
    private Long accountId;
    private String txnStatus;
    private String receiptId;
    private String paymentChannel;
    private String paymentSignature;

    public Long getPolicyId() {
        return policyId;
    }

    public void setPolicyId(Long policyId) {
        this.policyId = policyId;
    }

    public String getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Double getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Double paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getTxnType() {
        return txnType;
    }

    public void setTxnType(String txnType) {
        this.txnType = txnType;
    }

    public Integer getTxnNo() {
        return txnNo;
    }

    public void setTxnNo(Integer txnNo) {
        this.txnNo = txnNo;
    }

    public LocalDate getTxnDate() {
        return txnDate;
    }

    public void setTxnDate(LocalDate txnDate) {
        this.txnDate = txnDate;
    }

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public Long getAccountId() {
        return accountId;
    }

    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    public String getTxnStatus() {
        return txnStatus;
    }

    public void setTxnStatus(String txnStatus) {
        this.txnStatus = txnStatus;
    }

    public String getReceiptId() {
        return receiptId;
    }

    public void setReceiptId(String receiptId) {
        this.receiptId = receiptId;
    }

    public String getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(String paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public String getPaymentSignature() {
        return paymentSignature;
    }

    public void setPaymentSignature(String paymentSignature) {
        this.paymentSignature = paymentSignature;
    }
}
