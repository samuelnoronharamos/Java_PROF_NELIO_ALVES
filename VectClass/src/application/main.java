package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		System.out.println("Quantas pessoas serão digitadas?");
		int n = sc.nextInt();

		Pessoa[] vect = new Pessoa[n];

		for (int i = 0; i < vect.length; i++) {
			sc.nextLine();
			System.out.println("Digite o nome:");
			String nome = sc.nextLine();
			System.out.println("Digite a idade:");
			int idade = sc.nextInt();
			System.out.println("Digite a altura:");
			double altura = sc.nextDouble();
			vect[i] = new Pessoa(nome, idade, altura);
		}

		double sum = 0;
		for (int i = 0; i < vect.length; i++) {
			sum += vect[i].getAltura();
		}
		double avg = sum / vect.length;
		for (int i = 0; i < vect.length; i++) {
			System.out.println(vect[i].toString());
		}

		System.out.printf("A media de altura é: %.2f %n", avg);
		double menores=0;
		for (int i = 0; i < vect.length; i++) {

			if (vect[i].getIdade() < 16) {
				menores++;
				System.out.println(vect[i].getNome() + " tem a idade menor que 16");
				
			}
		}
		double perc = (	menores/vect.length)*100;
		System.out.printf("%.2f%%  das pessoas são menores de 16 anos", perc);
	}
	

}
