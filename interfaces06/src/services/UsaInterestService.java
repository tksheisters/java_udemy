package services;

public class UsaInterestService implements InterestService{
	private Double interest;

	public UsaInterestService(Double interest) {
		this.interest = interest;
	}

	@Override
	public Double getInterest() {
		return interest;
	}

}
