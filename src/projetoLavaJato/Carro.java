package projetoLavaJato;



public class Carro {
    // criação dos atributos carro

    private String marca;
    private String modelo;
    private String cor;
    private String placa;

    // criação dos metodos get & set

    public String getMarca(){
        return marca;
    }

    public void setMarca(String marca){
        this.marca  = marca;
    }

    public String getModelo(){
        return modelo;
    }

    public void setModelo(String  modelo){
        this.modelo = modelo;
    }

    public String getCor(){
        return cor;
    }

    public void setCor(String cor){
        this.cor = cor;
    }

    public String getPlaca(){
        return placa;
    }

    public void setPlaca(String placa){
        this.placa = placa;
    }

}
