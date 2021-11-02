package projetoLavaJato;

import java.util.ArrayList;

public class LavaJato {
    // criando um array para lista de carros
    private ArrayList<Carro> lsCarro;

    // craindo um metodo construtor para inicializa a lista de carro
    public LavaJato() {
        lsCarro = new ArrayList<>();
    }

    // ações que um lista de lavaJato pode fazer

    // inclcuir carro novo
    public void incluir(Carro r) {
        lsCarro.add(r);         // adiciona ao parametro " r " na lista de carro
    }

    // metodo altera
    public void altera(int id, Carro c) {
        lsCarro.set(id, c);     // alterando pelo id da lista carro , e adicionando um novo carro
    }

    // metodo excluir
    public void excluir(int id) {
        lsCarro.remove(id);     // removendo pelo id da lista carro 
    }

    // metodo ver lista de carro
    public String verLista() {

        String texto = "";
        int i = 0;

        for (Carro carro : lsCarro) {
            texto += " ["+i+"]marca: " + carro.getMarca() + "\n" + " modelo: " + carro.getModelo() + "\n" + " Cor: "
                    + carro.getCor() + "\n" + " placa: " + carro.getPlaca() +"\n";
            i++;
        }

        return texto;           // retornando a variavel

    }

}
