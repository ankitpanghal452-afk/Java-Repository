// import java.util.Scanner;
// public class array_freq {

//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the length of an array : ");
//         int length=sc.nextInt();
//         int arr[]=new int[length];
//         for(int i=0;i<length;i++){
//             System.out.println("Enter the "+ i + "element of an array :");
//             arr[i]=sc.nextInt();
//         }
//         boolean[] visited = new boolean[length];
//         for(int i=0;i<length;i++){
//             if(visited[i]){
//                 continue;
//             }
//             int count = 1;
//             for(int j=i+1;j<length;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                     visited[j]=true;
//                 }
//             }
//         System.out.println(arr[i]+ "->" +count);
//         }
//     }
// }






// Find the First Repeating Element
// import java.util.Scanner;
// public class array_freq{
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the length of an array : ");
//         int length=sc.nextInt();
//         int arr[]=new int[length];
//         for(int i=0;i<length;i++){
//             System.out.print("enter the "+i +" element of an array : ");
//             arr[i]=sc.nextInt();
//         }
//         boolean found = false;
//         for(int i = 0; i < length; i++){
//             for(int j = i + 1; j < length; j++){
//                 if(arr[i] == arr[j]){
//                     System.out.println("First repeating element = " + arr[i]);
//                     found = true;
//                     break;
//                 }
//             }
//             if(found){
//                 break;
//             }
//         }
//         if(!found){
//             System.out.println("No repeating element");
//         }
//         sc.close();
//     }
// }





// Find the First Non-Repeating Element
import java.util.Scanner;
public class array_freq{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter th length of an array : ");
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter element :");
            arr[i]=sc.nextInt();
        }
        boolean found = false;
        for(int i = 0; i < length; i++){
            int count = 0;
            for(int j = 0; j < length; j++){
                if(arr[i] == arr[j]){
                    count++;
                }
            }
            if(count == 1){
                System.out.println("First non repeating element is : " + arr[i]);
                found = true;
                break;
            }
        }
        if(!found){
            System.out.println("No element is non repeating");
        }
    }           
}