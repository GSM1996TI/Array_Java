package Array;

	import javax.swing.JOptionPane;

public class Media {

	public class media {
	    public static void main(String[] args) {
	        double[] notas = new double[4];  
	        for (int i = 0; i < notas.length; i++) {  
	            notas[i] = Double.parseDouble(JOptionPane.showInputDialog("Informe a " + (i + 1) + "a nota"));
	        }
	        double media = (notas[0] + notas[1] + notas[2] + notas[3]) / 4; 
	        JOptionPane.showMessageDialog(null, "Sua média foi " + media);  
	    }
	}
}
