import java.util.ArrayList;
import java.util.List;

public class Nivell1FaseIV {
	/*- Fase 4
	Crea una altra llista amb el teu cognom on cada posici� correspongui a una lletra. 
	Fusiona les dues llistes en una sola. A m�s, afegeix una posici� amb un espai buit entre la primera i la segona. 
	�s a dir, partim de la llista name i surname i al acabar l�execuci� nom�s tindrem una que es dir� fullName. 
	FullName: [�N�, �A�, �M�, �E�, � �, �S�, �U�, �R�, �N�, �A�, �M�, �E�] 
 	*/
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Character> llistaNom = new ArrayList<Character>();
		
		llistaNom.add('S');
		llistaNom.add('e');
		llistaNom.add('r');
		llistaNom.add('g');
		llistaNom.add('i');
		
		List<Character> llistaCognom = new ArrayList<Character>();
		
		llistaCognom.add('P');
		llistaCognom.add('o');
		llistaCognom.add('n');
		llistaCognom.add('s');
		
		List<Character> llistaComplerta = new ArrayList<Character>();
		llistaComplerta.addAll(llistaNom);
		llistaComplerta.add(' ');
		llistaComplerta.addAll(llistaCognom);
		
		for (Character c: llistaComplerta) {
			System.out.println(c);
		}

	}

}
