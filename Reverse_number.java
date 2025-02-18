import java.util.Scanner;

class Reverse_number
{
    public static void main(String[] agrs)
    {
        Scanner reverse = new Scanner(System.in);
        System.out.print("Enter the reverse number: ");
        int n = reverse.nextInt();

        for(int i = n; i >= 1; i--){
            System.out.println(i);
        }
        reverse.close();
    }
}