package Array;

import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Arrays;

public class ProcurarPrimeiraOcorrencia {
 public static void main(String[] args) {
     
	 int[] array = new int[20];
     Random random = new Random();

     for (int i = 0; i < array.length; i++) {
         array[i] = random.nextInt(50);
     }

     JOptionPane.showMessageDialog(null, "Array gerado: " + Arrays.toString(array));

     int valorProcurado = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor a ser procurado:"));

     int posicaoEncontrada = -1;

     for (int i = 0; i < array.length; i++) {
         if (array[i] == valorProcurado) {
             posicaoEncontrada = i;
             break;
         }
     }

     if (posicaoEncontrada != -1) {
         JOptionPane.showMessageDialog(null, "Valor " + valorProcurado + " encontrado na posição: " + posicaoEncontrada);
     } else {
         JOptionPane.showMessageDialog(null, "Valor " + valorProcurado + " não encontrado no array.");
     }
 }
}