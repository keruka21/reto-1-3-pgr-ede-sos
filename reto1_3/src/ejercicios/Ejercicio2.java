package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		String dni;
		
		boolean masPart;
		
		int numCarPop, minsCar, secsCar, numPart = 0, numMenos60 = 0,
			numCarMas3 = 0, mejTiempoMins = 0, mejTiempoSecs = 0, tiempoMed = 0;
		
		do {
			numPart++;
			
			System.out.print("Introduce el DNI del participante: ");
			
			dni = sc.next();
			
			while (dni.length() != 9)
			{
				System.out.println("Error!! El DNI no puede ser 9 caracteres de largo" );
				System.out.print("Introduce el DNI del participante: ");
				
				dni = sc.next();
			}
			
			
			System.out.println("Participa en solitario o en pareja?" );
			System.out.println("Escriba FALSE o TRUE, respectivamente:");
			
			masPart = sc.nextBoolean();
			
			System.out.println("En cuantas carreras populares ha participado?");
			
			numCarPop = sc.nextInt();
			
			if (numCarPop >= 3)
			{
				numCarMas3++;
			}
			
			System.out.println("Introduce cuantos minutos esta persona ha durado en la carrera");
			
			minsCar = sc.nextInt();
			
			while (minsCar <= 0)
			{
				System.out.println("Error!! Los minutos no pueden ser menor que 0");
				System.out.println("Introduce cuantos minutos esta persona ha durado en la carrera");
				
				minsCar = sc.nextInt();
			}
			
			
			if (minsCar >= 60)
			{
				System.out.println("No conseguido terminar la carrera en menos de 60 minutos...");
			}
			else {
				numMenos60++;
				System.out.println("Ha conseguido terminar la carrera en menos de 60 minutos!!");
			}
			
			if (mejTiempoMins > minsCar || mejTiempoMins == 0)
			{
				mejTiempoMins = minsCar;
			}
			
			tiempoMed += minsCar;
			
			System.out.println("Introduce cuantos segundos esta persona ha durado en la carrera");
			
			secsCar = sc.nextInt();
			
			if (mejTiempoSecs > secsCar || mejTiempoSecs == 0)
			{
				mejTiempoSecs = secsCar;
			}
			
			System.out.println("Quieres registrar más participantes?");
			System.out.println("Escriba FALSE para NO o TRUE para SI:");
			
			masPart = sc.nextBoolean();
			
		} while (masPart == true);
		
		System.out.println("Número de participantes total: " + numPart);
		
		System.out.println("Número de participantes que ha llegado a la meta en menos de 60 minutos: " + numMenos60);
		
		System.out.println("Número de participantes que ha participado en más de 3 carreras: " + numCarMas3);
		
		System.out.println("Tiempo medio de todos los corredores: " + (tiempoMed / numPart ));
		
		System.out.println("Mejor tiempo de la carrera: " + mejTiempoMins + " minutos y " + mejTiempoSecs + " segundos.");
		
		
		sc.close();
		
		
		
	}

}
