package week3.day2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class LearnSet {

	public static void main(String[] args) {
		
		// HashSet --> Performance !! 
		
		Set<String> companies = new HashSet<String>();
		boolean add = companies.add("TCS");
		System.out.println(add);
		companies.add("CTS");
		companies.add("GOOGLE");
		companies.add("AMAZON");
		companies.add("WIPRO");
		boolean add2 = companies.add("TCS");
		System.out.println(add2);

		System.out.println(companies);

		


	}

}
