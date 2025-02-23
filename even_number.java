import java.util.Scanner;

public class even_number{
    public static void main(String[] args){
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = var1.nextInt();

        for(int i = 2; i < 100; i += 2){
            System.out.println(i);
        }
        var1.close();
    }

}