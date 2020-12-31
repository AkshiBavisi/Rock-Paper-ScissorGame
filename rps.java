import java.util.*;
public class rps{
    static Scanner sc=new Scanner(System.in);
    public static void main(String args[]){
       
        System.out.println("Welcome to Rock,Paper,Scissor game!!");
        System.out.println("Rules:");
        System.out.println("You have to choose between Rock,Paper or Scissor");
        System.out.println("Rock beats Scissor");
        System.out.println("Scissor beats Paper");
        System.out.println("paper beats Rock");

        while(true){
            System.out.println("Choose from the following:");
            System.out.println("1.Rock");
            System.out.println("2.Paper");
            System.out.println("3.Scissor");
            System.out.println("Select:");
            int userchoice=sc.nextInt();
            int computerchoice=(int)(Math.random()*3);

            boolean playagain=calculateresult(userchoice-1,computerchoice);
            if(playagain)continue;
            else break;
        }
    }
    
    static boolean calculateresult(int userchoice,int computerchoice){
        /*0-rock
        1-paper
        2-scissor*/
        String result="";
        if(userchoice==0){
            switch(computerchoice){
                case 0:
                    result="draw";
                    break;
                case 1:
                    result="lost";
                    break;
                case 2:
                    result="win";
                    break;
            }
        }
        else if(userchoice==1){
            switch(computerchoice){
                case 0:
                    result="win";
                    break;
                case 1:
                    result="draw";
                    break;
                case 2:
                    result="lost";
                    break;
            }
        }
        else if(computerchoice==2){
            switch(computerchoice){
                case 0:
                    result="lost";
                    break;
                case 1:
                    result="win";
                    break;
                case 2:
                    result="draw";
                    break;
            }
        }
        System.out.println(result);
        System.out.println("Do you want to play game again?(yes/no):");
        String yesno=sc.next();
        if(yesno.equalsIgnoreCase("yes"))
            return true;
        else
            return false;
    }
}