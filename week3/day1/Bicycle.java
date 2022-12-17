package week3.day1;

public class Bicycle {
	
	
	// If there is only one cycle at home, then you intent to ask no input
	public String getCycleColor() {
		return "black";
	}
	
	// This is called overloading
	/*
	 * If the method signature is same but
	 * with different argument count 
	 * or with different data type 
	 * with in the same class 
	 * 
	 * Benefits: to improve verbose !!
	 * 
	 */
	public String getCycleColor(String whose) {
		if(whose.equals("son"))
			return "red";
		else if(whose.equals("daughter"))
			return "pink";
		else if(whose.equals("spouse"))
			return "grey";
		else
			return "black";
	}
	
	public String getCycleColor(int cycleNumber) {
		if(cycleNumber == 3772717) {
			return "blue";
		} else {
			return "black";
		}
		
	}

	public void getCycleColor(String whose, int cycleNumber) {
		
	}
	
	public void getCycleColor(int cycle, String whose) {
		
	}
}
