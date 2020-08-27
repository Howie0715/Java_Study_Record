//3_4_鍵盤輸入資料
package a3_;
import java.util.Scanner;//導入需要的套件
public class a3_4_Scanner {
    public static void main(String[] args) {
        Scanner q1= new Scanner(System.in);//宣告物件
        int i;
        double d;
        String s;
        String str;
        char ch;
        System.out.println("名字+姓");
        s=q1.nextLine();//輸入字串不因空白鍵而中斷
        System.out.println("你幾歲?");
        i=q1.nextInt();//輸入值存放 next+資料型態
        System.out.println("你的體重(KG)?");
        d=q1.nextDouble();//輸入值存放
        System.out.println("你的名言");
        str=q1.next();//輸入字串
        ch=str.charAt(0);//取出字串中第(n)個字元  charAt()
        System.out.println("你"+i+"歲"+  "體重"+d+"KG");
        System.out.println("你的姓名:"+s);
        System.out.println("你的名言"+ch);
        q1.close();
        
       

    }
    
}