package com.byit.fraud.beantoxml;

import java.util.Date;

public class ApplicationInfos {
    private String applicationNo;
    private String customerName;
    private String individualID;
    private String contractNo;
    private Date loanDate;
    private String noMortgage;
    private String vinNo;
    private String organizationType;
    private String productType;
    private String electronicVisa;
    private String coCredit;
    private String guarantor;

    public ApplicationInfos(String applicationNo, String customerName, String individualID, String contractNo, Date loanDate, String noMortgage, String vinNo, String organizationType, String productType, String electronicVisa, String coCredit, String guarantor) {
        this.applicationNo = applicationNo;
        this.customerName = customerName;
        this.individualID = individualID;
        this.contractNo = contractNo;
        this.loanDate = loanDate;
        this.noMortgage = noMortgage;
        this.vinNo = vinNo;
        this.organizationType = organizationType;
        this.productType = productType;
        this.electronicVisa = electronicVisa;
        this.coCredit = coCredit;
        this.guarantor = guarantor;
    }

    public ApplicationInfos() {
    }

    public String getApplicationNo() {
        return applicationNo;
    }

    public void setApplicationNo(String applicationNo) {
        this.applicationNo = applicationNo;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getIndividualID() {
        return individualID;
    }

    public void setIndividualID(String individualID) {
        this.individualID = individualID;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(Date loanDate) {
        this.loanDate = loanDate;
    }

    public String getNoMortgage() {
        return noMortgage;
    }

    public void setNoMortgage(String noMortgage) {
        this.noMortgage = noMortgage;
    }

    public String getVinNo() {
        return vinNo;
    }

    public void setVinNo(String vinNo) {
        this.vinNo = vinNo;
    }

    public String getOrganizationType() {
        return organizationType;
    }

    public void setOrganizationType(String organizationType) {
        this.organizationType = organizationType;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getElectronicVisa() {
        return electronicVisa;
    }

    public void setElectronicVisa(String electronicVisa) {
        this.electronicVisa = electronicVisa;
    }

    public String getCoCredit() {
        return coCredit;
    }

    public void setCoCredit(String coCredit) {
        this.coCredit = coCredit;
    }

    public String getGuarantor() {
        return guarantor;
    }

    public void setGuarantor(String guarantor) {
        this.guarantor = guarantor;
    }
}
