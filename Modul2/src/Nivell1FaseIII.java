import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.List;

public class Nivell1FaseIII {
	/*	- Fase 3
		Emmagatzemar en un Map tant les lletres de la llista com el nombre de vegades que apareixen. 
		
		https://jarroba.com/map-en-java-con-ejemplos/
		
		*/
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> llistaNom = new ArrayList<Character>();
		
		/*llistaNom.add('S');
		llistaNom.add('e');
		llistaNom.add('r');
		llistaNom.add('g');
		llistaNom.add('i');*/
		
		Hashtable<String,String> contenidor = new Hashtable<String,String>();
		
		contenidor.put("1", "S");
		contenidor.put("2", "e");
		contenidor.put("3", "r");
		contenidor.put("4", "g");
		contenidor.put("5", "i");
		
		int contador = 0;
		String countingForS = "S";
		String countingForE = "e";
		String countingForR = "r";
		String countingForG = "g";
		String countingForI = "i";

		for(String key : contenidor.keySet()) {            // iterate through all the keys in this HashMap
		    if(contenidor.get(key).equals(countingForS)) {  // if a key maps to the string you need, increment the counter
		        contador++;
		    }else if (contenidor.get(key).equals(countingForE)) {  // if a key maps to the string you need, increment the counter
		        contador++; 
		    }else if (contenidor.get(key).equals(countingForR)) {  // if a key maps to the string you need, increment the counter
		        contador++; 
		    }else if (contenidor.get(key).equals(countingForG)) {  // if a key maps to the string you need, increment the counter
		        contador++; 
		    }else if (contenidor.get(key).equals(countingForI)) {  // if a key maps to the string you need, increment the counter
		        contador++;
		    }
		}
		System.out.println(countingForS + ":" + contador);
		System.out.println(countingForE + ":" + contador);
		System.out.println(countingForR + ":" + contador);
		System.out.println(countingForG + ":" + contador);
		System.out.println(countingForI + ":" + contador);

		
		
		/*Enumeration<String> claus	= contenidor.keys();
		while (claus.hasMoreElements()) {
			System.out.println(""+"claus "+ claus.nextElement());*/
		
	}
}
