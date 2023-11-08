import java.util.Scanner;
public class delete{
public static void main(string[]args){
scanner input = new Scanner(System.in);



 System.out.print("Enter the index of the team to delete: ");
                    int indexToDelete = input.nextInt();
                    input.nextLine(); // Consume the newline character
                    if (indexToDelete >= 0 && indexToDelete < teams.size()) {
                        teams.remove(indexToDelete);
                        System.out.println("Team deleted successfully.\n");
                    } else {
                        System.out.println("Invalid index. No team deleted.\n");
                    }
                    
                    input.close();
                    
                    }
                    
               }