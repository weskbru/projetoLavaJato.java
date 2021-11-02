package projetoLavaJato;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {

        JOptionPane.showMessageDialog(null, "Bem vindo(a) ao lava-jato Vamos cadastra seu veiculo");

        // criando nosso objeto lscarro chamando o metodo construtor
        LavaJato lavaJato = new LavaJato();
        Object[] opcoes = { "incluir", "ver lista", "Excluir", "Alterar", "sair" };

        // criação da variavel pois o retorno do jOpane é String
        int escolha = 0;
        int id = 0;

        // do while usado para fazer o laço de comparação
        do {
            escolha = JOptionPane.showOptionDialog(null, "Escolha uma opção", "aviso", JOptionPane.DEFAULT_OPTION,
                    JOptionPane.WARNING_MESSAGE, null, opcoes, opcoes[0]);

            // switch case usado para fazer o laço de repetição de acordo com a escolha
            // selecionada
            switch (escolha) {
            case 0:
                Carro carro = new Carro();
                carro.setMarca(JOptionPane.showInputDialog("digite a marca do seu carro: "));
                carro.setModelo(JOptionPane.showInputDialog("digite o modelo do carro: "));
                carro.setCor(JOptionPane.showInputDialog("digite a cor do carro: "));
                carro.setPlaca(JOptionPane.showInputDialog("digite a placa do carro: "));
                lavaJato.incluir(carro);
                break;

            case 1:
                // opção para adicionar
                JOptionPane.showMessageDialog(null, lavaJato.verLista());
                break;

            case 2:
                // opção para Excluir
                id = Integer.parseInt(JOptionPane.showInputDialog(null,
                        lavaJato.verLista() + " Digite o id de quem deseja excluir "));
                lavaJato.excluir(id);
                break;

            case 3:
                // opção para Alterar
                id = Integer.parseInt(JOptionPane.showInputDialog(null,
                        lavaJato.verLista() + " Digite o id de quem deseja Alterar "));
                Carro carroAltera = new Carro();
                carroAltera.setMarca(JOptionPane.showInputDialog("digite a marca do seu carro: "));
                carroAltera.setModelo(JOptionPane.showInputDialog("digite o modelo do carro: "));
                carroAltera.setCor(JOptionPane.showInputDialog("digite a cor do carro: "));
                carroAltera.setPlaca(JOptionPane.showInputDialog("digite a placa do carro: "));

                lavaJato.altera(id, carroAltera);
                break;
            }

        } while (escolha != 4);

    }
}
