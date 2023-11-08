package App;

import java.util.Scanner;

//import Statements

public class Menu {
    public static void mainMenu(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        
        System.out.println("\t\t 1. Creat a football club");
        System.out.println("\t\t 2. Delete  a football club");
        System.out.println("\t\t 3. Display ststistic for a selected club");
        System.out.println("\t\t 4. Display the primier league table");
        System.out.println("\t\t 5. Display the event");
        System.out.println("\t\t 6. Update the score");
        System.out.println("\t\t 7. Set match data");
        System.out.println("\t\t 8. Exit");
        System.out.println("");
        System.out.println("\t\t Select option (1-8):");
        Scanner scan = new Scanner(System.in) ;
        choice= scan.nextInt();

        switch (choice) {
            case 1:
                CreateClub.clubCreate();
                break;
        
           case 2:
                delete.delete();
                break;

            case 3:
            DisplayStatistic.display();
                break;

            case 4:
            PremierTable.display(scan);
                break;

            case 5:
            System.out.println("Function not avaiable..");
                break;

            case 6:
                updateScore.update();
                break;

            case 7:
                System.out.println("Function not avaiable..");
                break;
        
            case 8:
                System.exit(0);
                break;

            default:
            System.out.println("invalid option");
            break;

        }


    }
}
