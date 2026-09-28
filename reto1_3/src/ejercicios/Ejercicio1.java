package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//variables
		Scanner sc=new Scanner(System.in);
		int usernum, option;
		double coche, bus, bici, movil, ordenador, planchaHoras, co2Usuario=0, co2Grupo=0;
		boolean plancha;
		String username;
		
		
		
		//numero de usuarios
		System.out.println("¡Hola! \n¿Cuantos usuarios sois?");
		usernum = sc.nextInt();
		System.out.println("Vamos a introducir el consumo individual de cada usuario");
		System.out.println("Por favor, introduce tu nombre de usuario:");
		username = sc.next();
		System.out.println("Vamos a calcular tu consumo diario de C02 " +username);
		for (int i=1; i<=usernum; i++) {
			do {
				System.out.println("Opciones:");
				System.out.println("1.¿Cuantos kilómetros has recorridos en coche hoy?");
				System.out.println("2.¿Cuantos kilómetros has recorridos en autobús hoy?");
				System.out.println("3.¿Cuantos kilómetros has recorridos en bicicleta?");
				System.out.println("4.¿Has usado la plancha hoy?¿Cuantas horas?");
				System.out.println("5.¿Cuantas horas has usado el ordenador hoy?");
				System.out.println("6.¿Cuantas horas utilizaste el móvil hoy?");
				System.out.println("7. Finalizar actividades del dia");
				
				option = sc.nextInt();
				switch (option) { 
				case 1:
					System.out.println("¿Cuántos kilometros has recorrido en coche?");
					coche = sc.nextDouble();
					co2Usuario += (coche*0.21);
					break;
				case 2:
					System.out.println("¿Cuántos kilometros has recorrido en autobús?");
					bus = sc.nextDouble();
					co2Usuario += (bus*0.1);
					break;
				case 3:
					System.out.println("Introduce la cantidad de kms que has viajado en bicicleta:");
					bici = sc.nextDouble();
					co2Usuario += (bici*0);
					break;
				case 4:
					System.out.println("Has usado la plancha? Si: true, No: false");
					plancha = sc.nextBoolean();
					if (plancha == true) {
						System.out.println("Introduce cuantas horas la has usado");
						planchaHoras = sc.nextDouble();
						co2Usuario += (planchaHoras*0.7);
					}
					break;
				case 5:
					System.out.println("¿Cuantas horas has usado el ordenador?");
					ordenador = sc.nextDouble();
					while(ordenador < 0) {
						System.out.println("El numero no puede ser negativo, porfavor introduce otro numero");
						ordenador = sc.nextDouble();
					}
					co2Usuario += (ordenador * 0.08);
					break;
				case 6:
					System.out.println("¿Cuantas horas has usado el móvil?");
					movil = sc.nextDouble();
					while(movil < 0) {
						System.out.println("El numero no puede ser negativo, porfavor introduce otro numero");
						movil = sc.nextDouble();
					}
					co2Usuario += (movil * 0.02);
					break;
				case 7:
					System.out.println("El usuario:" +username+ " ha consumido un total de " +(co2Usuario)+ "kg de C02 hoy."); //tiene que ser la suma, cambiar
					System.out.println("Por favor, introduce tu nombre de usuario:");
					username = sc.next();
					System.out.println("Vamos a calcular tu consumo diario de C02 " +username);
					break;
				default:
					System.out.println("Por fdavor introduce una opción válida");
				}
			System.out.println("El consumo total de tu grupo de usuarios es de: " + co2Grupo );
	
			}while(option!=7);
		}
		
		sc.close();
	}

}
