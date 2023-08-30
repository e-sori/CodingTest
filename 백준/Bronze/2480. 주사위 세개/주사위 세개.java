import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        // 배열 : 길이가 정해져 있을 때
        // List & ArrayList : 길이를 모를 때
        int[] arrNum = new int[] {num1,num2,num3};
        List<Integer> selectNum = new ArrayList<Integer>();
        int maxNum = arrNum[0];

        for(int i = 0; i < arrNum.length; i += 1){
            for(int j = i+1; j < arrNum.length; j += 1){
                if(arrNum[i] == arrNum[j]) selectNum.add(arrNum[i]);
                else if(maxNum < arrNum[j]) {
                    maxNum = arrNum[j];
                }
            }
        }

        if (selectNum.size() == 3) System.out.println(10000 + selectNum.get(0) * 1000);
        else if (selectNum.size() == 1) System.out.println(1000 + selectNum.get(0) * 100);
        else if (selectNum.size() == 0) System.out.println(maxNum * 100);
    }
}