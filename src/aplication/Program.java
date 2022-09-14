package aplication;

import java.util.Locale;
import java.util.Scanner;

import entities.champion;

public class Program {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the data of the first champion ");
		System.out.print("Name: ");
		String name = sc.next();

		System.out.print("Initial life: ");
		int life = sc.nextInt();

		System.out.print("Attack: ");
		int attack = sc.nextInt();

		System.out.print("Armor: ");
		int armor = sc.nextInt();

		champion c1 = new champion(name, armor, attack, life);
		
		System.out.println();
		System.out.println("Enter the data of the secund champion ");
		System.out.print("Name: ");
		name = sc.next();

		System.out.print("Initial life: ");
		life = sc.nextInt();

		System.out.print("Attack: ");
		attack = sc.nextInt();

		System.out.print("Armor: ");
		armor = sc.nextInt();

		champion c2 = new champion(name, armor, attack, life);

		System.out.println();
		System.out.printf("How many turns do you want to run? ");
		System.out.println();
		
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			c1.takeDamage(c2);
			c2.takeDamage(c1);

			System.out.printf("Result of the turn: %n", i+1);
			System.out.println();
			System.out.println(c1.status());
			System.out.println(c2.status());

			if (c1.getLife() <= 0 || c2.getLife() <= 0) {

				break;
			}
		}
		System.out.println("COMBAT END");
		sc.close();
	}

}
