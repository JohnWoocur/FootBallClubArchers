package App;

import java.util.Scanner;
import App.FileHandling;
import App.Menu;


public class PremierTable {
	public static void display(Object Syestem){
		Scanner scanner = new Scanner(System.in);
	//FileHnadling.PremierLeauge();


		System.out.println("Please enter any character to go main menu :");
		char c = scanner.next().charAt(0);
		switch ("c"){
			case "y":
			    Menu.mainMenu(null);
			    break;
			default:
			     System.out.println("invalid option");
			     break;
			 }
			 scanner.close();
}
}
