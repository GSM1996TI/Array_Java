package Array;

import javax.swing.JOptionPane;

public class InverterPalavra {
 public static void main(String[] args) {
     String palavraOriginal = JOptionPane.showInputDialog("Digite uma palavra:");
     JOptionPane.showMessageDialog(null, "Palavra digitada: " + palavraOriginal);
 
     char[] caracteres = palavraOriginal.toCharArray();

     String palavraInvertida = "";
     
     for (int i = caracteres.length - 1; i >= 0; i--) {
         palavraInvertida += caracteres[i];
     }

     JOptionPane.showMessageDialog(null, "Palavra invertida: " + palavraInvertida);
 }
}