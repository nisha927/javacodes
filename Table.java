import java.util.Scanner;

class Table
{
    public static void main(String[] args)
    {
        Scanner tab = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = tab.nextInt();
        for(int i = 1; i <= 10; i++){
            System.out.println(n+"x"+i+"="+(n*i));
        }
        tab.close();
    }
}