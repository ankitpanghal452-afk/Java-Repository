// Second Largest element of an array :-
// import java.util.Scanner;
// public class arrays_01{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the length of an array : ");
//         int length=sc.nextInt();
//         int[] arr=new int[length];
//         for(int i=0;i<length;i++){
//             System.out.print("Enter the element "+ i + ": ");
//             arr[i]=sc.nextInt();
//         }
//         int largest=arr[0];
//         int second_largest=arr[0];
//         for(int i=0;i<length;i++){
//             if(arr[i]>largest){
//                 second_largest=largest;
//                 largest=arr[i];
//             }
//             else if(arr[i]<largest && arr[i]>second_largest){
//                 second_largest=arr[i];
//             }
//         }
//         System.out.println("Second largest element of an array is : "+ second_largest);
//         sc.close();
//     }
// }





// Count odd and even elements in an array :-
// import java.util.Scanner;
// public class arrays_01{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the length of an array : ");
//         int length=sc.nextInt();
//         int[] arr=new int[length];
//         for(int i=0;i<length;i++){
//             System.out.print("Enter the element "+ i +" of an array : ");
//             arr[i]=sc.nextInt();
//         }
//         int even_count=0;
//         int odd_count=0;
//         for(int i=0;i<length;i++){
//             if(arr[i] % 2 == 0){
//                 even_count += 1;
//             }
//             else{
//                 odd_count += 1;
//             }
//         }
//         System.out.println("Total even number in array are : "+ even_count);
//         System.out.println("Total odd number in array are : "+ odd_count);
//         sc.close();
//     }
// }






// import java.util.Scanner;
// public class arrays_01{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the length of an array : ");
//         int length=sc.nextInt();
//         int arr[]=new int[length];
//         for(int i=0;i<length;i++){
//             System.out.print("Enter the "+ i +" element of an array : ");
//             arr[i]=sc.nextInt();
//         }
//         int even_sum=0;
//         int odd_sum=0;
//         for(int i=0;i<length;i++){
//             if(arr[i]%2==0){
//                 even_sum+=arr[i];
//             }
//             else{
//                 odd_sum+=arr[i];
//             }
//         }
//         System.out.println("Sum of even elements of an array are : "+even_sum);
//         System.out.println("Sum of odd elements of an array are : "+odd_sum);
//         sc.close();
//     }
// }




// Find Duplicate Elements in an Array
import java.util.Scanner;
public class arrays_01{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an array : ");
        int length=sc.nextInt();
        int arr[]=new int[length];
        for(int i=0;i<length;i++){
            System.out.println("Enter the "+ i +" element of an array : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]+ " is an duplicate element");
                }
            }
        }
        sc.close();
    }
}