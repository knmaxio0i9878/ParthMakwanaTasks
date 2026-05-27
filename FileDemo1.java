import java.io.FileReader;
import java.io.FileWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
class FileDemo1{

	public static void main(String args[]){


		try{

			String contents = "Hello this is my first File";
			FileWriter fw = new FileWriter("copy.txt");
			fw.write(contents);
			System.out.println("Succesfully write in the file.");
			fw.close(); // if we didnt write fw.close() the data will  not appended

			FileReader fr = new FileReader("copy.txt");
			

			int ch;
			while((ch = fr.read()) != -1){
				System.out.print((char)ch);
			}

			fr.close(); 
		
			
	
		}
		catch(FileNotFoundException e){
			System.out.println("File Not Found");
		}
		catch(IOException io){
			System.out.println("Read Error");
		}
	}
}


// Byte is concerned -> FileInputStream, DataInputStream, ObjectOutpuStream.


// FileReader is used to read the contents of all File some character file at a time
// FileWriter is used to write the contents of all File char by char At a time
// BufferReader is used to read the contents of all File At a time
// BufferWriter is used to write the contents of all File At a time


/*

			//FileReader fr = new FileReader("DemoFile.txt");

/*		int ch = fr.read();
			while(ch!=1){
				System.out.print((char)ch);
				ch=fr.read;
			}
			fr.close();  
*/