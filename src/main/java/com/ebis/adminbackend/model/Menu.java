package com.ebis.adminbackend.model;

import java.util.List;

public class Menu {

	private String id;// 子菜单Id
	private String parentId;// 父菜单ID
	private String pText;// 父菜单名称
	private String text;// 子菜单名称
	private String iconCls;// 子菜单图标
	private String url;// 子菜单路径
	private String state;
	private Integer isend;
	private List<Menu> children;

	public Menu(String id, String parentId, String pText, String text, String iconCls, String url, String state,
			Integer isend) {
		super();
		this.id = id;
		this.parentId = parentId;
		this.pText = pText;
		this.text = text;
		this.iconCls = iconCls;
		this.url = url;
		this.state = state;
		this.isend = isend;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getpText() {
		return pText;
	}

	public void setpText(String pText) {
		this.pText = pText;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getIconCls() {
		return iconCls;
	}

	public void setIconCls(String iconCls) {
		this.iconCls = iconCls;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public Integer getIsend() {
		return isend;
	}

	public void setIsend(Integer isend) {
		this.isend = isend;
	}

	public List<Menu> getChildren() {
		return children;
	}

	public void setChildren(List<Menu> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "Menu [id=" + id + ", parentId=" + parentId + ", pText=" + pText + ", text=" + text + ", iconCls="
				+ iconCls + ", url=" + url + ", state=" + state + ", isend=" + isend + ", children=" + children + "]";
	}

}