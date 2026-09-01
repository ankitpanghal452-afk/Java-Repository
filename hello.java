import java.util.Scanner;
public class hello {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter first number : ");
        int firstNumber=sc.nextInt();
        System.out.print("Enter second number : ");
        int secondNumber=sc.nextInt();
        System.out.print("Enter third number : ");
        int thirdNumber=sc.nextInt();
        if(firstNumber>=secondNumber && firstNumber>=thirdNumber){
            System.out.println("First number is largest out of the three");
        }
        else if(secondNumber>=firstNumber && secondNumber>=thirdNumber){
            System.out.println("Second number is largest out of the three");
        }
        else{
            System.out.println("Third number is largest out of the three");
        }
        sc.close();
    }
}
