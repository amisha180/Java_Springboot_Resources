package com.java.practice.day_2;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class MapDemo {

	public static void main(String[] args) {
		Map<Integer, String> map = new HashMap<>();
		map.put(1, "xyx.com");
		map.put(2, "xyz.com");
		map.put(3, "xyw.com");
		map.put(4, "xys.com");
		map.put(5, "xyc.com");
		// Map--->Stream--->Filter-->Map
		Map<Integer, String> mapRes = map.entrySet().stream().filter(a -> a.getKey() == 3)
				.collect(Collectors.toMap(p -> p.getKey(), p -> p.getValue()));
		System.out.println(mapRes);
	}

}
