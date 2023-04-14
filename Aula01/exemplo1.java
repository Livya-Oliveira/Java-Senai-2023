// Tipos de variaveis em Java

/* 
 * String -> armazena texto "entre aspas"
 * char -> armazena uma única letra 'entre aspas simples'
 * int -> armazena numeros inteiros 
 * float -> armazena numeros decimais (entre parentesis)
 * double -> armazena numeros decimais de proporções astronomicas.Maior precisão.(o ponto marca os centavos)
 */

 /* Regras para criar variaveis
  * Toda váriavel DEVE começar com letra munúscula
  * Não pode haver espaço no nome da variável
  * exemplos: nomeAluno, enderecoCliente, aulaJava, produtoAdquirido
  */

public class exemplo1{
    public static void main(String[] args) {
        String nome = "Livya Oliveira";
        int idade = 16; 
        boolean chuva = true; // Em variaveis booleanas eu uso true ou false 
        char letra = 'L';  // Todo char DEVE estar com aspas simples 
        double salario = 30000.00;
        float altura = (float) (1.6); // Estou convertendo um double para float
        System.out.println("meu nome é:" +nome);
        System.out.println("minha idade é: " + idade);
        System.out.println("está chovendo?: " + chuva);
        System.out.println("A inicial do meu nome é:" +letra);
        System.out.println("quero receber de salario:" + salario + "reais");
        System.out.println("minha altura é:" + altura + "metros");
    }

}