package com.String;

import java.util.ArrayList;
import java.util.List;

public class AllPermutationOfString {
	public static void main(String[] args) {



		List<String> output = AllPermutationOfString.generatePermutations("xyz");
		System.out.println("Result size: "+output.size());
		output.stream().forEach(System.out::println);
		System.out.println("------------------");

		output = AllPermutationOfString.generatePermutations("ABCD");
		System.out.println("Result size: "+output.size());
		output.stream().forEach(System.out::println);
	}

	public static List<String> generatePermutations(String input) {

		List<String> strList = new ArrayList<String>();
		AllPermutationOfString.permutations("", input, strList);

		return strList;
	}

	private static void permutations(String consChars, String input, List<String> outputlist) {

		if(input.isEmpty()) {
			
			outputlist.add(consChars);
			return;
		}

		for(int i=0; i<input.length(); i++) {
			permutations(consChars+input.charAt(i),
					input.substring(0, i)+input.substring(i+1),
					outputlist);
		}
	}}