package com.ebis.adminbackend.po;

import java.util.Date;

public class CCompanyInformation {
    private String companyid;

    private String companyname;

    private String type;

    private String image;

    private String tel;

    private String url;

    private Date createtime;

    private String ishome;

    private Integer rank;

    public String getCompanyid() {
        return companyid;
    }

    public void setCompanyid(String companyid) {
        this.companyid = companyid == null ? null : companyid.trim();
    }

    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname == null ? null : companyname.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image == null ? null : image.trim();
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel == null ? null : tel.trim();
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url == null ? null : url.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getIshome() {
        return ishome;
    }

    public void setIshome(String ishome) {
        this.ishome = ishome == null ? null : ishome.trim();
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }
}