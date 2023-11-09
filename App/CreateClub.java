package App;

import java.io.IOException;
import java.util.Scanner;

import App.FileHandling;
import App.Menu;

class Club {
    private String name;
    private String location;
    private int wins;
    private int draws;
    private int defeats;
    private int goalsReceived;
    private int points;
    private int matchesPlayed;

    public Club(String name, String location) {
        this.name = name;
        this.location = location;
    }

    public void setStatistics(int wins, int draws, int defeats, int goalsReceived, int points, int matchesPlayed) {
        this.wins = wins;
        this.draws = draws;
        this.defeats = defeats;
        this.goalsReceived = goalsReceived;
        this.points = points;
        this.matchesPlayed = matchesPlayed;
    }

 /*   @Override
    public String toString() {
        return "Club Name: " + name + "\nLocation: " + location + "\nWins: " + wins + "\nDraws: " + draws + "\nDefeats: " + defeats +
                "\nGoals Received in the Season: " + goalsReceived + "\nPoints: " + points + "\nMatches Played in the Season: " + matchesPlayed;
    }*/
}

public class CreateClub {
    public static void clubCreate() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\t\t\t | Create football club | "); 
            System.out.println("\t\t\t | -------------------- | "); 
            System.out.println(""); 
            System.out.println("Enter Club Name:");
            String name = scanner.nextLine();

            System.out.println("Enter Club Location:");
            String location = scanner.nextLine();
            
           
            Club club = new Club(name, location);

            System.out.println("Enter how many wins in the season:");
            int wins = scanner.nextInt();

            System.out.println("Enter how many draws in the season:");
            int draws = scanner.nextInt();

            System.out.println("Enter how many defeats in the season:");
            int defeats = scanner.nextInt();

            System.out.println("Enter how many goals received in the season:");
            int goalsReceived = scanner.nextInt();

            System.out.println("Enter how many points currently has:");
            int points = scanner.nextInt();

            System.out.println("Enter how many matches played in the season:");
            int matchesPlayed = scanner.nextInt();

            club.setStatistics(wins, draws, defeats, goalsReceived, points, matchesPlayed);
            try {
                FileHandling.Save_Club(name, location);
            
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            try {
                FileHandling.saveMoreDetails(name,wins,draws,defeats,goalsReceived,points,matchesPlayed, matchesPlayed);
            } catch (Exception e) {
                // TODO: handle exception 
                System.out.println("error");
                e.printStackTrace();
            }
         
            System.out.println("Club Information:\n" + club);

            System.out.println("Do you want to add another club? (yes/no)");
            String choice = scanner.next();
            if (choice.equals("no")) {
            	Menu.menu();
                
                break;
            }
            scanner.nextLine(); // Consume the newline
        }
        
    }
}