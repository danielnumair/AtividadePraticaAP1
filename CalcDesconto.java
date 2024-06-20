import java.util.Scanner;

//Calculadora de Desconto
public class CalcDesconto {
    public static void main(String[] args) {
        double vlrProduto, vlrDesc, percDesc, precoFinal;

        //Lê a partir da linha de commando
        Scanner scanner = new Scanner(System.in);

        //Recebe o valor do produto
        System.out.print("Digite o valor do produto: ");
        vlrProduto =  scanner.nextDouble();

        //Recebe a porcentagem de desconto
        System.out.print("Digite a porcentagem de desconto: ");
        percDesc = scanner.nextDouble();

        //Calcula o valor de desconto
        vlrDesc =  vlrProduto * (percDesc /100);

        //Calcula o preço final
        precoFinal = vlrProduto - vlrDesc;

        //Exibe valor do deconto e o preço final
        System.out.printf("Valor do desconto: R$ %.2f%n", vlrDesc);
        System.out.printf("Preço final: R$ %.2f%n", precoFinal);
    }
}