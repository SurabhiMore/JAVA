package javaoop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class JavaIO {
/*
 * Java performs I/O through Streams ,A Stream is linked to a physical layer by java I/O system to make input and output operation in java.
 * Stream classes avilable in package java.io
 * 
 * 1) Byte Stream : Byte Stream is define by using two abstract class at top of hierarch i.e. InputStream & OutputStream
 *     Byte Stream Classes : BufferedInputStream,BufferedOutputStream,DataInputStream,DataOutputStream,FileInputStream,FileOutputStream,InputStream,OutputStream,PrintStream
 *     
 * 2) Character Stream :     Character Stream is define by using two abstract class at top of hierarch i.e. Reader & Writer
 *     Character Stream Classes : BufferedReader,BufferedWriter,FileReader,FileWriter,InputStreamReader,OutputStreamReader,PrintWriter,Reader,Writer
 *  
 */
	
	public void copyBytes() throws IOException {
		FileOutputStream out =null;
		FileInputStream in =null;
		try {
			in=new FileInputStream("D:\\Java\\JavaWorkPlace\\Java_28Feb2022\\src\\javaoop\\Test1.java");
			out=new FileOutputStream("D:\\Java\\JavaWorkPlace\\Java_28Feb2022\\src\\javaoop\\Test2.java");
			int c;
			while((c=in.read()) !=-1) {
				out.write(c);
			}//end while
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		finally {
			if(in!=null) {
				in.close();
			}
			if(out !=null) {
				out.close();
			}
		}
	}//copyBytes()
	
	
	public void copyCharacters() throws FileNotFoundException,IOException {
		FileWriter out =null;
		FileReader in =null;
		try {
			in=new FileReader("D:\\Java\\JavaWorkPlace\\Java_28Feb2022\\src\\javaoop\\Test1.java");
			out=new FileWriter("D:\\Java\\JavaWorkPlace\\Java_28Feb2022\\src\\javaoop\\Test3.java");
			int c;
			while((c=in.read()) !=-1) {
				out.write(c);
			}//end while
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		finally {
			if(in!=null) {
				in.close();
			}
			if(out !=null) {
				out.close();
			}
		}
	}//copyCharacters()
	
	
	public void copyLines() throws FileNotFoundException,IOException {
		PrintWriter out =null;
		BufferedReader in =null;
		try {
			in=new BufferedReader(new FileReader("D:\\Java\\JavaWorkPlace\\Java_28Feb2022\\src\\javaoop\\Test1.java"));
			out=new PrintWriter(new FileWriter("D:\\Java\\JavaWorkPlace\\Java_28Feb2022\\src\\javaoop\\Test4.java"));
			String str;
			while((str=in.readLine()) != null) {
				out.println(str);
			}//end while
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
		finally {
			if(in!=null) {
				in.close();
			}
			if(out !=null) {
				out.close();
			}
		}
	} //copyLines() 
	
	
	public static void main(String[] args) {
		JavaIO obj =new JavaIO();
		try {
			obj.copyBytes();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		try {
			obj.copyCharacters();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	
			try {
				obj.copyLines();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
			obj.readUserInput();
			obj.createFile("D:\\Java\\JavaWorkPlace\\Java_28Feb2022\\src\\javaoop\\Test5.java");
			
			obj.writeFile("D:\\Java\\JavaWorkPlace\\Java_28Feb2022\\src\\javaoop\\Test5.java");
			
			obj.appendFile("D:\\Java\\JavaWorkPlace\\Java_28Feb2022\\src\\javaoop\\Test5.java");
			
			obj.readFile("D:\\Java\\JavaWorkPlace\\Java_28Feb2022\\src\\javaoop\\Test5.java");

	}// end main()
	
	BufferedReader br,br1;
	File f1;
	char ch;
	String str;
	
	void readUserInput()
	{
		br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter Character: ");
		try {
			ch=(char)br.read(); // reading character
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		br1=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter String : ");
		try {
			str=br1.readLine(); // reading String
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
		System.out.println("User Enter Character is : "+ch);
		System.out.println("User Enter String is : "+str);
	}//readUserInput()
	
	
	void createFile(String str1) {
		try {
			f1=new File(str1);
			if(f1.createNewFile()) {
				System.out.println("File Created : "+f1.getClass().getName());
			}
			else {System.out.println("File Already Exist..."+f1.getClass().getName());}
		}
		catch(IOException e) {e.printStackTrace();}
	}//createFile(String str1)
	
	
	void writeFile(String st) {
		try {
			FileWriter obj=new FileWriter(st);
			obj.write("/* hello */");
			obj.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}//writeFile(String st) 
	
	void appendFile(String st) {
		try {
			FileWriter obj=new FileWriter(st);
			obj.append("/* hello */");
			obj.append("/* 1235 */");
			obj.append("/* 68978 */");
			obj.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}//appendFile(String st)
	
	void readFile(String st) {
		try {
			f1=new File(st);
			Scanner scnObj=new Scanner(f1);
			while(scnObj.hasNextLine()) {
				String strr=scnObj.nextLine();
				System.out.println(strr);
			}
			scnObj.close();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}//readFile(String st)

}//end class
