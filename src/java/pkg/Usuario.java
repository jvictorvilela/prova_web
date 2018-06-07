package pkg;

public class Usuario {
    String nome;
    String email;
    int matricula;
    String senha;
    int nivel;
    
    public Usuario(String nome, String email, int matricula, String senha, int nivel) {
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
        this.senha = senha;
        this.nivel = nivel;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }
    
    public int getNivel() {
        return this.nivel;
    }
}
