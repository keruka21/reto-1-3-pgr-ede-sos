package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//variables
		Scanner sc=new Scanner(System.in);
		int usernum;
		int option;
		
		//numero de usuarios
		System.out.println("Por favor, introduce el número de usuarios:");
		usernum = sc.nextInt();
			
		for (int i=0; i==usernum; i++) {
			do {
				System.out.println("----Menu----");
				System.out.println("1.Kilómetros recorridos en coche: ");
				System.out.println("2.Kilómetros recorridos en autobús: ");
				System.out.println("3.Kilómetros recorridos en bicicleta");
				System.out.println("4.¿Has usado la plancha?¿Cuantas horas?");
				System.out.println("5.¿Cuantas horas has usado el ordenador?");
				System.out.println("6.¿Cuantas horas utilizaste el móvil?");
				System.out.println("7. Finalizar actividades del dia");
				
				option = sc.nextInt();
				switch (option) {
				case 1:
					
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				case 6:
					break;
				case 7:
					break;
				default:
				}
				
				
			}while(option!=7);
		}

	}

}
