import java.util.Scanner;

public class Nivell2 {
		
		/* Crea una aplicaci� que dibuixi una escala de nombres, sent cada l�nia nombres comen�ant en un i acabant 
		   en el nombre de la l�nia. Aquest �s un exemple, si introdu�m un 5 com a al�ada: 

			Crea una aplicaci� que dibuixi una pir�mide invertida de asteriscs. Nosaltres li vam passar l'altura de 
			la pir�mide per teclat. Aquest �s un exemple: */
	
	public static void main(String[] args) {
		// Classe que permet llegir dades per teclat:
		Scanner scanner = new Scanner(System.in);
		
		//Missatge per a l'usuari:
		System.out.println("Introdueixi el l'al�ada de la pir�mide invertida: ");
		
		int nombre = scanner.nextInt();
		scanner.close();
		int nombreAsteriscs = (nombre*2)-1;
		
		
		/*for (int i = nombre; i >=1 ; i-- ){
	        for (int j = 1; j <= i; j++){
	            System.out.println("*");
	        }   
	        	System.out.println("\n");
		}*/
		
		for(int i =0; nombreAsteriscs >0; i++, nombreAsteriscs-=2){
            //Espais en blanc
			
            for(int j =0; j<i ;j++){
                System.out.print(" ");
            }
            //Asteriscs
            for(int k = nombreAsteriscs; k>0 ;k--){
                System.out.print("*");
            }
            System.out.println();
		}
	}
}
