package pruebasHoffmant;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class appHoffman {

	public static void main(String[] args) throws IOException {
		File archivo = new File("pruebaHoffman.txt");
		
		
		try {
			InputStream s = new FileInputStream(archivo);
			CharCounter contador = new CharCounter(s) ;
			for(int i = 0; i < 256; i++){
				//if(contador.getCount(i) != 0)
			System.out.println( i +":"+contador.getCount(i));
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
