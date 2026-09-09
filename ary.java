// // Move all zeros to the end
// import java.util.Scanner;
// public class ary{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter length of an array : ");
//         int length=sc.nextInt();
//         int[] arr=new int[length];
//         for(int i=0;i<length;i++){
//             System.out.print("Enter element : ");
//             arr[i]=sc.nextInt();
//         }
//         int left = 0;
//         int right = 1;
//         while(right < length){
//             if(arr[left] != 0){
//                 left++;
//                 right++;
//             }
//             else if(arr[right] == 0){
//                 right++;
//             }
//             else{
//                 int temp = arr[left];
//                 arr[left] = arr[right];
//                 arr[right] = temp;
//                 left++;
//                 right++;
//             }
//         }
//         for(int i=0;i<length;i++){
//             System.out.print(arr[i]);
//         }
//         sc.close();
//     }
// }




// Left Rotate an Array by 1 Position
// import java.util.Scanner;
// public class ary{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print(("Enter the length of an array : "));
//         int length=sc.nextInt();
//         int[] arr=new int[length];
//         for(int i=0;i<length;i++){
//             System.out.print("Enter element : ");
//             arr[i]=sc.nextInt();
//         }
//         int temp=arr[0];
//         for(int i=0;i<length-1;i++){
//             arr[i]=arr[i+1];
//         }
//         arr[length-1]=temp;
//         for(int i=0;i<length;i++){
//             System.out.println(arr[i]);
//         }
//         sc.close();
//     }
// }






// Right Rotate an Array by 1 Position
import java.util.Scanner;
public class ary{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of an array : ");
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter element : ");
            arr[i]=sc.nextInt();
        }
        int temp=arr[length-1];
        for(int i=length-1;i>0;i--){
            arr[i]=arr[i-1];
        }
        arr[0]=temp;
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
    }
}