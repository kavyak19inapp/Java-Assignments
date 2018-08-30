package com.inapp.myfiles.test;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class MyFileSytsem {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		BufferedReader br=null;
		String line;
		
		System.out.println("enter the file to be read");
		try{
			br=new BufferedReader(new FileReader("C:\\Users\\Kavya\\workspace\\filerepo\\"+scanner.next()));
			}
		catch (FileNotFoundException fnfex) {
			System.out.println(fnfex.getMessage()+"the file is not found");
			System.exit(0);
			}
		try{
		while((line=br.readLine()) !=null){
			System.out.println(line);}
		}
	    catch(IOException e){
	    	System.out.println(e.getMessage()+"IO exception");
	    }
		finally{
			System.exit(0);
		}
			}
	public void HashMap(){
		
	}
	}
