//輸入兩個數值，以三元運算子比大小
package practice.structure_book;
import java.util.Scanner;
public class practice1_52_1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int num1=num.nextInt();
        int num2=num.nextInt();
        if(num1>num2){
            System.out.println(num1+"大於"+num2);
        }else if (num2>num1){
            System.out.println(num1+"小於"+num2);
        }else{
            System.out.println(num1+"等於"+num2);
        }
        num.close();
    }
    
}