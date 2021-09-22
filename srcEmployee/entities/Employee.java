package entities;

public class Employee {

	public String name;
	public double grossSalary;
	public double taxaImposto;
	
	public double netSalary() {
		return grossSalary - taxaImposto;
	}
	
	public void increaseSalary(double percentage) {
		grossSalary += grossSalary * percentage / 100.0;
	}
	
	public String toString() {
		return name
			+ ", R$"
			+ String.format("%.2f", netSalary());
	}
	
	public void showEmployee() {
		System.out.printf("%s, R$ %.2f", name, netSalary());
	}
	
	

}
