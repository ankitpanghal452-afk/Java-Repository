import java.util.Scanner;
public class loops_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        for(int i = 0; i < 5; i++) {
            System.out.print("Enter element " + i + ": ");
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<5;i++){
            System.out.println("Array elements are : " + arr[i]);
        }
        sc.close();
    }
}