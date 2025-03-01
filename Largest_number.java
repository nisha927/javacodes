import java.util.Scanner;

class Largest_number{
    public static void main(String[] args){
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int x = var1.nextInt();
        System.out.print("Enter the second number: ");
        int y = var1.nextInt();
        System.out.print("Enter the third number: ");
        int z = var1.nextInt();

        if (x>y && x>z){
            System.out.println(x + " is largest number");
        }
        else if(y>x && y>z){
            System.out.println(y + " is largest number");
        }
        else if(z>x && z>y){
            System.out.println(z + " is largest number");
        }
        var1.close();
    }
}