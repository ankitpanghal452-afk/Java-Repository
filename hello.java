// import java.util.Scanner;
// public class hello {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter first number : ");
//         int firstNumber=sc.nextInt();
//         System.out.print("Enter second number : ");
//         int secondNumber=sc.nextInt();
//         System.out.print("Enter third number : ");
//         int thirdNumber=sc.nextInt();
//         if(firstNumber>=secondNumber && firstNumber>=thirdNumber){
//             System.out.println("First number is largest out of the three");
//         }
//         else if(secondNumber>=firstNumber && secondNumber>=thirdNumber){
//             System.out.println("Second number is largest out of the three");
//         }
//         else{
//             System.out.println("Third number is largest out of the three");
//         }
//         sc.close();
//     }
// }







// import java.util.Scanner;
// public class hello{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter marks :");
//         int marks=sc.nextInt();
//         if(marks<0 || marks>100){
//             System.out.println("Invalid Marks");
//         }
//         else if(marks>=90 && marks<=100){
//             System.out.println("Grade -> A");
//         }
//         else if(marks>=75 && marks<=89){
//             System.out.println("Grade -> B");
//         }
//         else if(marks>=60 && marks<=74){
//             System.out.println("Grade -> C");
//         }
//         else if(marks>=40 && marks<=59){
//             System.out.println("Grade -> D");
//         }
//         else{
//             System.out.println("Fail");
//         }
//         sc.close();
//     }
// }








// import java.util.Scanner;
// public class hello{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the year : ");
//         int year=sc.nextInt();
//         if(year%400==0 || (year%4==0 && year%100 !=0)){
//             System.out.println("Leap Year");
//         }
//         else{
//             System.out.println("Not a Leap Year");
//         }
//         sc.close();
//     }
// }








// import java.util.Scanner;
// public class hello{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the units : ");
//         int unit=sc.nextInt();
//         int bill;
//         if(unit<=0){
//             bill=0;
//         }
//         else if(unit<=100){
//             bill=unit*5;
//         }
//         else if(unit>100 && unit<=200){
//             bill=500+((unit-100)*7);
//         }
//         else if(unit>200 && unit<=300){
//             bill=1200+((unit-200)*10);
//         }
//         else{
//             bill=2200+((unit-300)*15);
//         }
//         if(bill==0){
//             System.out.println("Invalid units");
//         }
//         else{
//             System.out.print("Total bill to be paid : ");
//             System.out.println(bill);
//         }
//         sc.close();
//     }
// }