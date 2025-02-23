import java.util.Scanner;

public class multiplication{
    public static void main(String[] agrs){
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = var1.nextInt();

        int i = 0;
        while(i <= 10){
            
            
            i++;
            System.out.println(n+"x"+i+"="+(n*i));
            
        }
        var1.close();
    }
}