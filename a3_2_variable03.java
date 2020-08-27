//3_2_基礎資料型態+資料型態轉換
package a3_;
public class a3_2_variable03 {
    public static void main(String[] args) {
        char a =71;             //使用Unicode(編碼)表示
        char b ='G';            //直接指定G
        char c ='\u0047';       //使用Unicode(十六進位制)表示
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    /*  反斜線
        \f  換頁(Form Feed)
        \b  倒退一格(Backspace)
        \n  換行(New line)
        \r  歸位(Carriage return)
        \t  跳格(Tab)
        \u0000 16進位Unicode
        \ddd    8進位Unicode
        \\  反斜線
        \'  強制顯示'
        \"  強制顯示"
    */
    /*--------------------------------------------------------*/
        double num1=-5.6e5; //=560000
        double num2=-5.6E5; //=560000

        //float num4=3.2e65;  //超過float可以表示的範圍
        //flaot num5=6.3;     //浮點數預設為double，必須加上f
        double num6=6.3;    //正確
        System.out.println(num1+","+num2+","+num6);
    /*  乘冪表示
        8.9e5=8.9E5=890000
        ex/Ex=10的x次方
    /*----------------------------------------------------*/
        
        int d=45;
        float f=22f;
        System.out.println(d+f);
    /*  資料型態的轉換
        轉換型態只影響該行，不影響初始型態
        (1)自動轉換:
        1.轉換資料前後型態相容
        2.轉換後型態可表示範圍較轉換前大
        Ex.short=>int
        *當兩個數值相加，會統一轉換成範圍大的型態進行運算
         float較int大，故結果以float表示
    /*----------------------------------------------------*/
        int g=25;
        int h=9;
        System.out.println("g="+g+",h="+h);
        System.out.println("g/h="+g/h);
        System.out.println("轉型(float)g/h="+(float)g/h);
    /*  (2)強制型態轉換:
        在變數前加入括號，並寫上(欲轉換轉換型態)變數名稱
        Ex.(double)x;
        
        擴大轉換(augmented conversion)  自動/強制
        縮小轉換(narrowing conversion)  強制
   
    */
    }
    
}