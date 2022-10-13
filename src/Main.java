public class Main {
    public static void main(String[] args) {
        Cliente rita = new Cliente();
        rita.setNome("Rita");

        Conta cc = new ContaCorrente(rita);
        Conta poupanca = new ContaPoupança(rita);

        cc.depositar(200);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        System.out.println();
        poupanca.imprimirExtrato();
    }
}