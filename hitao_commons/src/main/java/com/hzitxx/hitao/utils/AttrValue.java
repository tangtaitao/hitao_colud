
package com.hzitxx.hitao.utils;

import java.util.List;

public class AttrValue {

	private String group;
	private List<Attrs> attrs;

	public void setGroup(String group) {
		this.group = group;
	}

	public String getGroup() {
		return group;
	}

	public void setAttrs(List<Attrs> attrs) {
		this.attrs = attrs;
	}

	public List<Attrs> getAttrs() {
		return attrs;
	}

	@Override
	public String toString() {
		return "AttrValue [group=" + group + ", attrs=" + attrs + "]";
	}

}