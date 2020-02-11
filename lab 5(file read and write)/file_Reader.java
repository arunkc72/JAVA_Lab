import java.io.FileReader;  
public class file_Reader{  
    public static void main(String args[]){
    	try{   
          FileReader f2=new FileReader("text.txt");    
          int i;    
          while((i=f2.read())!=-1)    
          System.out.print((char)i);    
          f2.close();
          }
          catch(Exception a){
          	System.out.println("a");
          }    
    }  
    }  
