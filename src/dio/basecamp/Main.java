package dio.basecamp;

public class Main {
    public static void main(String[] args){
        System.out.println("Exercicio calculadora");
        Calculadora.soma(3, 6);
        Calculadora.divisao(9,1.8);
        Calculadora.multiplicacao(7,8);
        Calculadora.divisao(5, 2.5);

        System.out.println("Mensagem do exercicio");
        Mensagem.obterMensagem(9);
        Mensagem.obterMensagem(14);
        Mensagem.obterMensagem(1);


        System.out.println("Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);

        

    }
}
