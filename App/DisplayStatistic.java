
package App;

import java.util.ArrayList;
import java.util.Scanner;
import App.FileHandling;
import App.Menu;

public class DisplayStatistic {
    public static void display(){


	Scanner scanner = new Scanner(System.in);
	System.out.println("Display clubs  Already Add");
	System.out.println("Select club name : ");
        String clubName = scanner.next();
        System.out.println(clubName);
        FileHandling.statics(clubName);

         System.out.print("Do you want to go again (y/n) :");
		        char c = scanner.next().charAt(0);
		        switch (c) {
		            case 'y':
		                display();
		                break;
		            case 'n':
			         Menu.mainMenu();
		                break;
		            default:
		                break;
		        }
		        scanner.close();

    }
}



