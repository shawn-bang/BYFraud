package com.byit.fraud.beantoxml;

public class BizBody {
    private ApplicationInfos applicationInfos;

    public BizBody(ApplicationInfos applicationInfos) {
        this.applicationInfos = applicationInfos;
    }

    public BizBody() {
    }

    public ApplicationInfos getApplicationInfos() {
        return applicationInfos;
    }

    public void setApplicationInfos(ApplicationInfos applicationInfos) {
        this.applicationInfos = applicationInfos;
    }
}
