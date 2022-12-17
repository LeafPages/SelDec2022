package week3.day1;

public class StateBank implements ReserveBank{

	@Override
	public String KnowYourCustomer() {
		return "PAN";
	}

	@Override
	public int minRateOfInterest() {
		return 3;
	}

}
