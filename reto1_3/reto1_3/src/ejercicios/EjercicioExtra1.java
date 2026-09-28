package ejercicios;
/*
 El servicio de PRL del Centro nos pide realizar un programa que nos indique:
Cuántos alumnos no han sido vacunados o no tienen la pauta completa (2 vacunas o 1 en caso de haber pasado la COVID-19)
Y de aquellos que sí y han sido vacunados (con dos dosis o 1, si hubieran padecido la COVID) hasta cuándo están protegidos (6 meses más del mes de la vacuna)
El proceso se realizará tantas veces como alumnos/as haya.
 */

import java.util.Scanner;

public class EjercicioExtra1 {

    public static void main(String[] args) {

        //VARIABLES
        Scanner sc = new Scanner(System.in);

        int numAlumn;
        int covid;
        int vacuna;
        int numvacuna;
        int novacuna = 0;
        int mesvacuna;
        int mesproteccion;
        String nombreMes;

        System.out.println("VACUNACIONES");
        System.out.println("Introduce el nº de alumnos:");
        numAlumn = sc.nextInt();
        //bucle termina cuando se rgistren todos los alumnos
        for (int i = 1; i <= numAlumn; i++) {

        	System.out.println("________________________________");
        	System.out.println("ALUMNO" + i);
            System.out.println("________________________________");

            // COVID
            System.out.println("¿Has tenido COVID19?");
            System.out.println("NO = 0");
            System.out.println("SI = 1");
            covid = sc.nextInt();
            while (covid != 0 && covid != 1) {
                System.out.println("ERROR, Introduce un 0 para NO y 1 para SI");
                covid = sc.nextInt();
            }

            //VACUNACIÓN
            System.out.println("¿Te has vacunado?");
            System.out.println("NO = 0");
            System.out.println("SI = 1");
            vacuna = sc.nextInt();
            while (vacuna != 0 && vacuna != 1) {
                System.out.println("ERROR, Introduce un 0 para NO y 1 para SI");
                vacuna = sc.nextInt();
            }

            if (vacuna == 0) {
                numvacuna = 0;
            } else {
                System.out.println("¿Cuántas veces te has vacunado?");
                numvacuna = sc.nextInt();

                while (numvacuna < 1) {
                    System.out.println("ERROR. Introduce un nº válido.");
                    numvacuna = sc.nextInt();
                }
            }

            //PAUTA INCOMPLTA
            if (covid == 0 && numvacuna < 2) {

                System.out.println("--------------------------------");
                System.out.println("No has tenido COVID y no tienes la pauta completa.");
                System.out.println("Te faltan 2 vacunas.");
                System.out.println("--------------------------------");

                novacuna++; //contamos los alumnos no vacunados

            } else if (covid == 1 && numvacuna < 1) {

                System.out.println("--------------------------------");
                System.out.println("Has tenido COVID y no tienes la pauta completa.");
                System.out.println("Te falta 1 vacuna.");
                System.out.println("--------------------------------");

                novacuna++;

            } else {

                //PAUTA COMPLETA
                System.out.println("--------------------------------");
                System.out.println("Tienes la pauta completa.");
                System.out.println("--------------------------------");

                System.out.println("¿En qué mes te vacunaste por última vez? ");
                System.out.println("Introduce un mes del 1 al 12: ");
                mesvacuna = sc.nextInt();

                while (mesvacuna < 1 || mesvacuna > 12) {
                    System.out.println("ERROR, introduce un mes entre 1 y 12: ");
                    mesvacuna = sc.nextInt();
                }

                mesproteccion = mesvacuna + 6;
                if (mesproteccion > 12) {
                    mesproteccion = mesproteccion - 12;
                }
                
     
				if(mesproteccion == 1) {
                	nombreMes = "Enero";
                }else if(mesproteccion == 2) {
                	nombreMes = "Febrero";
                }else if(mesproteccion == 3) {
                	nombreMes = "Marzo";
                }else if(mesproteccion == 4) {
                	nombreMes = "Abril";
                }else if(mesproteccion == 5) {
                	nombreMes = "Mayo";
                }else if(mesproteccion == 6) {
                	nombreMes = "Junio";
                }else if(mesproteccion == 7) {
                	nombreMes = "Julio";
                }else if(mesproteccion == 8) {
                	nombreMes = "Agosto";
                }else if(mesproteccion == 9) {
                	nombreMes = "Septiembre";
                }else if(mesproteccion == 10) {
                	nombreMes = "Octubre";
                }else if(mesproteccion == 11) {
                	nombreMes = "Noviembre";
                }else{
                	nombreMes = "Diciembre";
                }
				System.out.println("--------------------------------");
                System.out.println("Estás protegido hasta el mes de " + nombreMes + ".");
                System.out.println("--------------------------------");
            }
        }

        System.out.println("================================");
        System.out.println("Alumnos sin la pauta completa: " + novacuna);
        System.out.println("================================");

        sc.close();
    }
}

