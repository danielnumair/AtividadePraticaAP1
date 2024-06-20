import javax.swing.JOptionPane;

//Calculadora de Aposentadoria
public class CalcApos {
    public static void main(String[] args) {
        // Recebe a idade da pessoa
        String idadeStr = JOptionPane.showInputDialog("Digite a sua idade:");
        int idade = Integer.parseInt(idadeStr);

        // Recebe o sexo da pessoa
        String sexo = JOptionPane.showInputDialog("Digite o seu sexo (M/F):");

        // Recebe os anos de contribuição
        String anosContribStr = JOptionPane.showInputDialog("Digite os anos de contribuição:");
        int anosContrib = Integer.parseInt(anosContribStr);

        // Verifica se a pessoa pode se aposentar ou quantos anos faltam
        String resultado = verificaApos(idade, sexo, anosContrib);

        // Exibe o resultado
        JOptionPane.showMessageDialog(null, resultado);
    }


    //Método que verifica se a pessoa pode se aposentar
    public static String verificaApos(int idade, String sexo, int anosContribuicao) {
        int idadeMinima, contribuicaoMinima;

        if (sexo.equalsIgnoreCase("M")) {
            idadeMinima = 65;
            contribuicaoMinima = 35;
        } else if (sexo.equalsIgnoreCase("F")) {
            idadeMinima = 60;
            contribuicaoMinima = 30;
        } else {
            return "Sexo inválido! Por favor, digite M para masculino ou F para feminino.";
        }

        boolean podeAposentarPorIdade = idade >= idadeMinima;
        boolean podeAposentarPorContribuicao = anosContribuicao >= contribuicaoMinima;

        if (podeAposentarPorIdade || podeAposentarPorContribuicao) {
            return "Você já pode se aposentar!";
        } else {
            int anosParaAposentarPorIdade = idadeMinima - idade;
            int anosParaAposentarPorContribuicao = contribuicaoMinima - anosContribuicao;

            if (anosParaAposentarPorIdade > 0 && anosParaAposentarPorContribuicao > 0) {
                return String.format("Faltam %d anos para você se aposentar por idade e %d anos para se aposentar por contribuição.",
                        anosParaAposentarPorIdade, anosParaAposentarPorContribuicao);
            } else if (anosParaAposentarPorIdade > 0) {
                return String.format("Faltam %d anos para você se aposentar por idade.", anosParaAposentarPorIdade);
            } else {
                return String.format("Faltam %d anos para você se aposentar por contribuição.", anosParaAposentarPorContribuicao);
            }
        }
    }
}