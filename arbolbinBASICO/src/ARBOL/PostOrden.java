package ARBOL;


import java.util.NoSuchElementException;
import java.util.Stack;

class PostOrden<NB> extends IteradorArbol<NB> {
	
	protected static class StNodo<NB>{
		
		StNodo(NodoBinario<NB> n){
			
			nodo = n;
			vecesExtraccion = 0;
		}
		
		NodoBinario<NB> nodo;
	    int vecesExtraccion;
	}
	
	public PostOrden(ArbolBinario<NB> elArbol)
	{
		super(elArbol);
		s = new Stack<StNodo<NB>>();
		s.push(new StNodo<NB>(t.getRaiz()));
		
	}
	
	public void firts(){
		
		s.clear();
		if(t.getRaiz() != null){
			s.push(new StNodo<NB>(t.getRaiz()));
			advance();
		}
		
	}
	
	public void advance(){
		if(s.empty()){
			if(current == null)
				throw new NoSuchElementException();
			current = null;
			return;
		}
		
		StNodo<NB> nodo;
		for( ; ;){

		nodo = s.pop();
		if(++nodo.vecesExtraccion != 3){
			current = nodo.nodo;
			return;
			
		}
		s.push(nodo);
		if(nodo.vecesExtraccion == 1){
			if(nodo.nodo.getNodoIzq() != null)
			s.push(new StNodo<NB>(nodo.nodo.getNodoIzq()));
		}
		else{
			if(nodo.nodo.getNodoDer() != null)
				s.push(new StNodo<NB>(nodo.nodo.getNodoDer()));
		}
		
				
	}
	}
	
	
	
	protected Stack<StNodo<NB>> s; 



}
