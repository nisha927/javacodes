import java.util.Scanner;

class Natural_reverse_order
{
    public static void main(String[] args)
    {
        Scanner natural = new Scanner(System.in);
        System.out.print("Enter the first n natural number in reverse order: ");
        int n = natural.nextInt();

        for(int i = n; i >= 1; i--){
            System.out.println(i + " is natural number.");
        }
        natural.close();
    }
}