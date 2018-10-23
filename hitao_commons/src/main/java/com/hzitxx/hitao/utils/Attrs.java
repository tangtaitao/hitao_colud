
package com.hzitxx.hitao.utils;

public class Attrs {

	private String name;
	private String value;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "Attrs [name=" + name + ", value=" + value + "]";
	}

}