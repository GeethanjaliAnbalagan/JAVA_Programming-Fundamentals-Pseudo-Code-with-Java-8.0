package com.java.streams;



	import java.util.List;
	import java.util.stream.Collectors;
	import java.util.stream.Stream;

	public class SampleStreamToList2 {
	    public static void main(String[] args) {

	        Stream<Integer> number = Stream.of(1, 2, 3, 4, 5);

	        List<Integer> result2 = number.filter(x -> x != 3).collect(Collectors.toList());

	        result2.forEach(x -> System.out.println(x));


	    }
	}
