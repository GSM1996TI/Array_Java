package Array;

import javax.swing.JOptionPane;

public class Palindrome {
    public static void main(String[] args) {
        String palavra = JOptionPane.showInputDialog("Digite uma palavra:");
        palavra = palavra.toLowerCase(); 

        boolean isPalindrome = true;
        int length = palavra.length();

        for (int i = 0; i < length / 2; i++) {
            if (palavra.charAt(i) != palavra.charAt(length - 1 - i)) {
                isPalindrome = false;
                break;
            }
        }

        if (isPalindrome) {
            JOptionPane.showMessageDialog(null, "A palavra \"" + palavra + "\" é um palíndromo. Exemplo: arara, ovo. ");
        } else {
            JOptionPane.showMessageDialog(null, "A palavra \"" + palavra + "\" NÃO é um palíndromo.");
        }
    }
}
