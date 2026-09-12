// import java.util.Scanner;
// import java.util.Arrays;
// public class sum {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the length of an array : ");
//         int length=sc.nextInt();
//         int[] arr=new int[length];
//         for(int i=0;i<length;i++){
//             System.out.print("Enter element : ");
//             arr[i]=sc.nextInt();
//         }
//         int[] pair=new int[2];
//         System.out.print("Enter target : ");
//         int target=sc.nextInt();
//         boolean found=false;
//         for(int i=0;i<length;i++){
//             for(int j=i+1;j<length;j++){
//                 if(arr[i]+arr[j]==target){
//                     pair=new int[]{arr[i],arr[j]};
//                     found=true;
//                     break;
//                 }
//             }
//             if(found){
//                 System.out.println(Arrays.toString(pair));
//                 break;
//             }
//         }
//         if(!found){
//             System.out.println("No Match found");
//         }
//         sc.close();
//     }
// }






// Find the Intersection of Two Arrays
// import java.util.Scanner;
// public class sum{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the length of an array : ");
//         int length=sc.nextInt();
//         int[] arr=new int[length];
//         for(int i=0;i<length;i++){
//             System.out.print("Enter element : ");
//             arr[i]=sc.nextInt();
//         }
//         System.out.print("Enter length of second array : ");
//         int len=sc.nextInt();
//         int[] arr1=new int[len];
//         for(int i=0;i<len;i++){
//             System.out.print("Enter element : ");
//             arr1[i]=sc.nextInt();
//         }
//         int count=0;
//         int[] inter=new int[length];
//         for(int i=0;i<length;i++){
//             for(int j=0;j<len;j++){
//                 if(arr[i]==arr1[j]){
//                     inter[count] = arr[i];
//                     count++;
//                 }
//             }
//         }
//         for(int i=0; i<count; i++){
//         System.out.print(inter[i] + " ");
//         }
//         sc.close();
//     }
// }







// Find the Union of Two Arrays
import java.util.Scanner;
public class sum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of first array : ");
        int length=sc.nextInt();
        int[] arr1=new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter element : ");
            arr1[i]=sc.nextInt();
        }
        System.out.print("Enter the length of second array : ");
        int len=sc.nextInt();
        int[] arr2=new int[len];
        for(int i=0;i<len;i++){
            System.out.print("Enter element : ");
            arr2[i]=sc.nextInt();
        }
        int count=0;
        int newLength=length+len;
        int[] uni=new int[newLength];
        for(int i=0;i<length;i++){
            uni[count]=arr1[i];
            count++;
        }
        for(int j=0;j<len;j++){
            uni[count]=arr2[j];
            count++;
        }
        for(int i=0;i<newLength;i++){
            System.out.println(uni[i]);
        }
        sc.close();
    }
}