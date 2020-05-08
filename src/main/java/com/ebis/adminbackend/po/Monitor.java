package com.ebis.adminbackend.po;

import java.util.Date;

public class Monitor {
    private String monitorid;

    private String userid;

    private String eventtype;

    private String ipadress;

    private String isregister;

    private Date eventtime;

    public String getMonitorid() {
        return monitorid;
    }

    public void setMonitorid(String monitorid) {
        this.monitorid = monitorid == null ? null : monitorid.trim();
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    public String getEventtype() {
        return eventtype;
    }

    public void setEventtype(String eventtype) {
        this.eventtype = eventtype == null ? null : eventtype.trim();
    }

    public String getIpadress() {
        return ipadress;
    }

    public void setIpadress(String ipadress) {
        this.ipadress = ipadress == null ? null : ipadress.trim();
    }

    public String getIsregister() {
        return isregister;
    }

    public void setIsregister(String isregister) {
        this.isregister = isregister == null ? null : isregister.trim();
    }

    public Date getEventtime() {
        return eventtime;
    }

    public void setEventtime(Date eventtime) {
        this.eventtime = eventtime;
    }
}