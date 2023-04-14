/*Constante -> Varável em Java em que não é possivel alterar o valor.
 * Usamos a palavra chave FINAL
 */


public class exemplo2 {
    public static final int TAXA = 10;
    public static final double PI = (3.14);
    //public -> a constante pode ser acessada em qualquer parte do código
    // static -> essa constante é compartilhada entre todas as classes do meu programa
    // final -> Não posso alterar o valor
    public static void main(String[] args) {
        System.out.println("A taxa da loja é de:"+TAXA+"%");
        System.out.println("PI vale:"+PI);    
    }
}
