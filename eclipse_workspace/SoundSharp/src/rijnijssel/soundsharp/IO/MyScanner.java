package rijnijssel.soundsharp.IO;

import java.util.Scanner;

public class MyScanner
{
	public static Scanner scanner;
	
	public static void initScanner()
	{
		scanner = new Scanner(System.in);
	}
	
	public static void closeScanner()
	{
		scanner.close();
	}
}
