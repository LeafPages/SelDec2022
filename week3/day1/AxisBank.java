package week3.day1;


// implements keyword --> connects class to the interface !!
public class AxisBank extends AxisHQ implements ReserveBank {


	@Override
	public String KnowYourCustomer() {
		return "Aadhar";
	}
	
	public int minWithdrawalLimit() {
		return 500;
	}

	@Override
	public int minRateOfInterest() {
		return 3;
	}

	@Override
	public void premiumCustomer() {
		// TODO Auto-generated method stub
		
	}

}
