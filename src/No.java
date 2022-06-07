   public class No {

        Produto dado;
        No esq;
        No dir;
    
        public No (Produto produto) {
            super();
            this.dado = produto;
        }
    
        public void inserirNo(Produto produto) {
            if(produto.getId() > dado.getId()) {
                if(dir == null) {
                    dir = new No(produto); 
                } else {
                    dir.inserirNo(produto);
                }
            } else {
                if(produto.getId() < dado.getId()) {
                    if(esq == null) {
                        esq = new No(produto);
                    } else {
                        esq.inserirNo(produto);
                    }
                }
            }
        }
    
    
    
    }


