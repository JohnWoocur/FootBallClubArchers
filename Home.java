import java.util.Scanner;

import App.Menu;


public class Home {
	public static void main(String[] args) {
		Scanner s1 = new Scanner(System.in);
		System.out.print("Welcome To EPL, Do you want to continue Y / N : ");
		String opt = s1.nextLine();
		
		

		if (opt.equalsIgnoreCase("Y")) {
			Menu.menu();
		}
		else {
			System.out.println("System closed...");
		}

	}

}
