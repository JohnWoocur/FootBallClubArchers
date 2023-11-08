
import java.util.Scanner;
import App.FileHandling;
import App.Menu;


public class DisplayPremierLeauge {
	public static void display(){
		Scanner scanner = new Scanner(System.ln);
	//FileHnadling.PremierLeauge();


		Syestem.out.print("Please enter any character to go main menu :");
		char c = scanner.next().charAt(0);
		switch ("c"){
			case "y":
			    Menu.mainMenu();
			    break;
			default:
			     Menu.mainMenu();
			     break;
			 }
			 scanner.close();
}

