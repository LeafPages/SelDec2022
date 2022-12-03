package week1.day1;

public class PrintCycleInformation {

	public static void main(String[] args) {
		
		// How to access Cycle class and call the methods !!
		
		// 1) Create an Object
		// ClassName obj = new ClassName();
		Bicycle cycle = new Bicycle();
		
		// how to call method?
		// obj.methodName();
		System.out.println(cycle.getCycleCount());
		System.out.println(cycle.getCycleColor("Hero"));

	}

}
