import java.util.*;

public class Array{
    int n;
    int arr[] = new int[n];
    Array(int n){
        this.n = n;
        arr = new int[n];
    }
    public void fillArray(){
        Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter Elelemts of array");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        sc.close();
    }
    public  void displayMax(){
        int temp;
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }

            }
        }
        // Arrays.sort(arr);
        System.out.println("\nMax1:" + arr[n-1] + ",MAX2: "+ arr[n-2]);
    }
    public static void main(String args[]){
        Array a1 = new Array(5);
        a1.fillArray();
        a1.displayMax();

    }
}