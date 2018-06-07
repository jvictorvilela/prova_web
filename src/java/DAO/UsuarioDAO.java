package DAO;
import pkg.Usuario;
import java.util.ArrayList;

/**
 *
 * @author victor
 */
public class UsuarioDAO {
    private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>(); // array que simula um BD

    public UsuarioDAO() {
        // cadastrando alguns usuários
        usuarios.add(new Usuario("João Victor", "victorvilela00@gmail.com", 123456, "123456", 10));
        usuarios.add(new Usuario("Zé", "ze@ze.com.br", 654321, "654321", 1));
        // fim cadastro

    }
    
    public ArrayList<Usuario> getTodosUsuarios() {
        return usuarios;
    }
    
    public Usuario autenticar(String login, String senha) {
        if (usuarios != null) {
            for (Usuario aux : usuarios) {
                if (aux.getMatricula() == Integer.parseInt(login) && senha.equals(aux.getSenha())) {
                    return aux;
                }
            }
        }
        return null;
    }
    
    public Usuario getUsuarioPorMatricula(int matricula) {
        for (Usuario aux : usuarios) {
            if (matricula == aux.getMatricula()) {
                return aux;
            }
        }
        return null;
    }
    
    
}
