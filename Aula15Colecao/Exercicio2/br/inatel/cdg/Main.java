package br.inatel.cdg;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import br.inatel.cdg.inimigo.BlackKnight;
import br.inatel.cdg.inimigo.FireKnight;
import br.inatel.cdg.inimigo.Inimigo;
import br.inatel.cdg.inimigo.SilverKnight;

public class Main {

	public static void main(String[] args) {

		
		List<Inimigo> listaInimigo = new ArrayList<Inimigo>();
		
		listaInimigo.add(new FireKnight("Capirotin Tocha", 200));
		listaInimigo.add(new BlackKnight("Capiroto Black", 100));
		listaInimigo.add(new SilverKnight("Capiroto Silver", 150));
		
		Collections.sort(listaInimigo);
		
		for (Inimigo inimigo : listaInimigo) {
			System.out.println(inimigo.getVida());
		}
		
	}

}
