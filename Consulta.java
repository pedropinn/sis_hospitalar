public class Consulta {

    private String dia;
    private String hora;

    public Consulta(String dia, int idade) {
        this.dia = dia;
        this.hora = hora;
    }

    public Consulta() {
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getDia() {
        return dia;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getHora() {
        return hora;
    }

    public void imprimeDados() {
        System.out.println("Agendamento dia: " + getDia() + " Horario: " + getHora());
    }
}
