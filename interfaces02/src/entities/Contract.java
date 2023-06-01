package entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Contract {
	private Integer contract;
	private LocalDate date;
	private Double totalValue;
	private List<Installment> installments = new ArrayList<>();

	public Contract(Integer contract, LocalDate date, Double totalValue) {
		this.contract = contract;
		this.date = date;
		this.totalValue = totalValue;
	}

	public Integer getContract() {
		return contract;
	}

	public void setContract(Integer contract) {
		this.contract = contract;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(Double totalValue) {
		this.totalValue = totalValue;
	}

	public List<Installment> getInstallments() {
		return installments;
	}

}
