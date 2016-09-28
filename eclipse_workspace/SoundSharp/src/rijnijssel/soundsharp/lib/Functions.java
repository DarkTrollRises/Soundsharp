package rijnijssel.soundsharp.lib;

import rijnijssel.soundsharp.IO.MyScanner;

public class Functions
{
	public static void enterToContinue()
	{
		System.out.println(Strings.PRESS_ENTER);
		MyScanner.scanner.nextLine();
	}
	
	public static void printTwoDecimals(double d)
	{
		System.out.printf("%.2f%n", d);
	}
}
