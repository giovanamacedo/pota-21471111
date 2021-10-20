public class Clientes {

    private String nome;
    private String sexo;
    private String endereco;
    private String cidade;
    private String email;
    private String telefone;
    private int idade;

    public Clientes(String nome, String sexo, String endereco, String cidade, String email, String telefone, int idade) {
        this.nome = nome;
        this.sexo = sexo;
        this.endereco = endereco;
        this.cidade = cidade;
        this.email = email;
        this.telefone = telefone;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefone() {
        return telefone;
    }

    public int getIdade() {
        return idade;
    }
}
