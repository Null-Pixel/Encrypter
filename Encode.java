package com.pixel.encode;

import java.util.Scanner;

public class Encode
{
	private static Scanner scan = new Scanner(System.in);
	private static int user;
	
	public static void main(String[] args)
	{
		String text; // Secret message
		int key; // Set here a key that key you must send to your friend to decrypt it
		System.out.print("Enter Message: ");
		text = scan.nextLine();
		System.out.print("Enter Key: ");
		key = scan.nextInt();
		System.out.print("Encrypt: 1, Decrypt: 2 (Type what you want): ");
		user = scan.nextInt();
		
		char[] chars = text.toCharArray();
		
		if (user == 1)
		{
			for (char c : chars)
			{
				c += key;
				System.out.print(c);
			}
		}
		else if (user == 2)
		{
			for (char c : chars)
			{
				c -= key;
				System.out.print(c);
			}
		}
		
		
	}
}