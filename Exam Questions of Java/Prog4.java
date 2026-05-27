import java.util.Scanner;

public class Prog4 {
    public static void main(String[] args) {
        

        Scanner sc = new Scanner(System.in);
        int arr[] = new int[5];
        for (int i = 0;i<5 ;i++){
            System.err.print("a["+i+"]");
            arr[i] = sc.nextInt();
        }

        for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }

        for (int i=0;i<5;i++){
            for(int j=0;j<5-1;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        System.out.println();
         for(int i=0;i<5;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Winner,"+arr[4]);
        System.out.println("RunnerUp,"+arr[3]);

    }
    
}
