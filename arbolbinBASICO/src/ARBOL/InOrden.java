package ARBOL;

import java.util.NoSuchElementException;

public class InOrden<NB> extends PostOrden<NB>{
	
	public InOrden(ArbolBinario<NB> elArbol){
		super(elArbol);
	}
		
		
		public void advance(){
			
			if(s.isEmpty()){
				if(current == null)
					throw new NoSuchElementException();
				current = null;
				return;

			}
			StNodo<NB> nodo;
			for( ; ; ){
				nodo = s.pop();
				if(++nodo.vecesExtraccion == 2){
					current = nodo.nodo;
					if(nodo.nodo.getNodoDer() != null)
						s.push(new StNodo<NB>(nodo.nodo.getNodoDer()));	
					return;
				}
				//primera vez que procesamos
					s.push(nodo);
					if(nodo.nodo.getNodoIzq() != null)
						s.push(new StNodo<NB>(nodo.nodo.getNodoIzq()));
				
				
			}
		}
	}


