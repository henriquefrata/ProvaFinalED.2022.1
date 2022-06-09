import javax.swing.JOptionPane;


public class Util {

    static ArvoreBinaria arvore = new ArvoreBinaria();
    
    public static void cadastrarProduto(){
        int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo do produto: "));
        String nome = JOptionPane.showInputDialog(null, "Nome do produto: ");
        double preco = Double.parseDouble(JOptionPane.showInputDialog(null, "Preço do produto: "));
        int estoque = Integer.parseInt(JOptionPane.showInputDialog(null, "Quantidade em estoque: "));
        
        Produto produto = new Produto(id, nome, preco, estoque);
        arvore.inserir(produto);

    }

    public static void PesquisarProduto(){

            int id = Integer.parseInt(JOptionPane.showInputDialog(null, "Codigo do produto: "));
            arvore.pesquisar(id);
        }
        
        
     public static void listarProdutos(){
            if(arvore.getRaiz() == null){
                JOptionPane.showMessageDialog(null, "Nenhum produto cadastrado");
            } else {
                arvore.emOrdem();
            } 
        }


}


