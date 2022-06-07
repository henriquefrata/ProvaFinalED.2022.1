import static src.Util.VenderProduto;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {

        String input;
        String menu = menu();
        boolean exit = false;

        while (!exit) {
            input = JOptionPane.showInputDialog(menu());
            try {
                switch(input) {
					case "1":
						Util.cadastrarProduto();
						break;
					case "2":
						Util.PesquisarProduto();
						break;
					case "3":
						Util.listarProdutos();
						break;
                    case "4":
                        RemoverProduto();
                	case "5":
						exit = true;
						break;
					default:
                    JOptionPane.showMessageDialog(null,"Comando inválido! \nPor favor digite um numero entre 1 e 5");
                    throw new UnsupportedOperationException();
                }
            } catch (UnsupportedOperationException e) {
                e.printStackTrace();
            }
        }
        // inserir aqui mensagem de exibição da altura da arvore
        JOptionPane.showMessageDialog(null,"Aplicação finalizada!");
    }

    public static String menu(){

        String aux = "Mercearia EXPO-GOIABA";
               aux += "\n1. Cadastrar novo produto";
               aux += "\n2. Pesquisar produto por código";
               aux += "\n3. Listar todos os produtos";
               aux += "\n4. Remover produto por código";
               aux += "\n5. Encerrar aplicação";
             
        return aux;
    }
}