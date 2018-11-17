package week10;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task1 {
	public static List<String> getAllFunctions(File path) throws IOException{
        List<String> list = new ArrayList<String>();
        
        try {  
            
			FileReader fr = new FileReader(path);
			BufferedReader br = new BufferedReader(fr);
			
            		String line = null;
                        
            		while ((line = br.readLine()) != null) {
                            //if(line)
                                
                                
                	    if(line.contains("static") == true){
                                String fc = "";
                                int dem = 1;
                                fc +=line + "\n";
                                while(dem!=0 && (line = br.readLine()) != null){
                                    fc+=line + "\n";
                                    
                                    if(line.contains("{") == true) dem++;
                                    if(line.contains("}") == true) dem--;
                                    
                                }
                                list.add(fc);
                            }
                            
            		}
       
           		br.close();
       	 }
        
        catch (IOException e) {
        		System.out.println(e);
        	}
        return list;
    }
    
    public String findFunctionByName(String name) throws IOException{
        
        return null;
    }
    
    public static void main(String[] args) throws IOException{
        
        File file = new File("Utils.java");
        List<String> a = getAllFunctions(file);
        int i = 0;
        for (String s : a) {
            i++;
            System.out.println(s + "\n day la ham so  " + i);
        }
         
    }

}
