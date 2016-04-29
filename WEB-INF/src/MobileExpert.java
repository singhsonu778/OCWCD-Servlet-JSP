package com.sonu.model;

import java.util.*;

public class MobileExpert {
	public List<String> getBrands(String os) {
		List<String> brands = new ArrayList<>();
		if (os.equals("android")) {
			brands.add("Samsung");
			brands.add("Nexus");
		} else {
			brands.add("Microsoft");
			brands.add("Lumia");
		}
		return (brands);
	}
}