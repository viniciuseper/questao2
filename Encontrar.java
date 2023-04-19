package br.com.questao2;
import java.util.Scanner;

public class Encontrar {
    public static void main(String[] args) {

        String nome;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o nome do titulo: ");
        nome = sc.nextLine();

        AchadoPerdido livro = new AchadoPerdido();
        livro.setTitulo(nome);
        livro.setDescricao("Livro muito antigo");
        livro.setData_hora("18/04/2023 - 21:00");
        livro.setFoto("Foto Antiga");
        livro.setStatus("Disponível");
        livro.setLocal_achado("Prateleira 01");
        livro.setTipo("Livro usado");

        System.out.println("Retorno: " + livro.buscarTitulo());
        livro.visualizarDetalhes();

    }
}
