//  Integrantes do grupo:
//  Giovana Macedo Leal Ibiapina - RA: 21471111
//  Guilherme Morales Gomes - RA: 21447735

public class Main {
    public static void main(String[] args) {

        Clientes agatha = new Clientes("Ágatha Alves", "female", "Rua Ernesto Rothschild 1418",
                "São Paulo","AgathaCarvalhoAlves@jourrapide.com", "(11) 8310-5023",34);
        Clientes aaron = new Clientes("Aaron Jarrett","male","1940 Old House Drive",
                "Worthington","AaronMJarrett@gustr.com","740-971-8937",28);
        Clientes joshua = new Clientes ("Joshua Vanalstyne","male","3834 Gorby Lane",
                "Hattiesburg","JoshuaAVanalstyne@gustr.com","601-246-8318",44);

        Clientes[] nomes = {agatha, aaron, joshua};

        Metodos metodo = new Metodos(nomes);

        int inicio = metodo.pesquisaBinaria("Agatha", nomes);
        int fim = metodo.pesquisaBinaria("Joshua", nomes);

        while(inicio >= 0 && inicio <= fim) {
            System.out.println(nomes[inicio].getNome());
            inicio++;
            System.out.println("Comparações: " + metodo.getComparacoes());
        }

    }
}
