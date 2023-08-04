import java.util.Scanner;

public class _3_count_chars {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.nextLine();
        int count = 0;
        char[] ch = a.toCharArray();
        for (int i = 0; i < ch.length; i++){
            if (ch[i] >= 65 && ch[i] <= 90 || ch[i] >= 97 && ch[i] <= 122 || ch[i] >= 48 && ch[i] <= 57 && ch[i] != 32 && ch[i] != ',' && ch[i] != '.')
                count++;
        }
        System.out.println("Characters count :"+count);

    }
}
