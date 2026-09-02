// import java.util.Scanner;
// public class swich {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter first number : ");
//         int firstNumber=sc.nextInt();
//         System.out.print("Enter operator : ");
//         char op=sc.next().charAt(0);
//         System.out.print("Enter second number : ");
//         int secondNumber=sc.nextInt();
//         int result=0;
//         boolean valid=true;
//         switch(op){
//             case '+':
//                 result=firstNumber+secondNumber;
//                 break;
//             case '-':
//                 result=firstNumber-secondNumber;
//                 break;
//             case '/':
//                 if(secondNumber==0){
//                     System.out.println("Divide by zero error");
//                     valid=false;
//                 }
//                 else{
//                     result=firstNumber/secondNumber;
//                 }
//                 break;
//             case '*':
//                 result=firstNumber*secondNumber;
//                 break;
//             default:
//                 System.out.println("Invalid operator");
//                 valid=false;
//         }
//         if(valid==true){
//             System.out.println("Result is : " + result);
//         }
//         sc.close();
//     }
// }








// import java.util.Scanner;
// public class swich{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter year : ");
//         int year=sc.nextInt();
//         System.out.print("Enter the number of month : ");
//         int month=sc.nextInt();
//         switch(month){
//             case 1:
//             case 3:
//             case 5:
//             case 7:
//             case 8:
//             case 10:
//             case 12:
//                 System.out.println("31 days in month");
//                 break;
//             case 4:
//             case 6:
//             case 9:
//             case 11:
//                 System.out.println("30 days in month");
//                 break;
//             case 2:
//                 if(year%400==0 || (year%4==0 && year%100!=0)){
//                     System.out.println("29 days in month");
//                 }
//                 else{
//                     System.out.println("28 days in month");
//                 }
//                 break;
//             default:
//                 System.out.println("Invalid month");
//         }
//         sc.close();
//     }
// }







import java.util.Scanner;
public class swich {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Menu:");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();
        int balance = 10000;
        switch (choice) {
            case 1:
                System.out.println("Your Balance is: " + balance);
                break;
            case 2:
                System.out.print("Enter the amount you want to deposit: ");
                int amount = sc.nextInt();
                if (amount > 0) {
                    balance += amount;
                    System.out.println("Amount deposited successfully");
                    System.out.println("Current Balance: " + balance);
                }
                else {
                    System.out.println("Invalid Amount");
                }
                break;
            case 3:
                System.out.print("Enter the money you want to withdraw: ");
                int money = sc.nextInt();
                if (money > 0 && money <= balance) {
                    balance -= money;
                    System.out.println("Withdrawal successful");
                    System.out.println("Current Balance: " + balance);
                }
                else {
                    System.out.println("Invalid Amount or Low Balance");
                }
                break;
            case 4:
                System.out.println("Thanks for Banking with us");
                break;
            default:
                System.out.println("Invalid Choice");
        }
        sc.close();
    }
}