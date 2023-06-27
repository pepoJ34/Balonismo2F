public class Balao2 {

    //Atributos
    private String id;
    private String registro;
    private String cor;
    private String tipo;
    private int capacidade;
    private double altura;
    private String porte;
    private double peso;

    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }

    public String getRegistro(){
        return registro;
    }
    public void setRegistro(String registro){
        this.registro = registro;
    }

    public String getCor(){
        return cor;
    }
    public void setCor(String cor){
        this.cor = cor;
    }

    public String getTipo(){
        return tipo;
    }
    public void setTipo(String tipo){
        this.tipo = tipo;
    }

    public int getCapacidade(){
        return capacidade;
    }
    public void setCapacidade(int capacidade){
        this.capacidade = capacidade;
    }

    public double getAltura(){
        return altura;
    }
    public void setAltura(double altura){
        this.altura = altura;
    }

    public String getPorte(){
        return porte;
    }
    public void setPorte(String porte){
        this.porte = porte;
    }

    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }

    //Métodos
    public String voar(){
        return "voando";
    }

}
