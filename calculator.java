import java.util.Scanner;

class calculator
{
    public static void main(String[] agrs)
    {
      Scanner cal = new Scanner(System.in);
      System.out.print("enter the first number: ");
      int num1 = cal.nextInt();
      System.out.print("enter the second number: ");
      int num2 = cal.nextInt();

      System.out.print("+,-,*,/,%");
      System.out.print("Enter the operator: ");
      char operator = cal.next().charAt(0);

      if(operator == '+'){
        System.out.print("sum of "+ num1 + "+" + num2 + " = " + (num1+num2));
      }
      else if(operator == '-'){
        System.out.print("subtract of "+ num1 + "-" + num2 + " = " + (num1-num2));
      }
      else if(operator == '*'){
        System.out.print("product of "+ num1 + "*" + num2 + " = " + (num1*num2));
      }
      else if(operator == '/'){
        System.out.print("quotien of "+ num1 + "/" + num2 + " = " + (num1/num2));
      }
      else if(operator == '%'){
        System.out.print("remainder of "+ num1 + "%" + num2 + " = " + (num1%num2));
      }

    }
}
















