package services;

import java.security.InvalidParameterException;

public interface InterestService {
	Double getInterest();

	default Double payment(Double amount, Integer months) {
		if (months < 1) {
			throw new InvalidParameterException("Months must be greater than zero");
		}
		double interest = getInterest() / 100 + 1.0;
		return amount * Math.pow(interest, months);
	}
}
