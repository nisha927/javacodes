import java.util.Scanner;

class Leap_year
{
    public static void main(String[] args){
        System.out.print("Enter the name of year you want to search: ");
        Scanner ly = new Scanner(System.in);
        int year = ly.nextInt();

        if( year%4==0){
            if(year%100==0){
                if(year%400==0){
                    System.out.println(year + " is a Leap Year.");
                }
                else{
                    System.out.println(year + " is not a Leap Year.");
                }
            }
            else{
                System.out.println(year + " is not a Leap Year.");
            }
        }
        else{
            System.out.println(year + " is not a Leap Year.");
        }
    }
}