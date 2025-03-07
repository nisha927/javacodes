import java.util.Scanner;
public class Prime_in_range{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the begning point of the range: ");
        int x = sc.nextInt();
        System.out.print("Enter the ending point of the range: ");
        int y = sc.nextInt();
        for(int i = x; i<=y; i++){
            if(i>1){
                boolean isPrime = true;
                for(int j = 2; j <= Math.sqrt(i); j++){
                    if(i%j==0){
                        isPrime = false;
                        break;
                    }
                }
                if(isPrime){
                    System.out.println(i);
                }
            }
        }
        sc.close();
    }
}