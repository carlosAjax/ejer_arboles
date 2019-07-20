package ARBOL;

abstract class IteradorArbol <NB>{
	


	public IteradorArbol(ArbolBinario<NB> elArbol){
		t = elArbol;
		current = null;
	}
	
	
	
	
	final public boolean esValido(){
		return current != null;
	}
	
	public NB retrieve(){
		return current.getDato();
	}
	
	abstract public void firts();
	abstract void advance();
	
	protected ArbolBinario<NB> t;
	protected NodoBinario<NB> current;

}
