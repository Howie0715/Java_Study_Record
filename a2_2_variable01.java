//2_2_基礎變數
package a2_;
public class a2_2_variable01 {
    public static void main(String[] args) {
        int a;      //宣告整數a
                    //當變數宣告，記憶體便配置空間
        a=0;
        int b,c,d;  //連續宣告整數b,c,d
        b=0;
        c=0;
        d=0;
        int x=0;    //等於 int x; x=0;
        /* 1.變數名稱有大小寫之分 2.名稱中不可有空白鍵
           3.第一個字元不可為數字 ex. int 1a;      */
           
        // liternal=字面值
        //建議有需要變數時在建立，避免找不到用在哪
        System.out.println(a+b+c+d+x);
    }
}