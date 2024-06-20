import javax.swing.JOptionPane;

//Gerador de Tabuada
public class GeradorTabuada {
    public static void main(String[] args) {
        // Recebe o número do usuário
        String numeroStr = JOptionPane.showInputDialog("Digite um número para ver a tabuada:");
        int numero = Integer.parseInt(numeroStr);

        // Construe a tabuada
        StringBuilder tabuada = new StringBuilder();
        tabuada.append("Tabuada do ").append(numero).append(":\n");

        for (int i = 1; i <= 10; i++) {
            int resultado = numero * i;
            tabuada.append(numero).append(" x ").append(i).append(" = ").append(resultado).append("\n");
        }

        // Exibe a tabuada
        JOptionPane.showMessageDialog(null, tabuada.toString());
    }
}