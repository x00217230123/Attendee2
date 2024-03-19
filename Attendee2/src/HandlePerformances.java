import java.util.Scanner;

public class HandlePerformances {
    Scanner reader=new Scanner(System.in);
    public void handlePerformances(){
    System.out.println("Enter your choice: 1. Add performances; 2. Display all the performances; 3. Start the performances; 4. QUIT");
    int choice=reader.nextInt();
    switch(choice){
        case 1:
            System.out.println("Enter the number of performances: ");
            int num=reader.nextInt();
            reader.nextLine();
            addPerformances(num);
            break;
        case 2:
            displayPerformances();
            break;
        case 3:
            startPerformances();
            break;
        case 4:
            System.out.println("Thank you for using the program");
            break;
        default:
            System.out.println("Invalid choice");
            break;
    }
    while(choice!=4);


    }
public void addPerformances(int num){
    for(int i=0;i<num;i++){
        System.out.println("Enter the ID of the performance:");
        String performanceID=reader.nextLine();
        System.out.println("Enter the name of the performance: ");
        String performanceName=reader.nextLine();
        System.out.println("Enter the name of the leader performer:");
        String performanceLeaderName=reader.nextLine();
        System.out.println("Enter the rank of the performance:");
        char performanceGroup=reader.nextLine().charAt(0);
        Performance performance=new Performance(performanceID,performanceName,performanceLeaderName,performanceGroup);
        this.performances.offer(performance);
    
    
    }
}
public void displayPerformances(){
    System.out.println("Here is the list of the performance:"+performances);
}
public void startPerformances(){
    System.out.println("The next performance starting is:"+performances.poll());
}
}
