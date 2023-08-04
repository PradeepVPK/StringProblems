import java.util.Scanner;

class word{
    static String ones[]={"","one","two","three","four","five","six","seven","eight","nine","ten","eleven","tweleve","thirteen","fourteen","fifteeen","sixteeen","seventeen","eighteen","nineteen"};
    static String twos[]={" "," ","twenty","thirty","fourty","fifty","sixty","sevventy","eighty","ninety"};
    static void digit(int a,String words){
        if (a<20) {
            System.out.print(ones[a]+"  ");
        }
        else
            System.out.print(" and "+ twos[a / 10] + ones[a % 10]);
        if(a!=0){
            System.out.print(words+" ");
        }
    }
}
public class _7_num_words {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        word.digit((a/10000000),"crores");
        word.digit((a/100000)%100,"lakh");
        word.digit((a/1000)%100,"thosand");
        word.digit((a/100)%10,"hundred");
        word.digit((a%100), " ");
    }
}
