// import java.util.Scanner;
// public class hlo {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter username : ");
//         String userName=sc.next();
//         System.out.print("Enter your password : ");
//         String password=sc.next();
//         if(!userName.equals("admin") && (password.equals("1234") || !password.equals("1234"))){
//             System.out.println("Wrong UserName or Password");
//         }
//         else if(userName.equals("admin") && !password.equals("1234")){
//             System.out.println("Wrong Password Please Try Another Password");
//         }
//         else if(userName.equals("admin") && password.equals("1234")){
//             System.out.println("Successfully Login");
//         }
//         else{
//             System.out.println("Invalid Credentials");
//         }
//         sc.close();
//     }
// }






// import java.util.Scanner;
// public class hlo{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the Character : ");
//         char ch=sc.next().charAt(0);
//         ch = Character.toLowerCase(ch);
//         if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
//             System.out.println("Vowel");
//         }
//         else{
//             System.out.println("Consonant");
//         }
//         sc.close();
//     }
// }






// import java.util.Scanner;
// public class hlo{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the number : ");
//         int number=sc.nextInt();
//         if(number==0){
//             System.out.println("Number is Zero");
//         }
//         else if(number<0){
//             if(number%2==0){
//                 System.out.println("Negative even");
//             }
//             else{
//                 System.out.println("Negative odd");
//             }
//         }
//         else{
//             if(number%2==0){
//                 System.out.println("Positive even");
//             }
//             else{
//                 System.out.println("Positive odd");
//             }
//         }
//         sc.close();
//     }
// }





// import java.util.Scanner;
// public class hlo {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter first number : ");
//         int firstNumber = sc.nextInt();
//         System.out.print("Enter the operator : ");
//         char op = sc.next().charAt(0);
//         System.out.print("Enter second number : ");
//         int secondNumber = sc.nextInt();
//         int result = 0;
//         boolean valid = true;
//         if (op == '+') {
//             result = firstNumber + secondNumber;
//         }
//         else if (op == '-') {
//             result = firstNumber - secondNumber;
//         }
//         else if (op == '*') {
//             result = firstNumber * secondNumber;
//         }
//         else if (op == '/') {

//             if (secondNumber == 0) {
//                 System.out.println("Cannot divide by zero");
//                 valid = false;
//             }
//             else {
//                 result = firstNumber / secondNumber;
//             }
//         }
//         else {
//             System.out.println("Invalid Operator");
//             valid = false;
//         }
//         if (valid) {
//             System.out.println("Result is : " + result);
//         }
//         sc.close();
//     }
// }