import java.util.Scanner;

class Positive_Negative_Zero{
    public static void main(String[] agrs){
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = var1.nextInt();

        if(n<0){
            System.out.println("Negative");
        }
        else if(n >= 1){
            System.out.println("positive");
        }
        else{
            System.out.println("Zero");
        }
    }
}