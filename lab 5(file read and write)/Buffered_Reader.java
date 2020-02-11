import java.io.*;  
public class Buffered_Reader{  
    public static void main(String args[])throws Exception{    
          FileReader b2=new FileReader("newtext.txt");    
          BufferedReader r2=new BufferedReader(b2);    
  
          int i;    
          while((i=r2.read())!=-1){  
          System.out.print((char)i);  
          }  
          r2.close();    
          b2.close();    
    }    
}   