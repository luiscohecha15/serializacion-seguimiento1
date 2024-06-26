package org.example.domain;
import java.io.Serializable;
public class Cita implements Serializable{

    private static final long serialVersionUID = 1L;
    private int id;
    private String hora, fecha, motivo;
    Paciente paciente;
    public Cita(){}

    public Cita(int id, Paciente paciente, String hora, String fecha, String motivo){
        this.id = id;
        this.paciente = paciente;
        this.hora = hora;
        this.fecha = fecha;
        this.motivo = motivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Cita{" +
                "id=" + id +
                ", hora='" + hora + '\'' +
                ", fecha='" + fecha + '\'' +
                ", motivo='" + motivo + '\'' +
                ", paciente=" + paciente +
                '}';
    }
}
