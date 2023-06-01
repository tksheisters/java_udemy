package services;

import java.time.LocalDate;

import entities.Contract;
import entities.Installment;

public class ContractService {
	private OnlinePaymentService ops;

	public ContractService(OnlinePaymentService ops) {
		this.ops = ops;
	}

	public void processContract(Contract contract, Integer months) {
		double basicParcel = contract.getTotalValue() / months;

		for (int i = 1; i <= months; i++) {
			LocalDate dueDate = contract.getDate().plusMonths(i);

			double interest = ops.interest(basicParcel, i);
			double paymentFee = ops.paymentFee(basicParcel + interest);
			double parcel = basicParcel + paymentFee + interest;

			contract.getInstallments().add(new Installment(dueDate, parcel));
		}
	}
}
