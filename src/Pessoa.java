public class Pessoa {

    private String nome;
    private String cpf;
    private String rg;
    private String telefone;
    private String emergencia;
    private boolean assinaturaTermo;
    private String endereco;

    public String getNome(){
        return nome;
    }
    public void setNome(String nome){
        this.nome = nome;
    }

    public String getCpf(){
        return cpf;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public String getRg(){
        return rg;
    }
    public void setRg(String rg){
        this.rg = rg;
    }

    public String getTelefone(){
        return telefone;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public String getEmergencia(){
        return emergencia;
    }
    public void setEmergencia(String emergencia){
        this.emergencia = emergencia;
    }

    public boolean getAssinaturaTermo(){
        return assinaturaTermo;
    }
    public void setAssinaturaTermo(boolean assinaturaTermo){
        this.assinaturaTermo = assinaturaTermo;
    }

    public String getEndereco(){
        return endereco;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

}
