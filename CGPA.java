import java.util.Scanner;

class CGPA
{
    public static void main(String[] agrs)
    {
       
        Scanner sub = new Scanner(System.in);

        System.out.print("Enter the marks of subject1: ");
        int sub1 = sub.nextInt();

        System.out.print("Enter the marks of subject2: ");
        int sub2 = sub.nextInt();

        System.out.print("Enter the marks of subject3: ");
        int sub3 = sub.nextInt();

        int sum = sub1 + sub2 + sub3;
        System.out.println("SUM: "+ sum);
        int CGPA = (sum/3)/10;

        System.out.println("Cumulative Grade Point Average(CGPA): " + CGPA);
        
    }
}