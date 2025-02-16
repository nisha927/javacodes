import java.util.Scanner;

class Natural_number
{
    public static void main(String[] args)
    {
        Scanner nat = new Scanner(System.in);
        System.out.print("Enter the natural number: ");
        int n = nat.nextInt();

        int x = 1;
        while (x <= n){
            System.out.println(x);
            x++;
        }
        nat.close();
    }
}