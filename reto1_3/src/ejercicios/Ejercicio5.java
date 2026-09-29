package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//variables
		Scanner sc=new Scanner(System.in);
		int usernum, diasNum;
		double minEntrena=0;
		//variables usuarios
		double mintotal=0;
		int min60=0;
		//variables grupo
		double mintotalgrupo = 0;
	    int totalDias = 0;
	    //variable usuario más min.
	    double maxMinutos = 0;
	    int usuarioMax = 0;
	     
		System.out.println("Registro de actividad semanal");
		System.out.println("---------------------------------------------");

		System.out.println("¿Cuantos usuarios se van a registrar?");
		usernum = sc.nextInt();
		
		while (usernum <= 0) {
            System.out.println("Error: El número de usuarios debe ser mayor que 0");
            System.out.println("Por favor, introduce cuantos usuarios se van a registrar: ");
            usernum = sc.nextInt();
        }
		
		
		for(int i=1; i<=usernum; i++) {
			mintotal = 0;
	        min60 = 0;
	        
	        System.out.println("------USUARIO " + i + "------");
			System.out.println("Número de días que has acudido al gimnasio durante la semana:");
			diasNum = sc.nextInt();
			while (diasNum <= 0 || diasNum > 7) {
		            System.out.println("Error: El número de dias debe ser entre 1 y 7.");
		            System.out.print("Por favor, introduce el número de dias: ");
		            diasNum = sc.nextInt();
		        }
			totalDias+=diasNum; //contador dias que se realiza ejercicio
		        
			for(int j=1; j<=diasNum; j++) {
				System.out.println("¿Cuantos minutos entrenaste el día " +j+ "?");
				minEntrena = sc.nextDouble();
				 while (minEntrena < 0) {
	                    System.out.println("Error: Los minutos no pueden ser negativos.");
	                    System.out.print("Introduce los minutos entrenados el día " + j + ": ");
	                    minEntrena = sc.nextDouble();
	             }
				System.out.println("El día " +j+ " entrenaste " +minEntrena+ " minutos");
				mintotal += minEntrena;
				if(minEntrena >60) {
						min60++; //veces que se realizó mas de 60 minutos de ejercicio esa semana
				}
			}
			System.out.println("--------------------------------");	
			System.out.println("REGISTRO DEL USUARIO " +i);		
			System.out.println("El número total de minutos realizados durante la semana:" +mintotal); //total minutos
			System.out.println("La media de minutos por día de asistencia:" +(mintotal/diasNum)); //media semanal
			System.out.println("El número de días en los que ha realizado más de 60 minutos de ejercicio:" +min60);
			System.out.println("--------------------------------");
			
			if(mintotal >300) {
				System.out.println("¡FELICIDADES! Has superado el objetivo semanal en: " +(mintotal-300)+ " minutos.");

			}else {
				System.out.println("¡VAYA! :-( No has superado el objetivo semanal, te faltan " +(300 - mintotal)+ " minutos.");
			}
			mintotalgrupo += mintotal; //minutos totales de ejercicio
			
			if (mintotal > maxMinutos) { //si los minutos totales de usuario son mayores que el maximo de minutos registrados
                maxMinutos = mintotal; //max minutos registrados es el num max de minutos del usuario
                usuarioMax = i; //numero maximo de ejercicio es igual al usuario i
            }
        }
		
		System.out.println("--------------------------------");	
		System.out.println("REGISTRO DEL GRUPO");
		System.out.println("El usuario que realizó más minutos de ejercicio fue el Usuario "
                + usuarioMax + " con " + maxMinutos + " minutos.");

        System.out.println("El número total de minutos realizados entre todos los usuarios es de: "
                + mintotalgrupo + " minutos.");
        System.out.println("El número total de días de entrenamiento registrados es de: "
                + totalDias + " días.");
				
		sc.close();
	}
}