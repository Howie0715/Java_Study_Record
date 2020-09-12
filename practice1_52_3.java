//迴圈求101~200偶數累加和
package practice.structure_book;
public class practice1_52_3 {
    public static void main(String[] args) {
    int total=0;
        for (int i=101;i<=200;i++){
            if(i%2==0){
                total+=i;
            }else{
                continue;
            }  
        }
    System.out.println(total);
    }
}