public class Metodos {

    private Clientes[] v;
    private int comparacoes;

    public Metodos(Clientes[] clientes) {
        v = clientes;
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public int pesquisaBinaria(String nome, Clientes[] clientes) {
        int inicio, fim, meio = 0;

        comparacoes = 0;
        inicio = 0;
        fim = clientes.length - 1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            comparacoes++;
            if (clientes[meio].equals(nome)) {
                return meio;
            }
            comparacoes++;
            if (clientes[meio].getNome().compareTo(nome) < 0) {  // troca para '>' se o vetor estiver ordenado decrescente
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -meio; // return -meio;
    }

}
