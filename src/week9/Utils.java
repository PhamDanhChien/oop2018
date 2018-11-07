package week9;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;

public class Utils {
	public static String readContentFromFile(String path) {
		
		try {  
            
			FileReader fr = new FileReader(new File(path));
			BufferedReader br = new BufferedReader(fr);
			
            		String line = null;
            		while ((line = br.readLine()) != null) {
                	    System.out.println("line data: " + line);
            		}
       
           		br.close();
       	 	}
		catch (IOException e) {
        		System.out.println(e);
        	}
		
		return null;
	
	}
	
	
	
	public static void writeContentToFile(String path) {
		try {
			String ad = "pham danh chien\n";
			FileWriter fw = new FileWriter(new File(path));
			BufferedWriter br = new BufferedWriter(fw);
			
			br.write(ad);
			br.close();
		}
		catch (IOException e) {
        		System.out.println(e);
        	}
	}
	
	
	public static void writeAppendContentToFile(String path) {
		try {
			String ad = "pham danh chien1\n";
			FileWriter fw = new FileWriter(new File(path), true);
			BufferedWriter br = new BufferedWriter(fw);
			br.write(ad);
			br.close();
		}
		catch (IOException e) {
        		System.out.println(e);
       	 	}
	}
	
	public static File findFileByName(String folderPath, String fileName) {
		File dir = new File(folderPath);
		String[] children = dir.list();
		
	      	if (children == null) {
	        	 System.out.println("day khong phai la thu muc hoac khong ton tai");
			return null;
	      	}
	      	else {
	    	 	boolean fi = false;
	    	 
			for (int i = 0; i < children.length; i++) {
	       
	            		 if( children[i].equals(fileName) == true) {
	            	 		fi = true;
	            			System.out.println("da tim thay file");
	            			break;
	            		 }
	        	}
	         
	         	if(fi == false) {
	        		 System.out.println("khong tim thay file"); 
	        		 return null;
	        	}
	          
	     	}
	      
	      String path = folderPath + "/" + fileName;
	      File kq = new File(path);
	      return kq;
	}
}
