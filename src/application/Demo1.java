package application;

import java.util.LinkedHashSet;
import java.util.Set;

public class Demo1 {

	public static void main(String[] args) {

		// Set<String> set = new HashSet<>(); // Se a ordem não importa
		// Set<String> set = new TreeSet<>(); // Ordena os dados em ordem alfabetica
		Set<String> set = new LinkedHashSet<>(); // Ordem que inseriu

		set.add("Tv");
		set.add("Tablet");
		set.add("Notebook");

		// set.remove("Tablet");

		// set.removeIf(x -> x.length() >= 3); // removeu Tv

		set.removeIf(x -> x.charAt(0) == 'T'); // removeu Tv, Tablet

		// System.out.println(set.contains("Notebook")); // true

		for (String p : set) {
			System.out.println(p); // Tv, Notebook, Tablet
		}
	}

}
