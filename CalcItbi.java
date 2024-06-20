import javax.swing.JOptionPane;

//Calculadora de ITBI
public class CalcItbi {
    public static void main(String[] args) {
        // Recebe o valor de transação do imóvel
        String valorTransacao = JOptionPane.showInputDialog("Digite o valor de transação do imóvel:");
        double vlrTransacao = Double.parseDouble(valorTransacao);

        // Recebe o valor venal do imóvel
        String valorVenal = JOptionPane.showInputDialog("Digite o valor venal do imóvel:");
        double vlrVenal = Double.parseDouble(valorVenal);

        // Recebe a porcentagem do ITBI
        String porcentagemITBI = JOptionPane.showInputDialog("Digite a porcentagem do imposto ITBI:");
        double percITBI = Double.parseDouble(porcentagemITBI);

        // Determina o maior valor entre o valor de transação e o valor venal
        double vlrBase = Math.max(vlrTransacao, vlrVenal);

        // Calcula o valor do ITBI
        double valorImposto = vlrBase * (percITBI / 100);

        // Exibe valor do ITBI
        JOptionPane.showMessageDialog(null, String.format("Valor do imposto ITBI: R$ %.2f", valorImposto));
    }
}