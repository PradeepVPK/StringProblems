import java.util.Scanner;

public class _4_alphanumeric {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int count = 0,sum=0;
        char[] ch = a.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            if (ch[i]>=48 &&  ch[i]<=57)
                sum+=ch[i]-48;

        }
        System.out.println("Total :"+sum);
    }
}
