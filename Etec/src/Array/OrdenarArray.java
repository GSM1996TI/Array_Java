package Array;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;

public class OrdenarArray {
 public static void main(String[] args) {
     int[] valores = new int[10];
     Random random = new Random();
 
     for (int i = 0; i < valores.length; i++) {
         valores[i] = random.nextInt(100); // Generate random numbers between 0 and 99
     }

     JOptionPane.showMessageDialog(null, "Array original: " + Arrays.toString(valores));
 
     Arrays.sort(valores);

     JOptionPane.showMessageDialog(null, "Array ordenado (menor para maior): " + Arrays.toString(valores));
 }
}