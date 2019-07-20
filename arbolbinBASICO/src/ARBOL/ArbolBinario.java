package ARBOL;

public class ArbolBinario<NB> {
	
	public ArbolBinario(){
		this.raiz = null;
	}
	
	public ArbolBinario(NB valorRaiz){
		raiz = new NodoBinario<NB>(valorRaiz,null,null);
	}
	
	public NodoBinario<NB> getRaiz(){
		return raiz;
	}
	
	public int getSize(){
		return NodoBinario.size(raiz);
	}
	
	public int height(){
		return NodoBinario.height(raiz);
	}
	
	public void imprimirPreOrden(){
		if(raiz != null)
			raiz.imprimePreOrden();
		
	}
    public void imprimirPosOrden(){
    	if(raiz != null)
    		raiz.imprimePosOrden();
		
	}

    
    public void imprimirInOrden(){
    	if(raiz != null)
    		raiz.imprimeInOrden();
		
	}
    
    public void makeEmty(){
    	raiz = null;
    	
    }
    
    public boolean isEmpty(){
    	return raiz == null;
    }
    /*
    public void merge(NB valorRaiz, ArbolBinario<NB> t1, ArbolBinario<NB> t2){
    	
    	NodoBinario raiz = new NodoBinario<NB>(valorRaiz,null,null)
    			
    			if(t1 == t2 && t1 != null)
    				
    				
    }
    */
	
	private NodoBinario<NB> raiz;

}
