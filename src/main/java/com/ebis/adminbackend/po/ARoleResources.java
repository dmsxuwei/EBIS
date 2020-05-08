package com.ebis.adminbackend.po;

public class ARoleResources {
    private String roleresourceid;

    private String roleid;

    private String resourceid;

    public String getRoleresourceid() {
        return roleresourceid;
    }

    public void setRoleresourceid(String roleresourceid) {
        this.roleresourceid = roleresourceid == null ? null : roleresourceid.trim();
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    public String getResourceid() {
        return resourceid;
    }

    public void setResourceid(String resourceid) {
        this.resourceid = resourceid == null ? null : resourceid.trim();
    }
}