package ARBOL;

public class PruebaBack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] v = new int [3];
        v[0] = 7;
        v[1] = 5;
        v[2] = 2;
        ordenar(v);
        
         
	}
		
		public static void ordenar(int [] v){
	        
	        int [] sol = new int[v.length];
	        boolean [] disp = new boolean[v.length];
	        for(int i = 0; i < disp.length; i++)
	        {
	            disp[i] = true;
	            
	        }
	        
	        ordenar_aux(v,sol,disp,0);
	        
	        for(int i = 0; i < sol.length; i++)
	        {
	            System.out.println(sol[i]);
	            
	        }
	       
	        
	        
	    }
	    
	    public static boolean ordenar_aux(int [] v, int [] sol, boolean [] disp, int etapa ){
	        boolean exito = false;
	         for(int i = 0; i<=v.length-1 && !exito; i++){
	        	 System.out.println("i en for #################" + i + "   etapa:" + etapa);
	             if(disp[i]){
	            	 System.out.println("disponible******" + i);
	                 if(etapa > 0 && sol[etapa -1] > v[i]){
	                	 System.out.println(sol[etapa -1] + ">" + v[i] );
	                    System.out.println("saltar-----" + i );
	                      continue;
	                 }
	                 disp[i] = false;
	                 sol[etapa] =v[i];
	                 if(etapa > 0)
	                	 System.out.println(sol[etapa]);
	                	 
	                 if(etapa == v.length-1)
	                     exito = true;
	                 else{
	                	 System.out.println("recursion???????????" + i);
	                	 
	                	 
	                     exito = ordenar_aux(v,sol,disp,etapa+1);
	                     
	                     if(!exito)
	                         disp[i] = true;
	                     
	                    }
	                  
	             }
	             
	             
	             }
			return exito;
	        
	    }
	

	}


