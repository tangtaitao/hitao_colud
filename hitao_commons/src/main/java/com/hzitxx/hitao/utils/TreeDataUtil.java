package com.hzitxx.hitao.utils;

import java.util.ArrayList;
import java.util.List;

public class TreeDataUtil {
	private int id;
	private String name;
	private int parentId;
	private List<TreeDataUtil> children =new ArrayList<>();

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getParentId() {
		return parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	public List<TreeDataUtil> getChildren() {
		return children;
	}

	public void setChildren(List<TreeDataUtil> children) {
		this.children = children;
	}

	@Override
	public String toString() {
		return "TreeDateUtil [id=" + id + ", name=" + name + ", parentId=" + parentId + ", children=" + children + "]";
	}

}
