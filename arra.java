import java.util.Scanner;
public class arra {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter length of an array : ");
        int length=sc.nextInt();
        int[] arr=new int[length];
        for(int i=0;i<length;i++){
            System.out.print("Enter element : ");
            arr[i]=sc.nextInt();
        }
        int[] arr1 = new int[length];
        int count = 0;
        for(int i=0; i<length; i++){
            boolean found = false;
            for(int j=0; j<count; j++){
                if(arr[i] == arr1[j]){
                    found = true;
                    break;
                }
            }
            if(!found){
                arr1[count] = arr[i];
                count++;
            }
        }
        for(int i=0; i<count; i++){
            int frequency = 0;
            for(int j=0; j<length; j++){

                if(arr1[i] == arr[j]){
                    frequency++;
                }
            }
            System.out.println(arr1[i] + " -> " + frequency);
        }
        sc.close();
    }
}