import java.util.Scanner;

class EvenOdd
{
    public static void main(String[] agrs)
    {
        int n;
        Scanner e = new Scanner(System.in);
        System.out.print("Enter the number: ");
        n =e.nextInt();

        if (n % 2 == 0){
            System.out.print(n + " is Even Number.");
        }    
        else{
            System.out.println(n + " is Odd NUmber.");
        }

    }
}



