//3_1_變數使用
package a3_;
public class a3_1_variable02 {
    public static void main(String[] args) {
        final int a=0;  //修飾字final，表示變數不再更動 成為常數(constant)
                        //可以避免誤改
    /*  data type | byte | default
    整  long        8       0L
    數  int         4       0
    型  short       2       0
    態  byte        1       0
    ------------------------------------------------
        char        2       '\u0000' (Unicode)
        boolean     1       false
        float       4       0.0F
        double      8       0.0D

        byte越大，可以表示的範圍越廣
        取最大值    java.lang.[data type].MAX_VALUE
        取最小值    java.lang.[data type].MIN_VALUE
    錯誤狀況:integer number too large 表示變數大小放不下該變數
    */     
    int max = java.lang.Integer.MAX_VALUE;    
    System.out.println(max);    //2147483647           
    System.out.println(max+1);  //-2147483648  未做轉型      
    System.out.println(max+1L); //2147483648    int轉long
    System.out.println((long)max+1);//同上      int轉long     
    /*  overflow 溢位
        數字大小超過變數可表現的範圍
        會從最大值便最小值，轉型即可解決
        *強制轉型
        1.在數字後補轉型代碼
        2.在變數前(data type)
    */
    /*  *自動型態轉換(automatic type conversion)
        Java在計算short byte時 會自動轉換成 int型態
    */
    System.out.println(a);
    }
    
}