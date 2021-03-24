import java.util.ArrayList;
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
		
		llistaNom.add('S');
		llistaNom.add('e');
		llistaNom.add('r');
		llistaNom.add('r');
		llistaNom.add('i');
		
		Hashtable<Character,Integer> contenidor = new Hashtable<Character,Integer>();
		
		for (Character c: llistaNom) {
			if (contenidor.containsKey(c)) {
				contenidor.put(c, contenidor.get(c) +1);
			} else {
				contenidor.put(c, 1);
			}
		}

		for(Character key : contenidor.keySet()) {            // iterate through all the keys in this HashMap
			System.out.println(key + " : " + contenidor.get(key));
		}
		
				
		/*Enumeration<String> claus	= contenidor.keys();
		while (claus.hasMoreElements()) {
			System.out.println(""+"claus "+ claus.nextElement());*/
		
	}
}
