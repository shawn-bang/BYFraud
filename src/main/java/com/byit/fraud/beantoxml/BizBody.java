package com.byit.fraud.beantoxml;

public class BizBody {

    private String dealerCode;
    private String loanDate;
    private ApplicationInfos applicationInfos;

    public BizBody() {
    }

    public BizBody(ApplicationInfos applicationInfos) {
        this.applicationInfos = applicationInfos;
    }

    public String getDealerCode() {
        return dealerCode;
    }

    public void setDealerCode(String dealerCode) {
        this.dealerCode = dealerCode;
    }

    public String getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(String loanDate) {
        this.loanDate = loanDate;
    }

    public ApplicationInfos getApplicationInfos() {
        return applicationInfos;
    }

    public void setApplicationInfos(ApplicationInfos applicationInfos) {
        this.applicationInfos = applicationInfos;
    }

}
