package Array;

	import javax.swing.JOptionPane;

	public class fibonacci {
	    public static void main(String[] args) {
	        int indice = Integer.parseInt(JOptionPane.showInputDialog("Informe o índice do número de Fibonacci:"));

	        if (indice < 0) {
	            JOptionPane.showMessageDialog(null, "O índice não pode ser negativo.");
	            return;
	        }

	        double[] fib = new double[indice + 1];

	        if (indice >= 0) {
	            fib[0] = 0;  
	        }
	        if (indice >= 1) {
	            fib[1] = 1;  
	        }

	        for (int i = 2; i <= indice; i++) {
	            fib[i] = fib[i - 1] + fib[i - 2];  
	        }

	        JOptionPane.showMessageDialog(null, "O número de Fibonacci no índice " + indice + " é: " + fib[indice]);
	    }
	}

