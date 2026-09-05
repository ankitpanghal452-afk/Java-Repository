// public class loops {
//     public static void main(String[] args){
//         int number=1;
//         while(number<=5){
//             System.out.println(number);
//             number++;
//         }
//     }
// }



// public class loops{
//     public static void main(String[] args){
//         int number=1;
//         while(number<=50){
//             if(number%2==0){
//                 System.out.println(number);
//             }
//             number++;
//         }
//     }
// }






// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         int number=1;
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number of elements you want to add : ");
//         int n=sc.nextInt();
//         int sum=0;
//         while(number<=n){
//             sum=sum+number;
//             number++;
//         }
//         System.out.println("Sum of the numbers is : " + sum);
//         sc.close();
//     }
// }




// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number for which you want to find factorial : ");
//         int number=sc.nextInt();
//         int fact=1;
//         while(number>=1){
//             fact=fact*number;
//             number--;
//         }
//         System.out.println("Factorial of number is : " +fact);
//         sc.close();
//     }
// }





// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int number=sc.nextInt();
//         int count=0;
//         while(number>=1){
//             count+=1;
//             number=number/10;
//         }
//         System.out.println("nubmer of digits in number are : " + count);
//         sc.close();
//     }
// }





// import java.util.Scanner;
// public class loops{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the number : ");
//         int number=sc.nextInt();
//         int num=0;
//         while(number>=1){
//             int digit=number%10;
//             num=(num*10)+digit;
//             number=number/10;
//         }
//         System.out.println("Reverse of a number is " + num);
//     }
// }