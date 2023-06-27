import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Construir balões
        Scanner tcd = new Scanner(System.in);

        BalaoAtv b1 = new BalaoAtv();
        System.out.println("Insira número do Balão: ");
        b1.setNumeroBalao(tcd.next());
        System.out.println("Informe o registro de regularidade: ");
        b1.setRegistro(tcd.next());

        Piloto p1 = new Piloto();
        System.out.println("Insira CPF do Piloto: ");
        p1.setCpf(tcd.next());
        System.out.println("Informe nome do Piloto: ");
        p1.setNome(tcd.next());
        System.out.println("Insira seu número de registro ANAC: ");
        p1.setNumeroRegistro(tcd.next());

        Pessoa pe1 = new Pessoa();
        System.out.println("Informe o nome: ");
        pe1.setNome(tcd.next());
        System.out.println("Insira o CPF: ");
        pe1.setCpf(tcd.next());
        System.out.println("Informe o RG: ");
        pe1.setRg(tcd.next());
        System.out.println("Informe o telefone: ");
        pe1.setTelefone(tcd.next());
        System.out.println("Informe o número de emergência: ");
        pe1.setEmergencia(tcd.next());
        System.out.println("A pessoa assinou o termo? (Sim/Não)");
        pe1.setAssinaturaTermo(tcd.nextBoolean());
        System.out.println("Qual o endereço?");
        pe1.setEndereco(tcd.next());

        String resultado = b1.voar();
        System.out.println(resultado);


    }
}