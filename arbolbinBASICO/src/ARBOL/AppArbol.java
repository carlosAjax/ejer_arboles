package ARBOL;

public class AppArbol {
	
	

	    static public void main( String [ ] args )
	    {
	        ArbolBinario<Integer> t1 = new ArbolBinario<Integer>( 2);
	        t1.getRaiz().setNodoDer(new NodoBinario<Integer>(5,null,null));
	        t1.getRaiz().setNodoIzq(new NodoBinario<Integer>(3,null,null));
	        
	       

	        System.out.println( "t1 should be perfect 1-7; t2 empty" );
	        System.out.println( "----------------" );
	        System.out.println( "t1" );
	        t1.imprimirInOrden();
	        System.out.println( "t1 cantidad nodos" + t1.height());
	    }
}
	        
