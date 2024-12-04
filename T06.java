// 12S24043 - DESNITA PARDOSI
// 12S24018 - KELVIN YOHANES PUTRA


import java.util.*;
import java.lang.Math;

public class T06 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        String[] nama = new String[4];
        int a;

        a = 0;
        initialized(nama, a);
        var_input(nama);
        output(nama);
    }
    
    public static void initialized(String[] nama, int a) {
        String initialized;

        for (a = 0; a <= 3; a++) {
            nama[a] = "";
        }
    }
    
    public static void var_input(String[] nama) {
        String var_input;
        int a;

        for (a = 0; a <= 3; a++) {
            nama[a] = input.nextLine();
            if (nama[a].equals("---")) {
                a = 9;
            }
        }
    }
    
    public static void output(String[] nama) {
        String output;
        int a;

        for (a = 0; a <= 3; a++) {
            if (nama[a].equals("---")) {
                a = 72;
            } else {
                System.out.println(nama[a]);
            }
        }
    }
}
