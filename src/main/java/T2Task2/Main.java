package T2Task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int h, m, s;

        System.out.print("Enter hours, minutes, and seconds: ");
        h = input.nextInt();
        m = input.nextInt();
        s = input.nextInt();

        s = s + 1;

        if (s == 60) {
            s = 0;
            m = m + 1;
        }

        if (m == 60) {
            m = 0;
            h = h + 1;
        }

        if (h == 24) {
            h = 0;
        }

        System.out.println("Time after one second: "
                + h + ":" + m + ":" + s);

        input.close();
    }
}