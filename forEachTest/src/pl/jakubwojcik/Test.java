package pl.jakubwojcik;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.google.common.collect.Lists;

public class Test {

	static void predicateMethod(String arg, String substring){
		System.out.println(filteringMethod(arg, substring));
	}
	static String filteringMethod(String arg, String substring){
		if(arg.contains(substring))
			return new String(arg + " contains '" + substring + "'!");
		else
			return "";
	}
	public static void main(String[] args) {
//		List<Integer> list = Arrays.asList(new Integer[]{1, 3, 4, 5});
//		list.forEach(System.out::println);
//		list.forEach(item -> {
//			if(item % 3 == 0)System.out.println("Fizz!");
//			else if(item % 5 == 0)System.out.println("Buzz");
//			else System.out.println(item);
//			});
		
//		list.stream().filter(item -> item % 5 == 0).forEach(System.out::println);
		
		ArrayList<String> stringList = Lists.newArrayList("x", "y", "f");
		stringList.forEach(s -> predicateMethod(s, "y"));

	}

}
