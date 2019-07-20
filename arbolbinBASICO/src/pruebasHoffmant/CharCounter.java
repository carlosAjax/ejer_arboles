package pruebasHoffmant;

import java.io.IOException;
import java.io.InputStream;

public class CharCounter {
	
	public CharCounter(InputStream input) throws IOException{
		int ch;
		while( (ch = input.read()) != -1){	
			theCounts[ ch ]++;
		}
	}
	
	public int getCount(int ch){
		return theCounts[ch & 0xff];
	}
	
	private int [] theCounts = new int[256];

}
