// Check if array is sorted or not
// import java.util.Scanner;
// public class arrays_02 {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the length of an array : ");
//         int length=sc.nextInt();
//         int[] arr=new int[length];
//         for(int i=0;i<length;i++){
//             System.out.print("Enter element : ");
//             arr[i]=sc.nextInt();
//         }
//         boolean sorted = true;
//         for(int i = 0; i < length - 1; i++){
//             if(arr[i] > arr[i + 1]){
//                 sorted = false;
//                 break;
//             }
//         }
//         if(sorted){
//             System.out.println("Array is sorted");
//         }
//         else{
//             System.out.println("Array is not sorted");
//         }
//         sc.close();
//     }
// }






// Check if Array is Sorted in Descending Order
// import java.util.Scanner;
// public class arrays_02{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the length of an array : ");
//         int length=sc.nextInt();
//         int[] arr=new int[length];
//         for(int i=0;i<length;i++){
//             System.out.print("Enter element : ");
//             arr[i]=sc.nextInt();
//         }
//         boolean sorted=true;
//         for(int i=0;i<length-1;i++){
//             if(arr[i]<arr[i+1]){
//                 sorted=false;
//                 break;
//             }
//         }
//         if(sorted){
//             System.out.println("Array is sorted in descending order");
//         }
//         else{
//             System.out.println("Array is not sorted in descending order");
//         }
//     }
// }








// Find the Missing Number
import java.util.Scanner;
public class arrays_02{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an array : ");
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter element : ");
            arr[i]=sc.nextInt();
        }
        int n=length+1;
        int expectedSum=(n*(n+1))/2;
        int originalSum=0;
        for(int i=0;i<length;i++){
            originalSum+=arr[i];
        }
        int missing=expectedSum-originalSum;
        System.out.println("Missing number in array is : "+missing);
        sc.close();
    }
}