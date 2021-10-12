package com.java.streams;

// A stream with null values

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SAmpleNullValueFilter1 {

	public static void main(String[] args) {

		List<String> list = Arrays.asList("Java", "Stream", null, "Filter", null);
		List<String> result = list.stream().collect(Collectors.toList());
		result.forEach(System.out::println);
	}

}