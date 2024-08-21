package Application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Entities.Employee;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos empregados serão registrados?");
		int n = sc.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.println("Funcionario #" + (i + 1) + ":");
			System.out.print("Id:");
			Integer id = sc.nextInt();

			while (hasID(list, id)) {
				System.out.println("Este ID já existe!, Digite outro");
				id = sc.nextInt();
			}

			System.out.println("Nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Salario:");
			Double salario = sc.nextDouble();

			Employee emp = new Employee(id, nome, salario);

			list.add(emp);
			System.out.println(emp.toString());

		}
		System.out.println("Entre com o id do empregado que deseja incrementar o salario");
		int idsalary = sc.nextInt();

		// Integer pos = position(list, idsalary);

		Employee emp = list.stream().filter(x -> x.getId() == idsalary).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("Esse id nao existe!");
		} else {
			System.out.print("Entre com a porcentagem: ");
			double percent = sc.nextDouble();
			emp.increaseSalary(percent);
		}

		System.out.println();
		System.out.println("Lista de empregados:");
		for (Employee e : list) {
			System.out.println(e);
		}

		sc.close();
	}

	public static Integer position(List<Employee> list, int id) {
		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getId() == id) {
				return i;
			}
		}
		return null;
	}

	public static boolean hasID(List<Employee> list, int id) {

		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		// procura se o id digitado existe
		return emp != null;
	}

}
