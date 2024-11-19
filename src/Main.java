import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Выберите действие:" + "\n" + "зашифровать(1)/расшифровать(2)");
        String choise = sc.nextLine();
        String str = sc.nextLine();
        char[] shifr = str.toCharArray();
        if (choise.contains("1"))
        {
            for (int i = 0; i < shifr.length; i++) {
                shifr[i] = (char)((int)shifr[i] + 2);
            }
            System.out.println(shifr);
        }

        if (choise.contains("2"))
        {
            for (int i = 0; i < shifr.length; i++) {
                shifr[i] = (char)((int)shifr[i] - 2);
            }
            System.out.println(shifr);
        }

    }
}