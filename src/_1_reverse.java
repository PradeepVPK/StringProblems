import java.util.Scanner;

public class _1_reverse {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        System.out.println("Enter the sentence :");
        String sentence=in.nextLine();
        char[] ch = sentence.toCharArray();
        for (int i=0;i<ch.length/2;i++){
            char t=ch[i];
            ch[i]=ch[ch.length-1-i];
            ch[ch.length-1-i]=t;

        }
        sentence=new String(ch);
        System.out.println("Reverse String :"+sentence);
    }
}
