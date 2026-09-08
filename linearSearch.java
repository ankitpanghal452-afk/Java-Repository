// Linear Search in an Array
// import java.util.Scanner;
// public class linearSearch {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the length of an array : ");
//         int length=sc.nextInt();
//         int arr[]=new int[length];
//         for(int i=0;i<length;i++){
//             System.out.print("Enter element :");
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("Enter the element you want to search : ");
//         int target=sc.nextInt();
//         boolean found=false;
//         for(int i=0;i<length;i++){
//             if(arr[i]==target){
//                 System.out.println("Element is found at index : "+i);
//                 found=true;
//                 break;
//             }
//         }
//         if(!found){
//             System.out.println("Target element is not present in the array");
//         }
//     }
// }





// Find All Occurrences of an Element
// import java.util.Scanner;
// public class linearSearch{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the length of an array : ");
//         int length=sc.nextInt();
//         int[] arr=new int[length];
//         for(int i=0;i<length;i++){
//             System.out.print("Enter element : ");
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("Enter the target : ");
//         int target=sc.nextInt();
//         int count=0;
//         for(int i=0;i<length;i++){
//             if(arr[i]==target){
//                 System.out.println("Target is at index : "+i);
//                 count++;
//             }
//         }
//         if(count==0){
//             System.out.println("Target element is not present in array");
//         }
//         else{
//             System.out.println("Target element comes -> "+count + " times in the array");
//         }
//     }
// }






// Find First and Last Occurrence
import java.util.Scanner;
public class linearSearch{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an array :");
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter the element :");
            arr[i]=sc.nextInt();
        }
        int first=-1;
        int last=-1;
        System.out.print("Enter the target element : ");
        int target=sc.nextInt();
        for(int i=0;i<length;i++){
            if(arr[i]==target){
                if(first==-1){
                first=i;
                }
                else{
                    last=i;
                }
            }
        }
        if(first!=-1 && last!=-1){
            System.out.println("first occurence of Element is at index : "+first);
            System.out.println("Last occurence of Element is at  index : "+last);
        }
        else if(first!=-1 && last==-1){
            System.out.println("element occurs only once at index : "+first);
        }
        else{
            System.out.println("Element not found");
        }
    }
}