
package plans.impl;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Bolatzhan Kumalakov
 */
public class InClassStack {

    
    public static void main(String[] args) throws Exception {
        //this object will read user input
        Scanner sc = new Scanner(System.in);
        ChangeManager cmr = new  ChangeManager();
        
        //print out user menu
        System.out.println("1. Plan the change.");
        System.out.println("2. Commit change.");
        System.out.println("3. Print out commited changes.");
        System.out.println("4. Exit.");
        
        //read in user choice
        int userChoice = sc.nextInt();
//        String name, desc;
//        int year = 0, month=0, day=0;
        
        
        //this loop makes sure that user existst only when userChoice == 4
        while(userChoice != 4){
            
            if(userChoice>4 || userChoice<1){
                System.out.println("Oops! There is no such option. Please, try again.");
            } else if(userChoice == 1){
                
//                System.out.print("Enter name: ");
//                name = sc.next();
//                
//                System.out.print("Enter description: ");
//                desc = sc.next();
//                
//                System.out.print("Enter date: ");
//                int Date = sc.nextInt();
//             
                cmr.planChange(new Change (new Date(2017, 6, 0) , "Clean the room", "Ayazhan"));  
                cmr.planChange(new Change (new Date(2017, 4, 3) , "Visit grandparents", "Ali")); 
                cmr.planChange(new Change (new Date(2017, 8, 5) , "Meet with friends", "Kymbat")); 
              
            } else if(userChoice == 2){
              
                cmr.commitChange();
                cmr.commitChange();
                cmr.commitChange();
        
            }else if(userChoice == 3){
                
                cmr.printCommitedChanges();
            }
            
            //print the menu and get another user choice
            System.out.println("1. Plan the change.");
            System.out.println("2. Commit change.");
            System.out.println("3. Print out commited changes.");
            System.out.println("4. Exit.");
        
            userChoice = sc.nextInt();
        }
        
    }
    
}
