package cote.exam1020;

public class PartTimeEmployee extends Employee{
	public int hourlyRate;
	public int workHour;
	
	public PartTimeEmployee(String name, String employeeId, int hourlyRate, int workHour) {
		super(name, employeeId);
		this.hourlyRate = hourlyRate;
		this.workHour = workHour;
	}
	
	public void setHourlyRate(int hourlyRate) {
		this.hourlyRate = hourlyRate;
	}
	
	public int getHourlyRate() {
		return hourlyRate;
	}
	
	public void setWorkHour(int workHour) {
		this.workHour = workHour;
	}
	
	public int getWorkHour() {
		return workHour;
	}
	
	@Override
	public int calculatePay() {
		
		return hourlyRate*workHour;
	}

}
