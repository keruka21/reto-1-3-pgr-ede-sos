package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		int clientesRegistrar, entradasAdultos, entradasInfantiles, totalAdultos = 0,totalInfantiles = 0, maxEntradas = 0, maxCliente = 0;
		double precioDescuento, precioNormal, totalRecaudado = 0;
		System.out.println("Cuantos clientes se van a registrar?");
		clientesRegistrar = teclado.nextInt();
		while (clientesRegistrar <= 0){
			System.out.println("Error, tienes que registrar al menos un cliente, introduce otro numero");
			clientesRegistrar = teclado.nextInt();
		}
		
		for(int i = 0; i < clientesRegistrar;i++) {
			
			System.out.println("Cuantas entradas de adultos quieres?");
			entradasAdultos = teclado.nextInt();
			while (entradasAdultos < 0){
				System.out.println("Error, no puedes introducir un numero negativo. Introduce otro numero");
				entradasAdultos = teclado.nextInt();
			}
			
			System.out.println("Cuantas entradas infantiles quieres?");
			entradasInfantiles = teclado.nextInt();
			while (entradasInfantiles < 0){
				System.out.println("Error, no puedes introducir un numero negativo. Introduce otro numero");
				entradasInfantiles = teclado.nextInt();
			}
			while(entradasAdultos == 0 && entradasInfantiles == 0) {
				System.out.println("Error, no puedes no pedir entradas");
				System.out.println("Cuantas entradas de adultos quieres?");
				entradasAdultos = teclado.nextInt();
				while (entradasAdultos < 0){
					System.out.println("Error, no puedes introducir un numero negativo. Introduce otro numero");
					entradasAdultos = teclado.nextInt();
				}
				System.out.println("Cuantas entradas de infantiles quieres?");
				entradasInfantiles = teclado.nextInt();
				while (entradasInfantiles < 0){
					System.out.println("Error, no puedes introducir un numero negativo. Introduce otro numero");
					entradasInfantiles = teclado.nextInt();
				}
				
			}
			System.out.println("Has comprado " + entradasAdultos + " entradas para adultos" );
			System.out.println("Has comprado " + entradasInfantiles + " entradas para niños" );
			System.out.println("Has comprado un total de " + (entradasAdultos + entradasInfantiles) + " entradas");
			if ((entradasAdultos + entradasInfantiles) >= 5) {
				precioDescuento = ((entradasAdultos * 9) * 0.9) + ((entradasInfantiles * 6) * 0.9);
				System.out.println("el precio total de las entradas es " + precioDescuento + " €");
				totalRecaudado += precioDescuento;
				totalAdultos +=entradasAdultos;
				totalInfantiles += entradasInfantiles;
			}
			else {
				 precioNormal = (entradasAdultos * 9)  + (entradasInfantiles * 6) ;
				 System.out.println("el precio total de las entradas es " + precioNormal + " €");
				 totalRecaudado += precioNormal;
				 totalAdultos +=entradasAdultos;
				 totalInfantiles += entradasInfantiles;
			}
			
			if ((entradasAdultos + entradasInfantiles) > maxEntradas) {
				maxEntradas = (entradasAdultos + entradasInfantiles);
				maxCliente = i;
			}
			
		}
		System.out.println("El dinero total recaudado ha sido de " + totalRecaudado + " €");
		System.out.println("El numero total de entradas de adulto ha sido " + totalAdultos);
		System.out.println("El numero total de entradas infantiles ha sido " + totalInfantiles);
		System.out.println("El cliente " + (maxCliente + 1) + "ha sido el cliente que mas entradas ha comprado con un total de " + maxEntradas + " entradas");
		teclado.close();
		
		
	}
	
	
	

}
