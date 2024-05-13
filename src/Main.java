import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        CalculadoraImc calculadora = new CalculadoraImc();
        calculadora.setContentPane(calculadora.getMainPanel());
        calculadora.setBounds(300,300,600,200);
        calculadora.setResizable(false);
        calculadora.setVisible(true);
        calculadora.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
