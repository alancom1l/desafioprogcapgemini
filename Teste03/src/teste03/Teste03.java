package teste03;

import java.util.Arrays;
import java.util.Scanner;

public class Teste03 {
    
    public static int main(String args) {
        
        //Scanner ler = new Scanner(System.in);
        
        String b = args;
        int i, j, k=0, x=0;
        
        for (k = 0; k < b.length(); k++) {
            for (i = 0; i < b.length(); i++) {
                for (j = b.length() - 1; j > (i+k); j--) {
                    x = anagrama(b.substring(i, i+(k+1)), b.substring(j-k, j+1), x);
                }
            } 
        }
        System.out.println(x);
        return x;
    }
    
    public static int anagrama (String subB, String subC, int x) {
        
        char [] b = subB.toCharArray();
        char [] c = subC.toCharArray();
        
        Arrays.sort(b);
        Arrays.sort(c);
        
        if (Arrays.equals(b, c)) {
            x++;
        }
        return x;
    }
}