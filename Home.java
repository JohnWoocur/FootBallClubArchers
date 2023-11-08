import java.util.Scanner;
//import App.FileHandling;

import App.Menu;


public class Home {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.println("Welcome To EPL, Do you want to continue Y / N : ");
		String opt = s1.nextLine();
		

		if (opt.equalsIgnoreCase("Y")) {
			Menu.mainMenu(args);
		}
		else {
			main(args);
		}
	}

}
