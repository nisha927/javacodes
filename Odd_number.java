import java.util.Scanner;

class Odd_number
{
    public static void main(String[] args)
    {
        Scanner odd = new Scanner(System.in);
        System.out.print("Enter the odd number: ");
        int n = odd.nextInt();
        for(int i = 1; i<= n; i += 2){
            System.out.println(i +" is odd number.");
        }
        odd.close();
    }
}