package services;

public class BrazilInterestService implements InterestService{
	private Double interest;

	public BrazilInterestService(Double interest) {
		this.interest = interest;
	}

	@Override
	public Double getInterest() {
		return interest;
	}

}
