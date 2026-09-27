package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//variables
		Scanner sc=new Scanner(System.in);
		int usernum, option;
		double coche, bus, bici, plancha, movil, ordenador, co2Usuarios=0, co2Grupo=0;
		boolean planchaUso;
		String username;
		
		
		
		//numero de usuarios
		System.out.println("CALCULADORA DIARIA DE HUELLA DE CARBONO");
		System.out.println("¡Hola! \n\"Por favor, introduce cuantos usuarios se van a registrar: ");
		usernum = sc.nextInt();
		
		//validación
		while (usernum <= 0) {
            System.out.println("Error: El número de personas debe ser mayor que 0");
            System.out.print("Por favor, introduce cuantos usuarios se van a registrar: ");
            usernum = sc.nextInt();
        }

		
		System.out.println("Vamos a calcular el consumo diario de C02");
		//for hasta que se registren los datos del nº de usuarios hemos introducido
		for (int i=1; i<=usernum; i++) {
			//nomnbre del usuario
			System.out.print("Introduce el nombre del Usuario " + i + ": ");
            username = sc.next();
            //do while hasta que se escoja la opción 7
			do {
				System.out.println("Escoge las opciones una por una, Usuario " +i+ " - "+username.toUpperCase());
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
					while (coche < 0) {
                        System.out.println("Error \nPor favor, introduce un número válido:");
                        coche = sc.nextDouble();
                    }
					co2Usuarios += coche*0.21;
					break;
				case 2:
					System.out.println("¿Cuántos kilometros has recorrido en autobús?");
					bus = sc.nextDouble();
					while (bus < 0) {
                        System.out.println("Error \nPor favor, introduce un número válido:");
                        bus = sc.nextDouble();
                    }
					co2Usuarios += bus*0.1;
					break;
				case 3:
					System.out.println("Introduce la cantidad de kms que has viajado en bicicleta:");
					bici = sc.nextDouble();
					co2Usuarios += bici*0;
					break;
				case 4:
					System.out.println("¿Has usado la plancha? Si: true, No: false");
					planchaUso = sc.nextBoolean();
					if (planchaUso == true) {
						System.out.println("Introduce cuantas horas la has usado");
						plancha = sc.nextDouble();
						while (plancha < 0) {
	                        System.out.println("Error \nPor favor, introduce un número válido:");
	                        plancha = sc.nextDouble();
	                    }
						co2Usuarios += plancha*0.7;
					}
					break;
				case 5:
					System.out.println("¿Cuantas horas has usado el ordenador?");
					ordenador = sc.nextDouble();
					while (ordenador < 0) {
                        System.out.println("Error \nPor favor, introduce un número válido:");
                        ordenador = sc.nextDouble();
                    }
					co2Usuarios += ordenador * 0.08;
					break;
				case 6:
					System.out.println("¿Cuantas horas has usado el móvil?");
					movil = sc.nextDouble();
					while (movil< 0) {
                        System.out.println("Error \nPor favor, introduce un número válido:");
                        movil = sc.nextDouble();
                    }
					co2Usuarios += movil * 0.02;
					break;
				case 7:
					System.out.print("---------------------------------------------------------------");
					System.out.print("El usuario " + i +  " - " +username+ " ha consumido " + co2Usuarios + " kg de CO2.\n");
				     co2Grupo += co2Usuarios;
					break;
				default:
					System.out.println("Por favor introduce una opción válida");
				}
			
	
			}while(option!=7);
		}
		System.out.println("El consumo total de tu grupo de usuarios es de"  +co2Grupo+" kg de CO2.\n");
		sc.close();
	}

}
