//https://zerojudge.tw/ShowProblem?problemid=d046
//d046: 文文採西瓜
//解題編號6281909
package practice.online_practice;
import java.util.Scanner;
public class d046 {
    public static void main(String[] args) {
        Scanner ask = new Scanner(System.in);
        int count=ask.nextInt();
        int total=0;
        for(int i=count;i>0;i--){
            int melon=ask.nextInt();
            if(melon<=10){
                total=total+1;
            }else{
                continue;
            }
        }
        System.out.println(total);
        ask.close();       
    }
}
