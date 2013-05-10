
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Disciplina {
    
    private String sigla;
    private String Designacao;
    private int horasTeoricas;
    private int horasPraticas;
    private static ArrayList<ProfDisc> profs = new ArrayList<>();
    private static ArrayList<Disciplina> disc = new ArrayList<>();
    
    
    public Disciplina(String sigla, String Designacao, int horasTeoricas, int horasPraticas) {
        this.sigla = sigla;
        this.Designacao = Designacao;
        this.horasTeoricas = horasTeoricas;
        this.horasPraticas = horasPraticas;
    }

    public String getDesignacao() {
        return Designacao;
    }

    public int getHorasPraticas() {
        return horasPraticas;
    }

    public int getHorasTeoricas() {
        return horasTeoricas;
    }

    public String getSigla() {
        return sigla;
    }

    public void setDesignacao(String Designacao) {
        this.Designacao = Designacao;
    }

    public void setHorasPraticas(int horasPraticas) {
        this.horasPraticas = horasPraticas;
    }

    public void setHorasTeoricas(int horasTeoricas) {
        this.horasTeoricas = horasTeoricas;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void carregarDisciplinasTxt(){
        try{
            Scanner in = new Scanner(new File("disciplinas.txt"));
            if(!in.hasNextLine()){
                JOptionPane.showMessageDialog(null,"O ficheiro está vazio!","Carregar Disciplinas",JOptionPane.WARNING_MESSAGE);
            }
            else{
                ArrayList<Disciplina> tmp = new ArrayList<>();
                while(in.hasNextLine()){
                    
                    String aux[] = in.nextLine().split(";");
                    tmp.add(new Disciplina(aux[0],aux[1],Integer.parseInt(aux[2]),Integer.parseInt(aux[3])));
                    
                    for (int i=4;i<aux.length;i++)
                    {
                        profs.add(new ProfDisc(aux[i]));
                    }
                }
                disc.addAll(tmp);
                JOptionPane.showMessageDialog(null, "Disciplinas Carregados com sucesso!","Carregar Disciplinas",JOptionPane.INFORMATION_MESSAGE);
            } 
        }
        catch(FileNotFoundException ext){
            JOptionPane.showMessageDialog(null, "Ficheiro não encontrado!","Carregar Disciplinas",JOptionPane.WARNING_MESSAGE);
        }
    }
}
