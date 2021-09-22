package app;

import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class MainEmployee {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee funcionario = new Employee();
		
		
		System.out.print("Name: ");
		funcionario.name = sc.nextLine();
		System.out.print("Gross salary: ");
		funcionario.grossSalary = sc.nextDouble();
		System.out.print("Tax (Imposto): ");
		funcionario.taxaImposto = sc.nextDouble();
		funcionario.showEmployee();
		
		System.out.print("\n\nWhich percentage to increase salary? ");
		double porcentagem = sc.nextDouble();
		funcionario.increaseSalary(porcentagem);
		
		System.out.println("\nUpdated data: " + funcionario);
		
		sc.close();
	}

}
