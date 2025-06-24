package Array;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;

public class TrocarPosicoes {
 public static void main(String[] args) {
     
	 int[] arrayOriginal = new int[16];
     Random random = new Random();

     for (int i = 0; i < arrayOriginal.length; i++) {
         arrayOriginal[i] = random.nextInt(100);
     }
 
     JOptionPane.showMessageDialog(null, "Array Original: " + Arrays.toString(arrayOriginal));

     int[] arrayFinal = Arrays.copyOf(arrayOriginal, arrayOriginal.length);
 
     for (int i = 0; i < 8; i++) {
         int temp = arrayFinal[i];
         arrayFinal[i] = arrayFinal[i + 8];
         arrayFinal[i + 8] = temp;
     }
 
     JOptionPane.showMessageDialog(null, "Array Final (posições trocadas): " + Arrays.toString(arrayFinal));
 }
}