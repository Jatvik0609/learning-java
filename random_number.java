import java.util.Scanner;

public class random_number {

    public static void main(String[] args){

        try (Scanner sc = new Scanner(System.in)) {
            int myNumber = (int)(Math.random()*5);

            int userNumber;
            do{
                System.out.println("Guss the number (0-5): ");
                userNumber = sc.nextInt();

                if(userNumber == myNumber){
                    System.out.println("My number was");
                    System.out.println(myNumber);
                    System.out.println("YOU GOT THIS!!!");
                    break;
                }

                else if(userNumber > myNumber){
                    System.out.println("Your number is too large...");
                }

                else {
                    System.out.println("Your number is too small...");
                }
            } while(userNumber >= 0);
        }
    }
}