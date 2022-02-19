package teste01;

import java.util.Scanner;
import java.util.Arrays;

public class Teste01 {

    public static String main(int args) {
        
        //Scanner ler = new Scanner(System.in);
        
        int n = args;
        char[] str = new char[n];
        String istr;

        Arrays.fill(str, ' '); 

        for (int i = n; i > 0; i--) {
            str[i-1] = '*';       
            System.out.println(str);
        }
        istr = String.valueOf(str);
        return istr;
    }
}