public class Pessoa {
    String nome;
    int idade;

    public void exibirInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public static void main(String[] args) {
        Pessoa pessoa1 = new Pessoa();
        pessoa1.nome = "Pedro";
        pessoa1.idade = 20;
        pessoa1.exibirInformacoes();
    }
}
