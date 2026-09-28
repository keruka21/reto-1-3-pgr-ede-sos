package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//variables
		Scanner sc = new Scanner(System.in);
		int usernum, option;
		boolean plancha;
		double coche, bus, bici, movil, ordenador, moto, lancha, planchaHoras, co2Usuario=0, co2Grupo=0;
		double totalCoche = 0, totalBus = 0, totalBici = 0, totalPlancha = 0, totalOrdenador = 0, totalMovil = 0, totalMoto = 0, totalLancha = 0;
		double masCO2;
		String masActividad;
		String username;
		
		
		
		//numero de usuarios
		System.out.println("¡Hola! \n¿Cuantos usuarios sois?");
		usernum = sc.nextInt();
		while(usernum <= 0) {
			System.out.println("El numero de usuarios debe ser mayor que 0.");
			usernum = sc.nextInt();
		}
		System.out.println("Vamos a introducir el consumo individual de cada usuario");
		
		for (int i=1; i<=usernum; i++) {
			
			co2Usuario = 0;
			
			System.out.println("Por favor, introduce tu nombre de usuario:");
			username = sc.next();
			System.out.println("Vamos a calcular tu consumo diario de C02 " +username);
			
			do {
				System.out.println("Opciones:");
				System.out.println("1.¿Cuantos kilómetros has recorridos en coche hoy?");
				System.out.println("2.¿Cuantos kilómetros has recorridos en autobús hoy?");
				System.out.println("3.¿Cuantos kilómetros has recorridos en bicicleta?");
				System.out.println("4.¿Has usado la plancha hoy?¿Cuantas horas?");
				System.out.println("5.¿Cuantas horas has usado el ordenador hoy?");
				System.out.println("6.¿Cuantas horas utilizaste el móvil hoy?");
				System.out.println("7.¿Cuantos kilómetros has recorridos en moto hoy?");
				System.out.println("8.¿Cuantos kilómetros has recorridos en lancha hoy?");
				System.out.println("9. Finalizar actividades del dia");
				
				option = sc.nextInt();
				
				switch (option) { 
				
				case 1:
					System.out.println("¿Cuántos kilometros has recorrido en coche?");
					coche = sc.nextDouble();
					while(coche < 0) {
						System.out.println("El numero no puede ser negativo, porfavor introduce otro numero");
						coche = sc.nextDouble();
					}
					
					co2Usuario += (coche*0.21);
					totalCoche += (coche*0.21);
					
					break;
				case 2:
					
					System.out.println("¿Cuántos kilometros has recorrido en autobús?");
					bus = sc.nextDouble();
					
					while(bus < 0) {
						System.out.println("El numero no puede ser negativo, porfavor introduce otro numero");
						bus = sc.nextDouble();
					}
					
					co2Usuario += (bus*0.1);
					totalBus += (bus*0.1);
					
					break;
				case 3:
					
					System.out.println("Introduce la cantidad de kms que has viajado en bicicleta:");
					bici = sc.nextDouble();
					
					while(bici < 0) {
						System.out.println("El numero no puede ser negativo, porfavor introduce otro numero");
						bici = sc.nextDouble();
					}
					
					co2Usuario += (bici*0);
					totalBici += (bici*0);
					
					break;
				case 4:
					System.out.println("Has usado la plancha? Si: true, No: false");
					plancha = sc.nextBoolean();
					while(plancha != true && plancha != false) {
						System.out.println("Respuesta incorrecta. Introduce true para SI o false para NO");
						plancha = sc.nextInt();
					}
					if (plancha == true) {
						System.out.println("Introduce cuantas horas la has usado");
						planchaHoras = sc.nextDouble();
						while(planchaHoras < 0) {
							System.out.println("El numero no puede ser negativo, porfavor introduce otro numero");
							planchaHoras = sc.nextDouble();
						}
						co2Usuario += (planchaHoras*0.7);
						totalPlancha += (planchaHoras*0.7);
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
					totalOrdenador += (ordenador * 0.08);
					
					break;
				case 6:
					
					System.out.println("¿Cuantas horas has usado el móvil?");
					movil = sc.nextDouble();
					
					while(movil < 0) {
						System.out.println("El numero no puede ser negativo, porfavor introduce otro numero");
						movil = sc.nextDouble();
					}
					
					co2Usuario += (movil * 0.02);
					totalMovil += (movil * 0.02);
					
					break;
case 7:
					
					System.out.println("¿Cuantos kilómetros has recorridos en moto hoy?");
					moto = sc.nextDouble();
					
					while(moto < 0) {
						System.out.println("El numero no puede ser negativo, porfavor introduce otro numero");
						moto = sc.nextDouble();
					}
					
					co2Usuario += (moto * 0.9);
					totalMoto += (moto * 0.9);
					
					break;
					
				case 8:
					
					System.out.println("¿Cuantos kilómetros has recorridos en lancha hoy?");
					lancha = sc.nextDouble();
					
					while(lancha < 0) {
						System.out.println("El numero no puede ser negativo, porfavor introduce otro numero");
						lancha = sc.nextDouble();
					}
					
					co2Usuario += (lancha * 0.5);
					totalLancha += (lancha * 0.5);
					
					break;
				case 9:
					
					System.out.println("El usuario" +i+" " +username+ " ha consumido un total de " +(co2Usuario)+ "kg de C02 hoy.");
					co2Grupo += co2Usuario;
					
					break;
					
				default:
					
					System.out.println("Por favor introduce una opción válida");
				}
			System.out.println("El consumo total de tu grupo de usuarios es de: " + co2Grupo );
	
			}while(option!=9);
		}
		masCO2 = totalCoche;
		masActividad = "coche";
		
		if(totalBus > masCO2) {
			masCO2 = totalBus;
			masActividad = "autobús";
		}
		
		if(totalBici > masCO2) {
			masCO2 = totalBici;
			masActividad = "bicicleta";
		}
		
		if(totalPlancha > masCO2) {
			masCO2 = totalPlancha;
			masActividad = "plancha";
		}
		
		if(totalOrdenador > masCO2) {
			masCO2 = totalOrdenador;
			masActividad = "ordenador";
		}
		
		if(totalMovil >masCO2) {
			masCO2 = totalMovil;
			masActividad = "móvil";
		}
		
		if(totalMoto > masCO2) {
			masCO2 = totalMoto;
			masActividad = "moto";
		}
		
		if(totalLancha > masCO2) {
			masCO2 = totalLancha;
			masActividad = "lancha";
		}
		
		System.out.println("El consumo total de tu grupo de usuarios es de: " + co2Grupo + " kg de C02");
		System.out.println("La actividad que más CO2 genera es: " + masActividad);
		System.out.println("Esta actividad genera un total de: " + masCO2 + " kg de C02");
		System.out.println("La actividad con mayor margen de mejora es: " + masActividad);
		
		sc.close();
	}

}
