// import java.util.Scanner;
// public class prctc {
//     public static void main(String[] args){
//         Scanner sc=new Scanner(System.in);
//         System.out.print("Enter the length of an array : ");
//         int length=sc.nextInt();
//         int[] arr=new int[length];
//         for(int i=0;i<length;i++){
//             System.out.print("Enter element : ");
//             arr[i]=sc.nextInt();
//         }
//         for(int i=0;i<length;i++){
//             int count=0;
//             for(int j=0;j<length;j++){
//                 if(arr[i]==arr[j]){
//                     count++;
//                 }
//             }
//             System.out.println(arr[i]+" -> "+count);
//         }
//         sc.close();
//     }
// }






import java.util.Scanner;
public class prctc{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an array : ");
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter element : ");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<length;i++){
            boolean Visited=false;
            for(int j=0;j<i;j++){
                if(arr[i]==arr[j]){
                    Visited=true;
                    break;
                }
            }
            if(Visited){
                continue;
            }
            int count=0;
            for(int k=0;k<length;k++){
                if(arr[i]==arr[k]){
                    count++;
                }
            }
            System.out.println(arr[i]+" -> "+count);
        }
        sc.close();
    }
}