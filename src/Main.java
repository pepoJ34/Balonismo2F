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

        BalaoAtv b2 = new BalaoAtv();
        b2.setNumeroBalao("672");
        b2.setRegistro("Ultimas 32 viagens perfeitamente executadas");

        Piloto p1 = new Piloto();
        System.out.println("Insira CPF do Piloto: ");
        p1.setCpf(tcd.next());
        System.out.println("Informe nome do Piloto: ");
        p1.setNome(tcd.next());
        System.out.println("Insira seu número de registro ANAC: ");
        p1.setNumeroRegistro(tcd.next());

        Piloto p2 = new Piloto();
        p2.setCpf("222.777.444.55");
        p2.setNome("Edimundo Augusto");
        p2.setNumeroRegistro("787854");

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
        System.out.println("A pessoa assinou o termo? (true/false)");
        pe1.setAssinaturaTermo(tcd.nextBoolean());
        System.out.println("Qual o endereço?: ");
        pe1.setEndereco(tcd.next());

        Pessoa pe2 = new Pessoa();
        pe2.setNome("Georgia Sousa");
        pe2.setCpf("676.990.333.45");
        pe2.setRg("56.877.467-X");
        pe2.setTelefone("11 77788-9999");
        pe2.setEmergencia("71 23334-0092");
        pe2.setAssinaturaTermo(true);
        pe2.setEndereco("Alameda Santos, 543, São Paulo - SP");

        String resultado = b1.voar();
        System.out.println(resultado);


    }
}