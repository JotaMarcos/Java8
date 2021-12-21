import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class OrdenaStrings {

	public static void main(String[] args) {
		
		// Forma antiga que era feita a Lista de String
		List<String> palavras = new ArrayList<String>();
		palavras.add("alura online");
		palavras.add("editora casa do código");
		palavras.add("caelum");
		
		Collections.sort(palavras);
		System.out.println(palavras);
		
		System.out.println("===========================================================");
		
		
		Comparator<String> comparador1 = new ComparadorPorTamanho();
		Collections.sort(palavras, comparador1);
		System.out.println(palavras);
		
		System.out.println("===========================================================");
		
		// Novo forma de fazer a Lista de String
		
		Comparator<String> comparador2 = new ComparadorPorTamanho();
		// Collections.sort(palavras, comparador);
		palavras.sort(comparador2);
		System.out.println(palavras);
		
		System.out.println("===========================================================");
		// Forma antiga de varrer a Lista
//		for (String p : palavras) {
//			System.out.println(p);
//		}
		
		System.out.println("===========================================================");
		// Nova foram de varrer a Lista
		Consumer<String> consumidor = new ImprimiNaLinha();
		palavras.forEach(consumidor);
		
		
		
		
		
		
	}

}


class ImprimiNaLinha implements Consumer<String>{

	@Override
	public void accept(String s) {
		System.out.println(s);
		
	}
	
}


class ComparadorPorTamanho implements Comparator<String>{
	
	@Override
	public int compare(String s1, String s2) {
		if (s1.length() < s2.length()) 
			return -1;
		if(s1.length() > s2.length())
			return 1;
		return 0;
	}
	
}