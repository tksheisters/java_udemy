package entities;

public abstract class Device {
	public String serialNumber;

	public Device() {
		super();
	}

	public Device(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public void processDoc(String doc) {

	}
}
