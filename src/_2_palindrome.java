import java.util.Scanner;

public class _2_palindrome {
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
        String reverse=new String(ch);
        if (reverse.equalsIgnoreCase(sentence)){
            System.out.println("Palindrome String :"+sentence);
        }
        else
            System.out.println("Not Palindrome String  ");

    }
}
