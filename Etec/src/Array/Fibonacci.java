package Array;

import javax.swing.*;

public class Fibonacci {
    public static void main(String[] args) {
        int num = Integer.parseInt(JOptionPane.showInputDialog(
                "digite um numero para o tamanho da sequência"));

        int[] fibonacci = new int[num];
        fibonacci[0] = 0;
        fibonacci[1] = 1;
        String str = "";

        for (int i = 2;i < fibonacci.length;i++){
            fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
        }

        for (int i : fibonacci) {
            str += i + " ";
        }

        JOptionPane.showMessageDialog(null,"a sequência e de: \n" + str);
    }
}
