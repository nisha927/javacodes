import java.util.Scanner;

class sum_of_natural_number{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the numer: ");
        int n = sc.nextInt();

        int sum = 0;
        for(int i = 1; i <= n; i++){
            System.out.println(i);
            sum += i;
        }
        System.out.println("Sum of first "+ n +" natural number: "+ sum);
        sc.close();
    }
}