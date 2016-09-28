package rijnijssel.soundsharp;

import rijnijssel.soundsharp.IO.MyScanner;
import rijnijssel.soundsharp.lib.Strings;
import rijnijssel.soundsharp.login.Login;
import rijnijssel.soundsharp.menu.MainMenu;

public class SoundSharp
{
	public static void main(String[] args)
	{
		MyScanner.initScanner();
		
		if(args.length == 2)
		{
			new Login().login(args[0], args[1]);
			new MainMenu().mainMenu(true);
		}
		else
		{
			new Login().login();
			System.out.println(Strings.PASS_RIGHT + new Login().getName() + ".");
		}
		
		new MainMenu().mainMenu(false);
		
		MyScanner.closeScanner();
	}
}
