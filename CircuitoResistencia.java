import javax.swing.JOptionPane;

//Circuito de Resistências
public class CircuitoResistencia {
    public static void main(String[] args) {
        // Recebe o valor das quatro resistências
        double[] resistencias = new double[4];
        for (int i = 0; i < 4; i++) {
            String resistenciaStr = JOptionPane.showInputDialog("Digite o valor da resistência " + (i + 1) + ":");
            resistencias[i] = Double.parseDouble(resistenciaStr);
        }

        // Calcula a resistência equivalente
        double resistEquivalente = calcularResistEquivalente(resistencias);

        // Encontra a maior e a menor resistência
        double maiorResistencia = encontrarMaiorResist(resistencias);
        double menorResistencia = encontrarMenorResist(resistencias);

        // Exibe os resultados
        String mensagem = String.format("Resistência Equivalente: %.2f ohms\nMaior Resistência: %.2f ohms\nMenor Resistência: %.2f ohms",
                resistEquivalente, maiorResistencia, menorResistencia);
        JOptionPane.showMessageDialog(null, mensagem);
    }

    //Calcula a resistência equivalente de resistências ligadas em série.
    public static double calcularResistEquivalente(double[] resistencias) {
        double soma = 0;
        for (double resistencia : resistencias) {
            soma += resistencia;
        }
        return soma;
    }

    //Encontra a maior resistência em um array de resistências.
    public static double encontrarMaiorResist(double[] resistencias) {
        double maior = resistencias[0];
        for (double resistencia : resistencias) {
            if (resistencia > maior) {
                maior = resistencia;
            }
        }
        return maior;
    }

    //Encontra a menor resistência em um array de resistências.
    public static double encontrarMenorResist(double[] resistencias) {
        double menor = resistencias[0];
        for (double resistencia : resistencias) {
            if (resistencia < menor) {
                menor = resistencia;
            }
        }
        return menor;
    }
}