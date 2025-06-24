package Array;

import javax.swing.JOptionPane;

public class Anagrama{ 

public static void main(String[] args) {
    String palava1 = JOptionPane.showInputDialog("digite a primeira palavra");
    String palava2 = JOptionPane.showInputDialog("digite a segunda palavra");

    if(palava1.length() != palava2.length()){
        JOptionPane.showMessageDialog(
                null,palava1+" nao e um anagrama de "+palava2);
        return;
    }

    boolean anagrama = true;
    String[] arrpalavra1 = palava1.toLowerCase().split("");
    String[] arrpalavra2 = palava2.toLowerCase().split("");

    ordenar(arrpalavra1);
    ordenar(arrpalavra2);

    for (int i = 0; i < arrpalavra1.length; i++) {
        if(!(arrpalavra1[i].equals(arrpalavra2[i]))){
            anagrama = false;
            break;
        }
    }

    if (anagrama){
        JOptionPane.showMessageDialog(
                null,palava1+" e um anagrama de " + palava2);
    }else{
        JOptionPane.showMessageDialog(
                null,palava1+" nao e um anagrama de " + palava2);
    }

}

public static void ordenar(String[] arr){
    String mem;
    for (int i = 0; i < arr.length; i++) {
        for (int j = i+1; j < arr.length; j++) {
            if (arr[i].compareTo(arr[j]) > 0){
                mem = arr[i];
                arr[i] = arr[j];
                arr[j] = mem;
            }
        }
    }

}
}
