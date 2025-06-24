package Array;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;

public class ProcurarTodascOrrencias {
 public static void main(String[] args) {

	 int[] array = new int[100];
     Random random = new Random();

     for (int i = 0; i < array.length; i++) {
         array[i] = random.nextInt(20);
     }
 
     JOptionPane.showMessageDialog(null, "Array gerado: " + Arrays.toString(array));

     int valorProcurado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser procurado:"));

     ArrayList<Integer> indicesEncontrados = new ArrayList<>();
 
     for (int i = 0; i < array.length; i++) {
         if (array[i] == valorProcurado) {
             indicesEncontrados.add(i);
         }
     }

     if (!indicesEncontrados.isEmpty()) {
         JOptionPane.showMessageDialog(null, "Valor " + valorProcurado + " encontrado nos índices: " + indicesEncontrados.toString());
     } else {
         JOptionPane.showMessageDialog(null, "Valor " + valorProcurado + " não encontrado no array.");
     }
 }
}