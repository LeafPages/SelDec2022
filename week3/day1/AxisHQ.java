package week3.day1;

// abstract class can or cannot have abstract method
public abstract class AxisHQ implements ReserveBank{

	@Override
	public String KnowYourCustomer() {
		return "Aadhar";
	}

	public abstract void premiumCustomer();
	
	

}
