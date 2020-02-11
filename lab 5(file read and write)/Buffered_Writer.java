import java.io.*;  
public class Buffered_Writer{  
public static void main(String[] args){ 
	try{    
    FileWriter b1 = new FileWriter("newtext.txt");  
    BufferedWriter buffer = new BufferedWriter(b1);  
    buffer.write("This is buffered writing.");  
    buffer.close();
    }
    catch(Exception a){
    System.out.println(a);
    }  
    System.out.println("Success");  
    }  
}