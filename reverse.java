// import java.util.Scanner;

// public class reverse {

//     public static void main(String[] args) {

//         Scanner sc = new Scanner(System.in);

//         System.out.print("Enter length of an array : ");
//         int length = sc.nextInt();

//         int[] arr = new int[length];

//         for (int i = 0; i < length; i++) {
//             System.out.print("Enter element : ");
//             arr[i] = sc.nextInt();
//         }

//         System.out.print("Enter the number of element for which you want to rotate an array : ");
//         int k = sc.nextInt();

//         // In case k is greater than length
//         k = k % length;

//         // 1. Reverse whole array
//         int left = 0;
//         int right = length - 1;

//         while (left < right) {
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;

//             left++;
//             right--;
//         }

//         // 2. Reverse first k elements
//         left = 0;
//         right = k - 1;

//         while (left < right) {
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;

//             left++;
//             right--;
//         }

//         // 3. Reverse remaining elements
//         left = k;
//         right = length - 1;

//         while (left < right) {
//             int temp = arr[left];
//             arr[left] = arr[right];
//             arr[right] = temp;

//             left++;
//             right--;
//         }

//         // Print array
//         for (int i = 0; i < length; i++) {
//             System.out.println(arr[i]);
//         }
//     }
// }







// Move All Negative Numbers to One Side
import java.util.Scanner;
public class reverse{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of an array : ");
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter element : ");
            arr[i]=sc.nextInt();
        }
        int left=0;
        int right=length-1;
        while(left<right){
            if(arr[left]>=0 && arr[right]<0){
                int temp=arr[left];
                arr[left]=arr[right];
                arr[right]=temp;
                left++;
                right--;
            }
            else if(arr[left]<0){
                left++;
            }
            else if(arr[left]>=0 && arr[right]>=0){
                right--;
            }
        }
        for(int i=0;i<length;i++){
            System.out.println(arr[i]);
        }
        sc.close();
    }
}