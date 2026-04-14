package Revisao2.EX1;

public class MainEX1 {
    public static void main(String [] args){
        Locacao locacao = new Locacao();
        locacao.adicionarItem(new Livros("1984", 12.0, "George Orwell"));
        locacao.adicionarItem(new CDs("Thriller", 15.5, 9));
        locacao.adicionarItem(new DVDs("Matrix", 20.0, 136));
        locacao.adicionarItem(new Livros("Livro", 12.0, "George Orwell"));
        System.out.println("Itens locados: " + locacao.quantidadeItens());
        System.out.println("Livros locados: " + locacao.quantidadeLivros());
        System.out.println("Valor total: R$ " + locacao.valorTotal());

        locacao.removerItem("1984");
        locacao.removerItem("null");
        System.out.println("\nApós remover o livro '1984':");
        System.out.println("Itens locados: " + locacao.quantidadeItens());
        System.out.println("Livros locados: " + locacao.quantidadeLivros());
        System.out.println("Valor total: R$ " + locacao.valorTotal());
        System.out.println("\n");
        locacao.imprimirItens();
    }
    
}
