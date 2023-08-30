import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int A = scan.nextInt();
        int B = scan.nextInt();
        int C = scan.nextInt();
        
        int print;

        if(A == B){
            if(B == C) {
                print = 10000 + A * 1000;
            }else print = 1000 + A * 100;
        }else if(B == C || A == C) {
            print = 1000 + C * 100;
        }else {
            print = Math.max(Math.max(A,B),C) * 100;
        }
        System.out.println(print);
    }
}