import java.io.FileWriter;
public class file_writer{
	public static void main(String[] args) {
		try{
			FileWriter f1=new FileWriter("text.txt");
			f1.write("Learning java file writer");
			f1.flush();
			f1.close();
		}
		catch(Exception e){
			System.out.println(e);
		}
	System.out.println("Succesfully written");
	}
}