package com.matrix;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try{
			InputStreamReader is=new InputStreamReader(System.in);
			BufferedReader br=new BufferedReader(is);
			System.out.println("Enter Char");
			char a=(char)br.read();
			System.out.println("Character is:"+a);
		}
		catch(IOException e)
		{
			System.out.println("Exception"+e);
		}
	}

}
