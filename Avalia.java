import javax.swing.JOptionPane;

//Sistema de Avaliação
public class Avalia {
    public static void main(String[] args) {
        // Recebe a nota da primeira prova
        String notaProva1 = JOptionPane.showInputDialog("Digite a nota da primeira prova:");
        double ntProva1 = Double.parseDouble(notaProva1);

        // Recebe a nota da segunda prova
        String notaProva2 = JOptionPane.showInputDialog("Digite a nota da segunda prova:");
        double ntProva2 = Double.parseDouble(notaProva2);

        // Recebe a nota do trabalho
        String notaTrabalho = JOptionPane.showInputDialog("Digite a nota do trabalho:");
        double ntTrabalho = Double.parseDouble(notaTrabalho);

        // Calcula a média das notas
        double media = (ntProva1 + ntProva2 + ntTrabalho) / 3;

        // Verifica se o aluno está aprovado ou reprovado
        String resultado;
        if (media >= 6)
            resultado = "Aprovado";
        else resultado = "Reprovado";

        // Exibe a média e o resultado
        JOptionPane.showMessageDialog(null, String.format("Média: %.2f\nResultado: %s", media, resultado));
    }
}