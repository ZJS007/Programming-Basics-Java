package pack;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
	public static void main(String argv[]) throws IOException{ 
	      FileInputStream stream = new FileInputStream("20171130E2.txt"); 
	      InputStreamReader reader = new InputStreamReader(stream); 
	      BufferedReader buffer = new BufferedReader(reader); 
	      String line; 
	      while ((line = buffer.readLine()) != null && !line.equals("")) {	 
	    	  line=line.replace('\t',' ');
	    	  line=line.trim();
	    	  if(line.equals(""))
	    		  continue;
	    	  
	    	  int nextSpace = line.indexOf(" ");
	    	  
	    	  int w = Integer.parseInt(line.substring(0, nextSpace));
	    	  
	          int h = Integer.parseInt(line.substring(nextSpace).trim()); 

	          Rectangle rec=new Rectangle();
	          rec.width = w; 
	          rec.height = h;
	    	  System.out.println("area=" + rec.getArea());  
	    	  
	    	  System.out.println();
	      } 
	      stream.close(); 
	   } 
}