package ejercicios;
import java.util.Scanner;
public class Ejercicio3 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int fechaOg=0, numBici = 0, fechaNew=0, revisionSi=0, revisionNo=0;
		double dia, mes, year;
		boolean otra=true;
		char respuesta;
		
		System.out.println("Introduzca la fecha");
	
		
		do {
			
			System.out.print(" · Número del día: ");
			dia = sc.nextDouble();
			fechaOg += dia;
			if (dia==0) {
				System.out.println("¡ERROR! El número no puede ser 0");
			}if (dia<0) {
				System.out.println("¡ERROR! El número no puede ser negativo");
			}if (dia>31) {
				System.out.println("¡ERROR! El número no puede ser mayor que 31");
			}if (dia%1!=0) {
				System.out.println("¡ERROR! El número no puede tener decimales");
			}
			
		} while (dia<=0 || dia>31 || dia%1!=0);
		
		do {
			
			System.out.print(" · Número del mes: ");
			mes = sc.nextDouble();
			fechaOg += mes*30;
			if (mes==0) {
				System.out.println("¡ERROR! El número no puede ser 0");
			}if (mes<0) {
				System.out.println("¡ERROR! El número no puede ser negativo");
			}if (mes>12) {
				System.out.println("¡ERROR! El número no puede ser mayor que 12");
			}if (mes%1!=0) {
				System.out.println("¡ERROR! El número no puede tener decimales");
			}
			
		} while (mes<=0 || mes>12 || mes%1!=0);
		
		
		do {
			
			System.out.print(" · Número del año: ");
			year = sc.nextDouble();
			fechaOg += year*365;
			if (year==0) {
				System.out.println("¡ERROR! El número no puede ser 0");
			}if (year<0) {
				System.out.println("¡ERROR! El número no puede ser negativo");
			}if (year%1!=0) {
				System.out.println("¡ERROR! El número no puede tener decimales");
			}
			
		} while (year<=0 || mes%1!=0);
		
		do  {
			System.out.print("Inserte el número de identificación de la bicicleta: ");
			sc.nextDouble();
			System.out.println("Inserte la fecha de la última revisión de la bicicleta: ");
			
			do {
				
				System.out.print(" · Número del día: ");
				dia = sc.nextDouble();
				fechaNew += dia;
				if (dia==0) {
					System.out.println("¡ERROR! El número no puede ser 0");
				}if (dia<0) {
					System.out.println("¡ERROR! El número no puede ser negativo");
				}if (dia>31) {
					System.out.println("¡ERROR! El número no puede ser mayor que 31");
				}if (dia%1!=0) {
					System.out.println("¡ERROR! El número no puede tener decimales");
				}
				
			} while (dia<=0 || dia>31 || dia%1!=0);
			
			do {
				
				System.out.print(" · Número del mes: ");
				mes = sc.nextDouble();
				fechaNew += mes*30;
				if (mes==0) {
					System.out.println("¡ERROR! El número no puede ser 0");
				}if (mes<0) {
					System.out.println("¡ERROR! El número no puede ser negativo");
				}if (mes>12) {
					System.out.println("¡ERROR! El número no puede ser mayor que 12");
				}if (mes%1!=0) {
					System.out.println("¡ERROR! El número no puede tener decimales");
				}
				
			} while (mes<=0 || mes>12 || mes%1!=0);
			
			
			do {
				
				System.out.print(" · Número del año: ");
				year = sc.nextDouble();
				fechaNew += year*365;
				if (year==0) {
					System.out.println("¡ERROR! El número no puede ser 0");
				}if (year<0) {
					System.out.println("¡ERROR! El número no puede ser negativo");
				}if (year%1!=0) {
					System.out.println("¡ERROR! El número no puede tener decimales");
				}
				
			} while (year<=0 || mes%1!=0);
			
			if (fechaNew-fechaOg>=365){
				System.out.println("Esta bicicleta necesita revisión");
				revisionSi+=1;
				
			}else {
				System.out.println("Esta bicicleta no necesita revisión");
				revisionNo+=1;
			}
			
			
			
			do {
				
				System.out.print("¿Quiere registrar otra bicicleta? Conteste S o N: ");
				respuesta = sc.next().toUpperCase().charAt(0);
				
				switch (respuesta) {
				case 'S':
					otra=true;
					break;
				case 'N':
					otra=false;
					break;
				default:
					System.out.println("¡Error! Por favor, conteste S o N");
				}
				
			}while(respuesta != 'S' && respuesta != 'N');
			
		}while (otra==true);
		
		System.out.println("Bicicletas que necesitan revisión: "+revisionSi);
		System.out.println("Bicicletas que no necesitan revisión: "+revisionNo);
		
		
		
		
}
}
