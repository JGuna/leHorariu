
public class Celula {

    private String dia;
    private int hora;
    
    private String siglaDisciplina;
    private String tipoAula;
    private String turma;
    private String siglaProfessor;
    private String sala;

    public Celula(String dia, int hora, String siglaDisciplina, 
            String tipoAula, String turma, String siglaProfessor, String sala) {
        this.dia = dia;
        this.hora = hora;
        this.siglaDisciplina = siglaDisciplina;
        this.tipoAula = tipoAula;
        this.turma = turma;
        this.siglaProfessor = siglaProfessor;
        this.sala = sala;
    }

    public String getDia() {
        return dia;
    }

    public int getHora() {
        return hora;
    }

    public String getSala() {
        return sala;
    }

    public String getSiglaDisciplina() {
        return siglaDisciplina;
    }

    public String getSiglaProfessor() {
        return siglaProfessor;
    }

    public String getTipoAula() {
        return tipoAula;
    }

    public String getTurma() {
        return turma;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public void setSiglaDisciplina(String siglaDisciplina) {
        this.siglaDisciplina = siglaDisciplina;
    }

    public void setSiglaProfessor(String siglaProfessor) {
        this.siglaProfessor = siglaProfessor;
    }

    public void setTipoAula(String tipoAula) {
        this.tipoAula = tipoAula;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
