package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//VARIABLES
		Scanner sc = new Scanner(System.in);
		int userNum, playsNum; //nº de jugadores y nº de partidas
		int playpoints, playenemies, playerenemies=0; //puntos x partida, enemigos x partida y jugador
		double playerpoints=0, totalpoints=0,  maxpoints = 0;//double porque luego hay que hacer la media
		int totalenemies=0; //enemigos en total
		int playermax = 0, bonusCount =0;//jugador con más puntos y cuantos bonus
		
		System.out.println("Registro de partidas");
		System.out.println("=========================");
		System.out.println("¿Cuántos jugadores se van a registrar.?");
		userNum = sc.nextInt();
		
		while (userNum <= 0){
			System.out.println("Error, no se pueden registrar 0 o menos de 0 jugadores");
			System.out.println("¿Cuántos jugadores se van a registrar?");
			userNum = sc.nextInt();
		}
		
		for(int i=1; i<=userNum; i++){
			playerpoints=0;
			playerenemies=0;
			bonusCount = 0;
			
			System.out.println("Número de partidas que ha jugado el Usuario " +i+ " : ");
			playsNum = sc.nextInt();
			while (playsNum < 0) {
				System.out.println("Error, no puede introducir un numero negativo.");
				System.out.println("Número de partidas que ha jugado el Usuario " +i+ " : ");
				playsNum = sc.nextInt();
			}
			for(int j=1; j<=playsNum; j++){
				System.out.println("Partida Nº" +j+ " : ");
				System.out.println("Los puntos conseguidos:");
				playpoints = sc.nextInt();
				
				while (playpoints < 0) { 
					System.out.println("Error, no se puede tener una puntuación negativa.");
					System.out.println("Los puntos conseguidos:");
					playpoints = sc.nextInt();
				}
				System.out.println("El número de enemigos derrotados.");
				playenemies = sc.nextInt();
				
				while (playenemies < 0) {
					System.out.println("Error, no se puede derrotar a un numero de enemigos negativo.");
					System.out.println("El número de enemigos derrotados.");
					playenemies = sc.nextInt();
				}
				
				if (playpoints > 1000) {
				    playerpoints += 100;
				    bonusCount++; 
				}

				playerpoints += playpoints;
				playerenemies += playenemies;
			}
			
			System.out.println("=========================");
			System.out.println("La puntuación total obtenida del Usuario " +i+ " es: " +playerpoints);
			System.out.println("El número total de enemigos derrotados del Usuario " +i+ " es: " +playerenemies);
			System.out.println("Bonus: " +bonusCount+ "bonus en total. Puntos bonus: " +(bonusCount*100));
			if (playsNum > 0) {
				System.out.println("La puntuación media por partida es: " + (playerpoints / playsNum));
			} else {
				System.out.println("La puntuación media por partida es: 0");
			}
			
			totalpoints +=playerpoints;
			totalenemies +=playerenemies;
			if (playerpoints > maxpoints) {
                maxpoints = playerpoints;
                playermax = i;
            }
		}
		System.out.println("=========================");
		System.out.println("El jugador con mayor puntuación es el Usuario " +playermax+ " con: " +maxpoints+ " puntos.");
		System.out.println("La puntuación total conseguida entre todos los jugadores: "  +totalpoints+ " puntos.");
		System.out.println("El número total de enemigos derrotados: " +totalenemies+ " enemigos.");
		
		sc.close();

	}

}
