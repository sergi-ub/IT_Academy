import java.util.ArrayList;
import java.util.HashMap;

import javax.swing.JOptionPane;

public class Nivell1FaseIII {

	public static void main(String[] args) {
		
		String [] plats = new String[7];
		int [] preus = new int[7];
		
		int comptador = 1;
		int preuBase = 3;
		while (comptador <= 7)
		{
		    plats[comptador-1] = "Plat " + comptador; 
		    preus[comptador-1] = comptador + preuBase; 
		    
		    comptador++;
		}
		
		HashMap<String, Integer> contenidor = new HashMap <String, Integer>();
		
		comptador = 0;
		
		while (comptador <= 6)
		{
		    contenidor.put(plats[comptador], preus[comptador]);
			comptador++;	
		}
		
		System.out.println(contenidor);
		
		boolean continuar = true; 
		ArrayList<String> peticio = new ArrayList<String>();

		while (continuar == true) {
			String plat = JOptionPane.showInputDialog(contenidor.toString() + "\n Quin nº de plat vols prendre");
			peticio.add(plat);

			int platAddicional = 0;

			try {
				platAddicional = Integer.parseInt(JOptionPane.showInputDialog("Vols seguir demanant? (0 = si | 1 = no)"));
			} catch (Exception ex) {
				System.err.println(ex.getMessage());
			}
			
			if (platAddicional == 1) {
				continuar = false;
			} else if (platAddicional != 0) {
				System.out.println("El valor instriduït no és correcte, es continuaran demanant plats");
			} 

		} 
		System.out.println("Finalització de la comanda");
		System.out.println(peticio);
		
		// FASE III
		
		int preuTotal = 0;
		
		for (String plat: peticio) {
			if (contenidor.containsKey(plat)) {
				preuTotal = preuTotal + contenidor.get(plat);
				
			} else 
				System.out.println("El plat indicat no existeix");
		}
		System.out.println(preuTotal);
	}

}
