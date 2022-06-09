import javax.swing.JOptionPane;

public class ArvoreBinaria {

    private No raiz;
    public int altura;
    String dados;

    public No getRaiz() {
        return raiz;
    }

    public void pesquisar(int id){

		if(raiz == null){
            JOptionPane.showMessageDialog(null, "Não há produtos registrados.", "Erro", JOptionPane.ERROR_MESSAGE);
        } else {
			No produto = pesquisarRecursivo(raiz, id);
			if(produto == null){
				JOptionPane.showMessageDialog(null, "O produto inserido é inexistente ou não foi cadastrado");
			} else {
				JOptionPane.showMessageDialog(null, produto.dado.toString());
			}
		}
	}

    public No pesquisarRecursivo(No raiz, int id){
		if(raiz == null) {
			return null;
		} else if(raiz.dado.getId() == id){
			return raiz;
		}

		if(id < raiz.dado.getId()){
			return pesquisarRecursivo(raiz.esq, id);
		} else {
			return pesquisarRecursivo(raiz.dir, id);
		}
		
	}


    // método para inserir um elemento na árvore de binária de busca

    public void inserir(Produto produto) {
        int aux;
        aux = 0;
        if (raiz == null) {
            raiz = new No(produto);

        } else {
            raiz.inserirNo(produto);
        }

        if(aux >= altura ) {
            altura = aux;
        }

    }

    // método para percorrer a árvore em-ordem
    public void emOrdem() {
        this.dados = "";
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

    public static void MensagemAltura(int altura){
		JOptionPane.showMessageDialog(null, "A altura da árvore é de: " + altura);
	}

    

 



}
