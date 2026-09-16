// public class fst {
//     public static void main(String[] args){
//         String name="Ankit Panghal";
//         System.out.println(name);
//     }
// }




// import java.util.Scanner;
// public class fst{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter your name : ");
//         String s=sc.nextLine();
//         System.out.println("Name of the user is : "+s);
//     }
// }







// import java.util.Scanner;
// public class fst{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the string : ");
//         String name=sc.nextLine();
//         for(int i=0;i<name.length();i++){
//             System.out.print(name.charAt(i));
//         }
//         sc.close();
//     }
// }






// import java.util.Scanner;
// public class fst{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the string : ");
//         String str=sc.nextLine();
//         String reverse="";
//         for(int i=str.length()-1;i>=0;i--){
//             reverse=reverse+str.charAt(i);
//         }
//         System.out.println(reverse);
//         sc.close();
//     }
// }






import java.util.Scanner;
public class fst{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your string : ");
        String str=sc.nextLine();
        int left=0;
        int right=str.length()-1;
        boolean palindrome=true;
        while(left<right){
            if(str.charAt(left) != str.charAt(right)){
                palindrome=false;
                break;
            }
            left++;
            right--;
        }
        if(palindrome){
            System.out.println("String is palindrome");
        }
        else{
            System.out.println("String is not palindrome");
        }
    }
}