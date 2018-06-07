package pkg;

import pkg.Usuario;
import java.util.ArrayList;

public class Festa {
    String data;
    String horaInicio;
    String titulo;
    ArrayList<Integer> participantes; // lista com as matriculas dos participantes
    
    public Festa(String data, String horaInicio, String titulo) {
        this.data = data;
        this.horaInicio = horaInicio;
        this.titulo = titulo;
        participantes = new ArrayList<Integer>();
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Integer> getParticipantes() {
        return participantes;
    }

    public void setParticipantes(ArrayList<Integer> participantes) {
        this.participantes = participantes;
    }
    
    public void addParticipante(int matricula) {
        participantes.add(matricula);
    }
    
    public boolean usuarioParticipara(int matricula) {
        for (int aux : participantes) {
            if (aux == matricula) {
                return true;
            }
        }
        return false;
    }
    
    
}
