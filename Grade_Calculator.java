import java.util.Scanner;

class Grade_Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the student marks: ");
        int marks = sc.nextInt();

        if(marks > 90){
            System.out.println("Grade A");
        }
        else if(80 <= marks && marks <= 90){
            System.out.println("Grade B");
        }
        else if(70 <= marks && marks <= 80){
            System.out.println("Grade C");
        }
        else if(60 <= marks && marks <= 70){
            System.out.println("Grade D");
        }
        else if(marks < 60){
            System.out.println("Fail");
        }
        sc.close();
    }
}