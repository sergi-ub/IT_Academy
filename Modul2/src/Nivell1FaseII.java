import java.util.ArrayList;
import java.util.List;

public class Nivell1FaseII {
	/* Canvia la taula per una llista (List<Character>) 
	Al bucle, si la lletra és una vocal imprimeix a la consola: ‘VOCAL’. Sinó, imprimeix: ‘CONSONTANT’. 
	Si trobes un numero, mostra per pantalla: ‘Els noms de persones no contenen números!
	
	UNA ALTRA OPCIÓ: char[] vocals = {'a', 'e', .....}
	vocals.contains
	
	https://www.tutorialspoint.com/java/character_isdigit.htm
	*/
	
	public static void main(String[] args) {
		
		List<Character> llistaNom = new ArrayList<Character>();
		
		llistaNom.add('S');
		llistaNom.add('e');
		llistaNom.add('r');
		llistaNom.add('8');
		llistaNom.add('i');
		
				
		for (Character c:llistaNom) {
			if (Character.isDigit(c)) {
				System.out.println("Els noms de persona no contenen números");
			} else if (c == 'a'||c == 'e'||c == 'i'||c == 'o'||c == 'u'){
				System.out.println("La '" + c + "' és una vocal");
			}else {
				System.out.println("La '" + c + "' és una consonant");
			}
		}
	}
}
