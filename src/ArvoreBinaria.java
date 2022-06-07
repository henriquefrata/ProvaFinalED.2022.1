import javax.swing.JOptionPane;

public class ArvoreBinaria {
    private No raiz;


    // método para inserir um elemento na árvore de binária de busca

    public void inserir(Produto produto) {
        if (raiz == null) {
            raiz = new No(produto);

        } else {
            raiz.inserirNo(produto);
        }
    }

    // método para percorrer a árvore em-ordem
    public void emOrdem() {
        emOrdemRecursivo(raiz); 
    }
    //método auxiliar recursivo para o percurso em-ordem
    private void emOrdemRecursivo(No raiz) {
		if(raiz == null) {
			return;
		}
		emOrdemRecursivo(raiz.esq);
		JOptionPane.showMessageDialog(null, raiz.dado.toString() + " ");
		emOrdemRecursivo(raiz.dir);
	}

}
