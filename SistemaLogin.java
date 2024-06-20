import javax.swing.JOptionPane;

//Sistema de Login
public class SistemaLogin {
    private static final String LOGIN_CORRETO = "java8";
    private static final String SENHA_CORRETA = "java8";
    private static final int MAX_TENTATIVAS = 3;

    public static void main(String[] args) {
        boolean acessoOK = false;

        //Solicita login e senha, até 3 tentativas
        for (int i = 1; i <= MAX_TENTATIVAS; i++) {
            String login = JOptionPane.showInputDialog("Digite o login:");
            String senha = JOptionPane.showInputDialog("Digite a senha:");

            //Verifica se login e senha estão corretos
            if (LOGIN_CORRETO.equals(login) && SENHA_CORRETA.equals(senha)) {
                acessoOK = true;
                break;
            } else {
                JOptionPane.showMessageDialog(null, String.format("Login ou senha incorretos. Tentativa %d de %d.", i, MAX_TENTATIVAS));
            }
        }

        //Exibe resultado
        if (acessoOK) {
            JOptionPane.showMessageDialog(null, "Acesso concedido. Bem-vindo ao sistema!");
        } else {
            JOptionPane.showMessageDialog(null, "Número máximo de tentativas atingido. Acesso negado.");
        }
    }
}