public class BalaoAtv {

    private String numeroBalao;
    private String registro;

    public String getNumeroBalao(){
        return numeroBalao;
    }
    public void setNumeroBalao(String numeroBalao){
        this.numeroBalao = numeroBalao;
    }

    public String getRegistro(){
        return registro;
    }
    public void setRegistro(String registro){
        this.registro = registro;
    }

    public String voar(){
        return "voando";
    }

}
