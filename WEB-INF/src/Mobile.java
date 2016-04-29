package com.sonu.domain;

public class Mobile {
	private String os;

	public Mobile(String os) {
		this.os = os;
	}

	public String getOs() {
		return os;
	}

	public void setOs(String os) {
		this.os = os;
	}

	@Override
	public String toString() {
		return os;
	}
}
