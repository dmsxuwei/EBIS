package com.ebis.adminbackend.po;

import java.util.Date;

public class Advertising {
    private String advertisingid;

    private String companyid;

    private String image;

    private String location;

    private Integer rank;

    private Date createtime;

    public String getAdvertisingid() {
        return advertisingid;
    }

    public void setAdvertisingid(String advertisingid) {
        this.advertisingid = advertisingid == null ? null : advertisingid.trim();
    }

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location == null ? null : location.trim();
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }
}