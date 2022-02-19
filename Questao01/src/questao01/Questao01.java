package questao01;

import java.util.Scanner;
import java.util.Arrays;

public class Questao01 {

    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        int n = ler.nextInt();
        char[] str = new char[n];

        Arrays.fill(str, ' '); 

        for (int i = n; i > 0; i--) {
            str[i-1] = '*';       
            System.out.println(str);
        }
    }
}