package Array;

	import javax.swing.JOptionPane;
	import java.util.Random;
	import java.util.Arrays;

	public class Impares {
	    public static void main(String[] args) {
	         
	        int[] numerosImpares = new int[10];
	        Random random = new Random();
	        int count = 0;
 
	        while (count < 10) {
	            int num = random.nextInt(100); 
	            if (num % 2 != 0) { 
	                numerosImpares[count] = num;
	                count++;
	            }
	        }

	        JOptionPane.showMessageDialog(null, "Array de números ímpares: " + Arrays.toString(numerosImpares));
	    }
	}

