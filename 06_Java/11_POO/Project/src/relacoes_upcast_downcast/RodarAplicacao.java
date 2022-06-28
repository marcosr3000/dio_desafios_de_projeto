package relacoes_upcast_downcast;

public class RodarAplicacao {

    public static void main(String[] args) {

        Funcionario funcionario = new Funcionario();

        //Upcasts

        Funcionario gerente = new Gerente();
        Funcionario vendedor = new Vendedor();
        Funcionario faxineiro = new Faxineiro();

        //Downcasts

        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
}
