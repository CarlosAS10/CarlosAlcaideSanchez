package calculadora;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int option;
		do {
			System.out.print("\n\n0.- Salir \n1.- Suma \n2.- Resta");
			System.out.print("\n\nOpción: ");
				option = sc.nextInt();
				
			switch(option) {
				case 1:
					suma();
					break;
				case 2:
					resta();
					break;
				case 3:
					multi();
					break;
				case 4:
					div();
					break;
			}
		} while(option != 0);
		
		System.err.print("\n\nEl programa ha terminado.");
	}
	
	public static void resta() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("\nPrimer número: ");
			int a = sc.nextInt();
		System.out.print("Segundo número: ");
			int b = sc.nextInt();
	
		System.out.printf("\n%d - %d = %d", a, b, (a - b));
	}
	
	public static void suma() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("\nPrimer número: ");
			int a = sc.nextInt();
		System.out.print("Segundo número: ");
			int b = sc.nextInt();
	
		System.out.printf("\n%d + %d = %d", a, b, (a + b));
	}
	
	public static void multi() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("\nPrimer número: ");
			int a = sc.nextInt();
		System.out.print("Segundo número: ");
			int b = sc.nextInt();
	
		System.out.printf("\n%d * %d = %d", a, b, (a * b));
	}
	
	public static void div() {
		
		Scanner sc = new Scanner(System.in);
				
		System.out.print("\nPrimer número: ");
			int a = sc.nextInt();
		System.out.print("Segundo número: ");
			int b = sc.nextInt();
	
		System.out.printf("\n%d / %d = %d", a, b, (a / b));
	}
}