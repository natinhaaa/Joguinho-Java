//Natália e Mirella

import javax.swing.*;
import java.lang.Math;

public class projeto {
    public static void main(String[] args) {

        int max = 100;
        int min = 0;
        int nums = max - min;
        int aleatório = (int) (Math.random() * nums) + min;
        //System.out.println(aleatório);

        JOptionPane.showMessageDialog(null, "Esse é um jogo de adivinhação.");
        JOptionPane.showMessageDialog(null, "Você tem 5 vezes para adivinhar, se não acertar o jogo reinicia.");
          
        int x = 5;
        while (x > 0) {
            int adivinha = Integer.parseInt(JOptionPane.showInputDialog("Adivinhe um número entre 0 e 100: "));

            if (adivinha == aleatório) {
                JOptionPane.showMessageDialog(null, "Você acertou!");
                y = 1;
            }

            if (100 < adivinha) {
                JOptionPane.showMessageDialog(null,"O número tem que ser menor que 100");
            }

            if (adivinha < 0) {
                JOptionPane.showMessageDialog(null,"O número tem que ser maior que 0.");
            }

            else {
                x--;
                JOptionPane.showMessageDialog(null, "Você errou, mais " + x + " chances");

                if (aleatório < adivinha) {
                    JOptionPane.showMessageDialog(null, "O número aleatório é menor que o valor que você chutou.");
                }

                else {
                    JOptionPane.showMessageDialog(null, "O número aleatório é maior que o valor que você chutou.");
                }
                if (x == 0) {
                    JOptionPane.showMessageDialog(null, "O número aleatório era: " + aleatório);
                }
            }
        }  
    }   
}