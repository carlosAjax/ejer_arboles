package ARBOL;

public class NodoBinario<NB>{
	
	public NodoBinario(){
		this(null,null,null);
	}
	
	public NodoBinario(NB dat, NodoBinario<NB> i, NodoBinario<NB> d){
		this.izq = i;
		this.der = d;
		this.dato = dat;
	}
	
	public NB getDato(){
		return dato;
	}
	
	public NodoBinario<NB> getNodoIzq(){
		return izq;
	}
	
	public NodoBinario<NB> getNodoDer(){
		return der;
	}
	
	public void setDato(NB dat){
		this.dato = dat;
		
	}
	
	public void setNodoIzq(NodoBinario<NB> i){
		this.izq = i;
	}
	
	public void setNodoDer(NodoBinario<NB> d){
		this.der = d;
	}
	
	public static <NB> int size(NodoBinario<NB> t){
		
		if( t == null)
			return 0;
		else
			return 1 + size(t.izq) + size(t.der);
		
	}
	
	public static <NB> int height(NodoBinario<NB> t){
		if(t == null)
			return -1;
		else
			return 1 + Math.max(height(t.izq), height(t.der));
		
		
	}
	
	public NodoBinario<NB> duplicate(){
		NodoBinario<NB> raiz = new NodoBinario<NB>(dato,null, null);
		if(izq != null)
			raiz.izq = izq.duplicate();
		if(der != null)
			raiz.der = der.duplicate();
		return raiz;
	}
	
	public void imprimePreOrden(){
		
		System.out.println(dato);
		if(izq != null)
			izq.imprimePreOrden();
		if(der != null)
			der.imprimePreOrden();
	}
	
	public void imprimePosOrden(){
		if(izq != null)
			izq.imprimePosOrden();
		if(der != null)
			der.imprimePosOrden();
		System.out.println(dato);
		
	}
	
	public void imprimeInOrden(){
		if(izq != null)
			izq.imprimeInOrden();
		System.out.println(dato);
		if(der != null)
			der.imprimeInOrden();
		
	}
	
	
	private NodoBinario<NB> izq;
	private NodoBinario<NB> der;
	private NB dato;
	
	
	
	

}
