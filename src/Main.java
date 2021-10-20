//  Integrantes do grupo:
//  Giovana Macedo Leal Ibiapina - RA: 21471111
//  Guilherme Morales Gomes - RA: 21447735

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.*;

public class Main {
    public static int contador = 0;

    public static List<String> dadosClientes = new ArrayList<String>();

    public static List<String> nome = new ArrayList<String>();
    public static List<String> sexo = new ArrayList<String>();
    public static List<String> endereco = new ArrayList<String>();
    public static List<String> cidade = new ArrayList<String>();
    public static List<String> email = new ArrayList<String>();
    public static List<String> telefone = new ArrayList<String>();
    public static List<String> idade = new ArrayList<String>();


    public static void main(String[] args) {

        try {
            File file = new File("arquivoDados.txt");
            Scanner entrada = new Scanner(file);

            while (entrada.hasNextLine()) {
                String linha = entrada.nextLine();
                dadosClientes.add(linha);
                contador++;
            }

            int contadorAux = 0;

            while(contadorAux < contador){
                String partes = dadosClientes.get(contadorAux);
                String[] part = partes.split(",");
                int controlador = 0;

                while(controlador <= 6){

                    if(controlador ==0){
                        nome.add(part[controlador]);

                    } else if(controlador ==1){
                        sexo.add(part[controlador]);

                    } else if(controlador ==2){
                        endereco.add(part[controlador]);

                    } else if(controlador ==3){
                        cidade.add(part[controlador]);

                    } else if(controlador ==4){
                        email.add(part[controlador]);

                    } else if(controlador ==5){
                        telefone.add(part[controlador]);

                    } else if(controlador ==6){
                        idade.add(part[controlador]);
                    }
                    controlador++;
                }
                contadorAux++;
            }

            entrada.close();

        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

        int iniciar = 0;
        Scanner nomeBuscado = new Scanner(System.in , "UTF-8");

        while(iniciar < 1){
            System.out.println("- Digite o nome a ser buscado: " + "\n Ou exit para cancelar a operação");
            String entradaDados = nomeBuscado.nextLine();
            if(entradaDados.equals("exit")){
                iniciar++;
            }else{
                int indice = pesquisaBinaria(entradaDados);
                if(indice >0){
                    System.out.println("Nome: "+ nome.get(indice)+", "+" Sexo: "+ sexo.get(indice)+", "
                                       +" Endereco: "+ endereco.get(indice)+", "+" Cidade: "+ cidade.get(indice)
                                       +", "+" Email: " + email.get(indice)+ ", "+" Telefone: "+ telefone.get(indice)+ ", "
                                       +" Idade: "+ idade.get(indice));
                }else{
                    System.out.println("Ops.. nome não identificado no sistema!!");
                }
            }
        }
        nomeBuscado.close();
    }

    public static int Contador;
    public static int pesquisaBinaria(String chave){
        int inicio, meio, fim;

        inicio = 0;
        fim = nome.size() - 1;
        Contador = 0;

        while (inicio <= fim){
            meio = (inicio + fim) / 2;
            Contador++;
            if (chave.equals(nome.get(meio))){
                return meio;
            }
            Contador++;

            if (chave.compareTo(nome.get(meio)) < 0) {
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        System.out.println("Comparações: "+ Contador);
        return -1;
    }
}
