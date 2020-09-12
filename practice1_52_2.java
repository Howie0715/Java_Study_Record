//閏年判斷
package practice.structure_book;
import java.util.Scanner;
public class practice1_52_2 {
    public static void main(String[] args) {
      Scanner year = new Scanner(System.in);
      System.out.println("請輸入年分");
      int yyyy= year.nextInt();
      if(yyyy%4==0||yyyy%4==0){
            System.out.println(yyyy+"為閏年");
      }else{
            System.out.println(yyyy+"為平年");
      }
      year.close();
    }
}