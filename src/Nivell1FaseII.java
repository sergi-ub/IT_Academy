import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Nivell1FaseII {

	public static void main(String[] args) {
		// Afegir nom del plat i preu. Es pot fer servir diccionari de dades (Hashmaps)
		
		int cinc = 5;
		int deu = 10;
		int vint = 20;
		int cinquanta = 50;
		int cent = 100;
		int dosCents = 200;
		int cincCents =500;
		
		String [] plats = new String[7];
		int [] preus = new int[7];
		
		int comptador = 1;
		int preuBase = 3;
		while (comptador <= 7)
		{
		    plats[comptador-1] = "\nPlat " + comptador; // Cada plat s'enumera des del 1 al 7.
		    preus[comptador-1] = comptador + preuBase; // El preu per cada plat va augmentant de forma descendent. El preu mínim per plat es de 3 euros.
		    
		    comptador++;
		}
		
		HashMap<String, Integer> contenidor = new HashMap <String, Integer>(); //Els mètodes van amb parèntesi
		
		comptador = 0;
		
		while (comptador <= 6)
		{
		    contenidor.put(plats[comptador], preus[comptador]);
			comptador++;
			
		}
		
		System.out.println(contenidor +" €");
		
		/*
		- Un cop plens els dos arrays haurem de mostrar-los i preguntar que es vol per menjar, guardarem la 
		informació en una List fent servir un bucle while.
		− Haurem de preguntar si es vol seguir demanant menjar. Podeu fer servir el sistema (1:Si / 0:No), 
		per tant haureu de crear un altre variable int per guardar la informació.*/
		
		boolean continuar = true; //Assignació
		ArrayList<String> peticio = new ArrayList<String>();

		while (continuar == true) { //Comprobació
			String plat = JOptionPane.showInputDialog(contenidor.toString() + "\n Quin nº de plat vols prendre");
			peticio.add(plat);
			
			int platAddicional = Integer.parseInt(JOptionPane.showInputDialog("Vols seguir demanant? (0 = si | 1 = no)"));
			
			if (platAddicional == 1) {
				continuar = false;
			} else if (platAddicional != 0) {
				System.out.println("El valor instriduït no és correcte, es continuaran demanant plats");
			} 

		} 
		System.out.println("Finalització de la comanda");
		System.out.println(peticio);
			
		
	}
			
	


}
