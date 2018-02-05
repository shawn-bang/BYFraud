package com.byit.fraud.beantoxml;

public class CommonHeader {
    private String BHAF_TRANCODE;
    private String BHAF_SYSCODE;
    private String BHAF_MSGID;
    private String BHAF_ESBID;
    private String BHAF_TRANDATE;
    private String BHAF_BEGINTIME;
    private String BHAF_ENDTIME;
    private String BHAF_RETCODE;
    private String BHAF_RETMSG;

    public CommonHeader() {
    }

    public CommonHeader(String BHAF_TRANCODE, String BHAF_SYSCODE, String BHAF_MSGID, String BHAF_ESBID, String BHAF_TRANDATE, String BHAF_BEGINTIME, String BHAF_ENDTIME, String BHAF_RETCODE, String BHAF_RETMSG) {
        this.BHAF_TRANCODE = BHAF_TRANCODE;
        this.BHAF_SYSCODE = BHAF_SYSCODE;
        this.BHAF_MSGID = BHAF_MSGID;
        this.BHAF_ESBID = BHAF_ESBID;
        this.BHAF_TRANDATE = BHAF_TRANDATE;
        this.BHAF_BEGINTIME = BHAF_BEGINTIME;
        this.BHAF_ENDTIME = BHAF_ENDTIME;
        this.BHAF_RETCODE = BHAF_RETCODE;
        this.BHAF_RETMSG = BHAF_RETMSG;
    }

    public String getBHAF_TRANCODE() {
        return BHAF_TRANCODE;
    }

    public void setBHAF_TRANCODE(String BHAF_TRANCODE) {
        this.BHAF_TRANCODE = BHAF_TRANCODE;
    }

    public String getBHAF_SYSCODE() {
        return BHAF_SYSCODE;
    }

    public void setBHAF_SYSCODE(String BHAF_SYSCODE) {
        this.BHAF_SYSCODE = BHAF_SYSCODE;
    }

    public String getBHAF_MSGID() {
        return BHAF_MSGID;
    }

    public void setBHAF_MSGID(String BHAF_MSGID) {
        this.BHAF_MSGID = BHAF_MSGID;
    }

    public String getBHAF_ESBID() {
        return BHAF_ESBID;
    }

    public void setBHAF_ESBID(String BHAF_ESBID) {
        this.BHAF_ESBID = BHAF_ESBID;
    }

    public String getBHAF_TRANDATE() {
        return BHAF_TRANDATE;
    }

    public void setBHAF_TRANDATE(String BHAF_TRANDATE) {
        this.BHAF_TRANDATE = BHAF_TRANDATE;
    }

    public String getBHAF_BEGINTIME() {
        return BHAF_BEGINTIME;
    }

    public void setBHAF_BEGINTIME(String BHAF_BEGINTIME) {
        this.BHAF_BEGINTIME = BHAF_BEGINTIME;
    }

    public String getBHAF_ENDTIME() {
        return BHAF_ENDTIME;
    }

    public void setBHAF_ENDTIME(String BHAF_ENDTIME) {
        this.BHAF_ENDTIME = BHAF_ENDTIME;
    }

    public String getBHAF_RETCODE() {
        return BHAF_RETCODE;
    }

    public void setBHAF_RETCODE(String BHAF_RETCODE) {
        this.BHAF_RETCODE = BHAF_RETCODE;
    }

    public String getBHAF_RETMSG() {
        return BHAF_RETMSG;
    }

    public void setBHAF_RETMSG(String BHAF_RETMSG) {
        this.BHAF_RETMSG = BHAF_RETMSG;
    }
}
