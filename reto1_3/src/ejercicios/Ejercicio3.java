package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {
	
	public static void main(String[] args) {
		//VARIABLES
		Scanner sc = new Scanner(System.in);
		int dateAct=0, dateLast=0, revisionY=0, revisionN=0;  //fecha actual, fecha ultima revision, rev si, rev no
		int day, month, year;
		boolean option=true;
		char answ; //respuesta S/N
		
		//fecha actual
		System.out.println("Por favor, introduzca la fecha actual:");
		
		do {
			System.out.print("Número del día: ");
			day= sc.nextInt();
			if (day==0) {
				System.out.println("¡ERROR! El número no puede ser 0.");
			}if (day<0) {
				System.out.println("¡ERROR! El número no puede ser negativo.");
			}if (day>31) {
				System.out.println("¡ERROR! El número no puede ser mayor que 31.");
			}
			
		} while (day<=0 || day>31);
		
		do {
			System.out.print("Número del mes: ");
			month = sc.nextInt();
			if (month==0) {
				System.out.println("¡ERROR! El número no puede ser 0.");
			}if (month<0) {
				System.out.println("¡ERROR! El número no puede ser negativo.");
			}if (month>12) {
				System.out.println("¡ERROR! El número no puede ser mayor que 12.");
			}
		} while (month<=0 || month>12);
		
		
		do {
			System.out.print("Número del año: ");
			year = sc.nextInt();
			if (year==0) {
				System.out.println("¡ERROR! El número no puede ser 0.");
			}if (year<0) {
				System.out.println("¡ERROR! El número no puede ser negativo.");
			}
		} while (year<=0);
		
		dateAct = day + (month * 30) + (year * 365); //pasamos todo a dias
		
		//ID
		do {
			System.out.print("Inserte el número de identificación de la bicicleta: ");
			sc.nextInt();
			
			System.out.println("Inserte la fecha de la última revisión de la bicicleta: ");
			//fecha ult. revision
			do {
				System.out.print("Número del día: ");
				day = sc.nextInt();
				if (day==0) {
					System.out.println("¡ERROR! El número no puede ser 0");
				}if (day<0) {
					System.out.println("¡ERROR! El número no puede ser negativo");
				}if (day>31) {
					System.out.println("¡ERROR! El número no puede ser mayor que 31");
				}
			} while (day<=0 || day>31);
			
			
			do {
				System.out.print("Número del mes: ");
				month = sc.nextInt();
				if (month==0) {
					System.out.println("¡ERROR! El número no puede ser 0");
				}if (month<0) {
					System.out.println("¡ERROR! El número no puede ser negativo");
				}if (month>12) {
					System.out.println("¡ERROR! El número no puede ser mayor que 12");
				}
			} while (month<=0 || month>12);
			
			
			do {
				System.out.print("Número del año: ");
				year = sc.nextInt();
				if (year==0) {
					System.out.println("¡ERROR! El número no puede ser 0");
				}if (year<0) {
					System.out.println("¡ERROR! El número no puede ser negativo");
				}
			} while (year<=0);
			
			
			dateLast = day + (month * 30) + (year * 365); //pasamos todo a dias
			
			
			if (dateAct - dateLast>=365){
				System.out.println("Esta bicicleta necesita revisión.");
				revisionY+=1;
				
			}else {
				System.out.println("Esta bicicleta no necesita revisión.");
				revisionN+=1;
			}
		
			do {
				System.out.print("¿Quiere registrar otra bicicleta? Conteste S (si) o N (no): ");
				answ = sc.next().toUpperCase().charAt(0);
				
				switch (answ) {
				case 'S':
					option=true;
					break;
				case 'N':
					option=false;
					break;
				default:
					System.out.println("¡Error! Por favor, conteste S o N");
				}
				
			}while(answ != 'S' && answ != 'N');
			
		}while (option==true);
		
		System.out.println("Bicicletas que necesitan revisión: " +revisionY);
		System.out.println("Bicicletas que no necesitan revisión: " +revisionN);
		sc.close();	
	}
}
