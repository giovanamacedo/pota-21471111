public class Metodos {

    private String[] v;
    private int comparacoes;

    public Metodos(String[] clientes) {
        v = clientes;
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public int pesquisaBinaria(String nome, String[] clientes) {
        int inicio, fim, meio;

        comparacoes = 0;
        inicio = 0;
        fim = v.length - 1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            comparacoes++;
            if (clientes[meio] == nome) {
                return meio;
            }
            comparacoes++;
            if (clientes[meio] != nome) {  // troca para '>' se o vetor estiver ordenado decrescente
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -1; // return -meio;
    }


   /* public int pesquisaBinaria (String nome, String[] clientes){
        int inicio = 0;         //Posição inicial do vetor
        int meio = 0;          //Posição do meio do vetor
        int fim = clientes.length - 1;  //Posição final do vetor

        while (inicio <= fim){
            meio = (fim + inicio) / 2;
            if(clientes[meio] == nome) {
                return meio;
            }

            if(clientes[meio] != nome) {
                inicio = meio + 1;

            } else {
                fim = meio - 1;
            }
        }
        return fim;
    }*/

}
