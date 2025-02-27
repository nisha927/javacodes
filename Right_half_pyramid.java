import java.util.Scanner;

class Right_half_pyramid{
    public static void main(String[] args){
        Scanner var1 = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = var1.nextInt();

        for(int i = 0; i < num; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


