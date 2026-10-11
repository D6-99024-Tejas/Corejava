package com.Exception;

import java.util.Scanner;

public class program {
	public static void checkStringLength(String str)throws ExceptionLineTooLong
	{
		if(str.length()>80)
		{
			throw new ExceptionLineTooLong();
		}
		else 
		{
			System.out.println("your string in your limit");
		}
	}
	public static void main(String[]args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter String");
		String str = sc.nextLine();
		
		try {
			program.checkStringLength(str);
		} catch (ExceptionLineTooLong e) {
			System.out.println(e.getMessage());
		}
		sc.close();
	}
}
