import java.util.Scanner;
import java.util.Arrays;
public class sum {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the length of an array : ");
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter element : ");
            arr[i]=sc.nextInt();
        }
        int[] pair=new int[2];
        System.out.print("Enter target : ");
        int target=sc.nextInt();
        boolean found=false;
        for(int i=0;i<length;i++){
            for(int j=i+1;j<length;j++){
                if(arr[i]+arr[j]==target){
                    pair=new int[]{arr[i],arr[j]};
                    found=true;
                    break;
                }
            }
            if(found){
                System.out.println(Arrays.toString(pair));
                break;
            }
        }
        if(!found){
            System.out.println("No Match found");
        }
        sc.close();
    }
}
