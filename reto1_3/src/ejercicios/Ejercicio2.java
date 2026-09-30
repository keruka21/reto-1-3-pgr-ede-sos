package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		
		//VARIABLES
		Scanner sc = new Scanner(System.in);
		String dni;
		boolean masPart;
		int numCarPop, minsCar, secsCar, numPart = 0, totalTime = 0, numMenos60 = 0, numMenos45 = 0,
				numCarMas3 = 0, numCarMas5 = 0, mejTiempoTotal = 0, tiempoMed = 0, secsPromedio = 0;
		double porcentaje60 = 0;
			
		do {
			numPart++;
				
			System.out.print("Introduce el DNI del participante: ");
			dni = sc.next();
				
			while (dni.length() != 9) {
			System.out.println("ERROR: El DNI debe tener 9 caracteres de largo.");
			System.out.print("Introduce el DNI del participante: ");
			dni = sc.next();
			}
				
			System.out.println("¿Participa en la carrera individual o por parejas?");
			System.out.println("Escriba FALSE para individual o TRUE para parejas:");
			masPart = sc.nextBoolean(); 
				
			System.out.println("¿En cuántas carreras populares ha participado?");
			numCarPop = sc.nextInt();
				
			while (numCarPop < 0) {
				System.out.println("ERROR: El número de carreras no puede ser negativo.");
				System.out.print("Introduce un número válido: ");
				numCarPop = sc.nextInt();
			}
				
			if (numCarPop > 3) {
				numCarMas3++;
			}if(numCarPop > 5){
				numCarMas5++;
			}	
			
			System.out.println("Introduce cuántos minutos esta persona ha durado en la carrera:");
			minsCar = sc.nextInt();
				
			while (minsCar < 0) {
				System.out.println("ERROR: Los minutos no pueden ser menores que 0.");
				System.out.println("Introduce cuántos minutos esta persona ha durado en la carrera:");
				minsCar = sc.nextInt();
			}
				
			System.out.println("Introduce cuántos segundos esta persona ha durado en la carrera:");
			secsCar = sc.nextInt();
				
			while (secsCar < 0 || secsCar >= 60) {
				System.out.println("ERROR: Los segundos deben estar entre 0 y 59.");
				System.out.println("Introduce cuántos segundos esta persona ha durado en la carrera:");
				secsCar = sc.nextInt();
			}
				
			
			totalTime = (minsCar * 60) + secsCar;
			tiempoMed += totalTime; 
			
			//menos de 60
			if (totalTime < 3600) {
				numMenos60++;
				System.out.println("Ha conseguido terminar la carrera en menos de 60 minutos!!");
			} else {
				System.out.println("No ha conseguido terminar la carrera en menos de 60 minutos...");
			}
			
			porcentaje60 = (numMenos60 * 100)/numPart;
 
			//menos de 45
			if (totalTime < 2600) {
				numMenos45++;
				System.out.println("Ha conseguido terminar la carrera en menos de 45 minutos!!");
			} else {
				System.out.println("No ha conseguido terminar la carrera en menos de 45 minutos...");
			}

			// Mejor tiempo
			if (mejTiempoTotal == 0 || totalTime < mejTiempoTotal) {
				mejTiempoTotal = totalTime;
			}
				
			System.out.println("¿Quieres registrar más participantes?");
			System.out.println("Escriba FALSE para NO o TRUE para SÍ:");
			masPart = sc.nextBoolean();
				
		} while (masPart == true);
			
		
		System.out.println("Número de participantes total: " + numPart);
		System.out.println("Número de participantes que ha llegado a la meta en menos de 60 minutos: " + numMenos60);
		System.out.println("Porcentaje de participantes que ha llegado a la meta en menos de 60 minutos: " + (porcentaje60));
		System.out.println("Número de participantes que ha llegado a la meta en menos de 45 minutos: " + numMenos45);
		System.out.println("Número de participantes que ha participado en más de 3 carreras: " + numCarMas3);
		System.out.println("Número de participantes que ha participado en más de 5 carreras: " + numCarMas5);
			
		secsPromedio = tiempoMed / numPart;
		
		System.out.println("Tiempo medio de todos los corredores: " + (secsPromedio / 60) + " minutos y " + (secsPromedio % 60) + " segundos.");
		System.out.println("Mejor tiempo de la carrera: " + (mejTiempoTotal / 60) + " minutos y " + (mejTiempoTotal % 60) + " segundos.");
			
		sc.close();
		}
	}
