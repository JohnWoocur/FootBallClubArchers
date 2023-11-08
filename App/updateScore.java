package App;
import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;  
        
        
        public class updateScore {
            public static void update(String[] args) {
            	
            	Scanner scanner = new Scanner(System.in);
        		FileHandling.showClub();
        		System.out.println(" ");
        		System.out.println("Select the Football Club :");
                String clubName = scanner.next();
                System.out.println("Enter the Score:");
                String newScore = scanner.next();
                System.out.println("New Updated Score is :"+newScore);


                String dataDirectory = ".\\ClubMoreDetails\\";

           

                updateClubScore(dataDirectory, clubName, newScore);     // Update the club's score and save the data to a text file.
                
                
              System.out.println("Do you want update score again(y/n):");
               char input = scanner.next().charAt(0);
               switch (input) {
                   case 'y' :
                     update(args);
                       break;

                   case 'n' :
                	   //Menu();
                       break;


                   default:
                       System.out.println("Invalid Selection");
                       break;
               }
               

               scanner.close();
       		
       	}
           
            

            public static void updateClubScore(String dataDirectory, String clubName, String newScore) {
                try {
                    // Construct the file path for the club's data file.
                    String filePath = dataDirectory + clubName + ".txt";
                    
                    // Read the existing club data from the file.
                    File file = new File(filePath);
                    Scanner scanner = new Scanner(file);
                    ArrayList<String> clubData = new ArrayList<>();
                    
                    while (scanner.hasNextLine()) {
                        clubData.add(scanner.nextLine());
                    }
                    scanner.close();
                    
                    // Update the score in the data.
                    clubData.set(5, newScore);
                    
                    // Write the updated data back to the file.
                    FileWriter fileWriter = new FileWriter(filePath);
                    for (String line : clubData) {
                        fileWriter.write(line + "\n");
                    }
                    fileWriter.close();
                    
                    
                    // Display the updated data (optional).
                    System.out.println("+------+"+"+-------+");
                    System.out.println("| Club |"+"| Points |");
                    System.out.println("+------+"+"+--------+");
                    System.out.println(clubName+"\t"+"  "+newScore);
                    System.out.println("+------+"+"+--------+");
                    System.out.println("Data updated and saved successfully.");
                } catch (Exception e) {
                    System.err.println("Error updating club data: " + e.getMessage());
                    e.printStackTrace();
                }
            }
        
        }
        
        

