// Largest element of an array:- 
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         int[] arr=new int[5];
//         for(int i=0;i<5;i++){
//             System.out.print("Enter the element " + i + ": ");
//             arr[i]=sc.nextInt();
//         }
//         int max=arr[0];
//         for(int i=0;i<arr.length;i++){
//             if(arr[i]>max){
//                 max=arr[i];
//             }
//         }
//         System.out.println("Largest element of an array is : " + max);
//         sc.close();
//     }
// }






// Smallest element of an array ->
// import java.util.Scanner;
// public class arrays{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.println("Enter the length of an array : ");
//         int n=sc.nextInt();
//         int[] arr=new int[n];
//         for(int i=0;i<n;i++){
//             System.out.print("Enter the element" + i + ": ");
//             arr[i]=sc.nextInt();
//         }
//         int minimum=arr[0];
//         for(int i=0;i<n;i++){
//             if(arr[i]<minimum){
//                 minimum=arr[i];
//             }
//         }
//         System.out.println("Smallest element of an array is : "+ minimum);
//         sc.close();
//     }
// }






// Reverse an array :-
// import java.util.Scanner;
// public class arrays {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         System.out.print("Enter the length of an array:");
//         int length = sc.nextInt();
//         int[] arr = new int[length];
//         // Input elements
//         for (int i = 0; i < length; i++) {
//             System.out.print("Enter the element " + i + ": ");
//             arr[i] = sc.nextInt();
//         }
//         int left = 0;
//         int right = length - 1;
//         int temp;
//         // Reverse array using two pointers
//         while (left < right) {
//             temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;
//             // Move pointers
//             left++;
//             right--;
//         }
//         // Print reversed array
//         for (int i = 0; i < length; i++) {
//             System.out.println("Element of an array " + i + " is: " + arr[i]);
//         }
//         sc.close();
//     }
// }




import java.util.Scanner;
public class arrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an array : ");
        int length=sc.nextInt();
        int[] arr=new int[length];
        boolean isPalindrome=true;
        for(int i=0;i<length;i++){
            System.out.print("Enter element "+ i + ": ");
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=length-1;
        while(left<right){
            if(arr[left]==arr[right]){
                isPalindrome=true;
                left++;
                right--;
            }
            else{
                isPalindrome=false;
                break;
            }
        }
        if(isPalindrome==true){
            System.out.println("Array is an Palindrome");
        }
        else{
            System.out.println("Array is not Palindrome");
        }
        sc.close();
    }
}