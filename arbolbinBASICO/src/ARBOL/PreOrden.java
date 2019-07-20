package ARBOL;

import java.util.NoSuchElementException;
import java.util.Stack;

public class PreOrden<NB> extends IteradorArbol<NB> {
	
	public PreOrden(ArbolBinario<NB> elArbol){
		
		super(elArbol);
		s =  new Stack<NodoBinario<NB>>();
		s.push(t.getRaiz());

	}
	
	@Override
	public void firts() {
		s.clear();
		if(t.getRaiz() != null){
			s.push(t.getRaiz());
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
		
		current = s.pop();
		if(current.getNodoDer() != null)
			s.push(current.getNodoDer());
		if(current.getNodoIzq() != null)
			s.push(current.getNodoIzq());
	} 
	
	private Stack<NodoBinario<NB>> s;	
		
	}
	
	

