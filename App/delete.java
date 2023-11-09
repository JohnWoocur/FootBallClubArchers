package App;

import java.io.IOException;
import java.util.Scanner;

import App.FileHandling;
import App.Menu;

public class delete {
    public static void delete(){
        Scanner sc =new Scanner(System.in);
        FileHandling.showClub();
        System.out.print("Enter Club Name To delete : ");
        String name=sc.nextLine();
        try {
            FileHandling.deleteClub(name);
        } catch (IOException e) {
            System.out.println("Error ");
        }
        System.out.print("Do you want to go again (y/n) :");
        char c = sc.next().charAt(0);
        switch (c) {
            case 'y':
                delete();
                break;
            case 'n':
                Menu.menu();
                break;
            default:
                break;
        }
        sc.close();
    }


    public static void main(String[] args) {
		delete.delete();
	}
}
