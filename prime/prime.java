import java.util.*;
import java.lang.Math;
class prime{
    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int num = sc.nextInt();
    sc.close();
    Boolean isPrime = true;
    if(num == 1){
        System.out.println("\n1 is neither Prime nor composite");
    }else{
        for(int i=2;i<=Math.sqrt(num);i++){
            if(num % i == 0){
                isPrime = false;
                break;
            }
        }
        if(!isPrime)
            System.out.println("\n" + num + " is not prime");
        else
            System.out.println("\n" + num + " is Prime");
    }
    }
}