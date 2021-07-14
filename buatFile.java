import java.io.FileWriter; 
import java.io.ioException; 
public class buatFile { 
     
      public static void main (String[]args) { 
               
           try { 

                FileWriter myWriter = new FileWriter("Myfile.txt");
                 myWriter.write("ini file yang saya buat");
                  myWriter.close();
                   System.out.println("create file success");        
                       
           } catch (IOException e) { 
                
                  System.out.println(" An error encourade"); 
                   e.printStackTrace();
           }
            
             
              
               
                
          
          
             
              
               
                
                 
                  
                   
                    
                     
                      
                       

                        
   }
      
        
         
          

           
            
             
              
               
                
                 
                  
                   

                    
                     

                      
}