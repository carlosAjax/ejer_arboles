package ARBOL;

import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;


public class OrdenPorNivel<NB> extends IteradorArbol<NB>{
	
	public OrdenPorNivel(ArbolBinario<NB> elArbol){
		super(elArbol);
		s = new LinkedList<NodoBinario<NB>>();
		s.add(t.getRaiz());
	}
	
	@Override
	public void firts() {
		s.clear();
		if(t.getRaiz() != null ){
			s.add(t.getRaiz());
			advance();
		}
	}
			
	@Override
	void advance() {
		
		if(s.isEmpty()){
			if(current == null)
				throw new NoSuchElementException();
			current = null;
			return;
		}
		
		current = s.remove();
		if(current.getNodoIzq() != null)
			s.add(current.getNodoIzq());
		if(current.getNodoDer() != null)
			s.add(current.getNodoDer());
		
	}
	
	
	Queue<NodoBinario<NB>> s;

}
