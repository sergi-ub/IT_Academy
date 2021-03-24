import java.util.Scanner;

public class Nivell2 {
		
		/* Crea una aplicació que dibuixi una escala de nombres, sent cada línia nombres començant en un i acabant 
		   en el nombre de la línia. Aquest és un exemple, si introduïm un 5 com a alçada: 

			Crea una aplicació que dibuixi una piràmide invertida de asteriscs. Nosaltres li vam passar l'altura de 
			la piràmide per teclat. Aquest és un exemple: */
	
	public static void main(String[] args) {
		// Classe que permet llegir dades per teclat:
		Scanner scanner = new Scanner(System.in);
		
		//Missatge per a l'usuari:
		System.out.println("Introdueixi el l'alçada de la piràmide invertida: ");
		
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
