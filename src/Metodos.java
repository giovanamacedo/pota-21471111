public class Metodos {

    private String[] v;
    private int comparacoes;

    public Metodos(String[] clientes) {
        v = clientes;
    }

    public int getComparacoes() {
        return comparacoes;
    }

    public int pesquisaBinaria(String nome) {
        int inicio, fim, meio = 0;

        comparacoes = 0;
        inicio = 0;
        fim = v.length - 1;

        while (inicio <= fim) {
            meio = (inicio + fim) / 2;
            comparacoes++;
            if (v[meio].equals(nome)) {
                return meio;
            }
            comparacoes++;
            if (v[meio].compareTo(nome) < 0) {  // troca para '>' se o vetor estiver ordenado decrescente
                fim = meio - 1;
            } else {
                inicio = meio + 1;
            }
        }
        return -meio; // return -meio;
    }

}
