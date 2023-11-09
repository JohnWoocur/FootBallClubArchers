package App;

import java.util.Scanner;
import App.FileHandling;
import App.Menu;


public class PremierTable  {
	private static final String Syestem = null;

	public static void display(){
		Scanner scanner = new Scanner(System.in);
		FileHandling.premierLeague();


		System.out.println("Please enter any character to go main menu :");
		char c = scanner.next().charAt(0);
		switch ("c"){
			case "y":
			    Menu.menu();
			    break;
			default:
			 	Menu.menu();
			     break;
			 }
			 scanner.close();
}
}
