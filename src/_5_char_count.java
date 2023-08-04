import java.util.Scanner;

public class _5_char_count {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        char[] ch = a.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++) {

            if (ch[i] == 32) {
                System.out.println(count);
                count=0;
            }
            else
                count++;
        }

    }
}
