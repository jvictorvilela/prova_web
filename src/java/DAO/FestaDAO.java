package DAO;
import pkg.Usuario;
import java.util.ArrayList;
import pkg.Festa;


public class FestaDAO {

    private static ArrayList<Festa> festas = new ArrayList<Festa>(); // array que simula um BD
    
    
    public ArrayList<Festa> getTodasFestas() {
        return festas;
    }
    
    public Festa getFesta(String nome) {
        for (Festa aux : festas) {
            if (nome.equals(aux.getTitulo())) {
                return aux;
            }
        }
        return null;
    }
    
    public void adicionarFesta(String data, String horaInicio, String titulo) {
        Festa festa = new Festa(data, horaInicio, titulo); 
        festas.add(festa);
    }
    
    
}
