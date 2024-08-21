package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Room;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Room[] vect = new Room[10];
		System.out.println("Quantas quartos serão necessarios?");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			System.out.println("Digite o nome:");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.println("Digite o email:");
			String email = sc.nextLine();
			System.out.println("Digitee o numero do quarto:");
			int roomNumber = sc.nextInt();
			vect[roomNumber] = new Room(nome, email);

		}
		System.out.println("Busy rooms:");
		for (int i = 0; i < vect.length; i++) {
			if (vect[i] != null) {
				System.out.printf("%d : %s \n", i, vect[i]);
			}
		}
		sc.close();
	}

}
