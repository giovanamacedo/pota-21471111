//  Integrantes do grupo:
//  Giovana Macedo Leal Ibiapina - RA: 21471111
//  Guilherme Morales Gomes - RA: 21447735

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList <Clientes> clientes = new ArrayList<>();
        Clientes clientes1 = new Clientes("Ágatha Alves", "female", "Rua Ernesto Rothschild 1418",
                "São Paulo","AgathaCarvalhoAlves@jourrapide.com", "(11) 8310-5023",34);
        Clientes clientes2 = new Clientes("Aaron Jarrett","male","1940 Old House Drive",
                "Worthington","AaronMJarrett@gustr.com","740-971-8937",28);
        Clientes clientes3 = new Clientes("Joshua Vanalstyne","male","3834 Gorby Lane",
                "Hattiesburg","JoshuaAVanalstyne@gustr.com","601-246-8318",44);

        clientes.add(clientes1);
        clientes.add(clientes2);
        clientes.add(clientes3);

    }
}
