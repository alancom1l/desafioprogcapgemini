package teste02;

import java.util.Scanner;

public class Teste02 {

    public static int main(String args) {
                
        //Scanner ler = new Scanner(System.in);
        String senha = args;
        Integer x = 0;
        
        final String requisitos = "^(?=^.{6,}$)(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])(?=.*[^A-Za-z0-9]).*$";
        final String cEspeciais = "^(?=.*[!@#$%^&*()-+]).*$";
        final String numeros = "^(?=.*[0-9]).*$";
        final String lCase = "^(?=.*[a-z]).*$";
        final String uCase = "^(?=.*[A-Z]).*$";
       
        if (senha.matches(requisitos)) {
            System.out.println("0");
        }
        else if (senha.length() >= 6) {
            x = verifica(senha, cEspeciais, numeros, lCase, uCase);
            System.out.println(x);
        } else if (senha.length() >= 1 && senha.length() < 6) {
            x = verifica(senha, cEspeciais, numeros, lCase, uCase);
            if (senha.length() < 3) {
                System.out.println(6 - senha.length());
            } else {
                while (x + senha.length() < 6 ) {
                    x++;
                }
                System.out.println(x);
            }
        } else {
            System.out.println(Math.abs(senha.length() - 6));
        }
        return x;
    }
   
    public static int verifica (String senha, final String cEspeciais, final String numeros, final String lCase, final String uCase) {
        int x = 0;
        if (!senha.matches(cEspeciais)) {
            x++;
        }
        if (!senha.matches(numeros)) {
            x++;
        }
        if (!senha.matches(lCase)) {
            x++;
        }
        if (!senha.matches(uCase)) {
            x++;
        }
        return x;
    }
}