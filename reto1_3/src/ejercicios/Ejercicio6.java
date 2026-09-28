package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//VARIABLES
		Scanner sc = new Scanner(System.in);
		int usernum, playsNum; //nº de jugadores y nº de partidas
		int playpoints, playenemies; //puntos x partida, enemigos x partida
		int playerpoints=0, playerenemies=0; //puntos/enemigos totales de un jugador
		int totalpoints=0, totalenemies=0;//total puntos de los jugadors
		int maxpoints = 0, playermax = 0; //maximo puntos, jugador con más puntos
		
		String bonus;
		
		System.out.println("Realizar un programa que registre las partidas jugadas por varios jugadores de un videojuego.");
		System.out.println("¿Cuántos jugadores se van a registrar.?");
		usernum = sc.nextInt();
		
		while (usernum <= 0){
			System.out.println("Error, no se pueden registrar 0 o menos de 0 jugadores");
			System.out.println("¿Cuántos jugadores se van a registrar.?");
			usernum = sc.nextInt();
			
		}
		
		for(int i=1; i<=usernum; i++){
			playerpoints=0;
			playerenemies=0;
			System.out.println("Número de partidas que ha jugado el Usuario " +i+ " : ");
			playsNum = sc.nextInt();
			while (playsNum < 0) {
				System.out.println("Error, un jugador no se puede introducir un numero negativo, introduce el numero denuevo");
				System.out.println("Número de partidas que ha jugado el Usuario " +i+ " : ");
				playsNum = sc.nextInt();
			}
			for(int j=1; j<=playsNum; j++){
				System.out.println("Partida Nº" +j+ " : ");
				System.out.println("Los puntos conseguidos:");
				playpoints = sc.nextInt();
				while (playpoints < 0) {
					System.out.println("Error, no se puede sacar una puntuacion negativa, introduce otro numero");
					System.out.println("Partida Nº" +j+ " : ");
					System.out.println("Los puntos conseguidos:");
					playpoints = sc.nextInt();
				}
				System.out.println("El número de enemigos derrotados.");
				playenemies = sc.nextInt();
				while (playenemies < 0) {
					System.out.println("Error, no se puede derrotar a un numero de enemigos negativo, introduce otro numero");
					System.out.println("El número de enemigos derrotados.");
					playenemies = sc.nextInt();
				}
				playerpoints += playpoints;
				playerenemies += playenemies;
			}
			if(totalpoints>=1000) {
				bonus = "SI, +100 puntos";
				playerpoints += 100;
			}else {
				bonus ="NO";
			}
			
			System.out.println("___________________________\n");
			System.out.println("Bonus: " +bonus);
			System.out.println("La puntuación total obtenida del Usuario " +i+ " es: " +playerpoints);
			System.out.println("El número total de enemigos derrotados del Usuario " +i+ " es: " +playerenemies);
			System.out.println("La puntuación media por partida es: " +(playerpoints/playsNum));
			totalpoints +=playerpoints;
			totalenemies +=playerenemies;
			if (playerpoints > maxpoints) {
                maxpoints = playerpoints;
                playermax = i;
            }
		}
		System.out.println("___________________________\n");
		System.out.println("El jugador con mayor puntuación es el Usuario " +playermax+ " con: " +maxpoints+ " puntos.");
		System.out.println("La puntuación total conseguida entre todos los jugadores: "  +totalpoints+ " puntos.");
		System.out.println("El número total de enemigos derrotados: " +totalenemies+ " enemigos.");
		
		sc.close();

	}

}
