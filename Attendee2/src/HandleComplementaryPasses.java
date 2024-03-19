
import java.util.Stack;
import java.util.Scanner;
public class HandleComplementaryPasses {
    Scanner reader=new Scanner(System.in);
    Stack <ComplementaryPasses > cp=new Stack<>();
    public void handleComplementaryPasses(){
        int choice=0;
        do{
            System.out.println("\n"+"Here are the complementary passes operations available to you:"+"\n");
            System.out.println("Type 1 to redeem complementary passes:"+"\n");
            System.out.println("Type 2 to display the list of redeemed complementary passes:"+"\n");
            System.out.println("Type 3 to display the last redeem complementary classes"+"\n");
            System.out.println("Type 4 to undo the redeemed complementary pass"+"\n");
            System.out.println("Type 5 to quit"+"\n");
            choice =reader.nextInt();
            switch (choice){
                case 1:
                    System.out.println("Please write");
                    int num= reader.nextInt();
                    reader.nextInt();
                    redeemComplementaryPasses(num);
                    break;
            
                case 2:
                    displayComplementaryPasses();
                    break;
                case 3:
                    displayLastRedeemedComplementaryPasses();
                    break;
                case 4:
                    undoRedeemedComplementaryPass();
                    break;
                case 5:
                    break;
                default:
                    System.out.println("Invalid choice. Please print a valid choice:");

                    }
                    

    }while (choice!=5);
}
    public void redeemComplementaryPasses(int numOfPasses){
        if(cp.size()>=10){
            System.out.println("Invalid choice.Would you like to see the list(Y/N)?");
            char choice1 =reader.nextLine().charAt(0);
            if (choice1=='Y'){
                displayComplementaryPasses();
                return;
            }
        }
        else{
            int i=0;
            do{
                System.out.println("Enter the Complementary Pass:");
                String ID =reader.nextLine();
                System.out.println("Enter the access Level:");
                String accessLevel=reader.nextLine();
                ComplementaryPasses Pass=new ComplementaryPasses(ID, accessLevel);
                cp.push(Pass);
                i++;

            }while(i<numOfPasses);
            
        }
    }
    public void displayComplementaryPasses(){
        System.out.println("This is the list of redeem complementary passes:"+"\n"+cp);

    }
    public void displayLastRedeemedComplementaryPasses(){
        System.out.println("The last redeem complementary pass is"+cp.peek());

    }
    public void undoRedeemedComplementaryPass(){
        System.out.println("Enter the Pass ID you want to undo:");
        String ID =reader.nextLine();
        for(ComplementaryPasses pass:cp){
            if(pass.getpassID.equals(ID)){
                cp.pop();
                System.out.println("The pass with the ID"+ID+"has been removed from the list.");
            }
        }
    }


}
