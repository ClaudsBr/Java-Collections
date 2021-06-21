package map;

public class Contato {
    private String nome;
    private String email;
    private Integer celular;

    public Contato(String nome, String email, Integer celular) {
        this.nome = nome;
        this.email = email;
        this.celular = celular;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public Integer getCelular() {
        return celular;
    }

    @Override
    public String toString() {
        return "Contato{" +
                "nome='" + nome + '\'' +
                ", email='" + email + '\'' +
                ", celular=" + celular +
                '}';
    }
}
