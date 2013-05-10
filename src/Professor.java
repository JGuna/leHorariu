
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;


public class Professor {
    
    private String sigla;
    private String nome;
    private String mail;
    private String dataContratacao;
    
    private static ArrayList<Professor> professor = new ArrayList<>();
    
    
    public Professor(String sigla, String nome,String dataContratacao, String mail) {
        this.sigla = sigla;
        this.nome = nome;
        this.mail = mail;
        this.dataContratacao = dataContratacao;
    }

    public String getDataContratacao() {
        return dataContratacao;
    }

    public String getMail() {
        return mail;
    }

    public String getNome() {
        return nome;
    }

    public String getSigla() {
        return sigla;
    }

    public void setDataContratacao(String dataContratacao) {
        this.dataContratacao = dataContratacao;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void carregarAlunoTxt(){
        try{
            Scanner in = new Scanner(new File("professores.txt"));
            if(!in.hasNextLine()){
                JOptionPane.showMessageDialog(null,"O ficheiro está vazio!","Carregar Professores",JOptionPane.WARNING_MESSAGE);
            }
            else{
                ArrayList<Professor> tmp = new ArrayList<>();
                while(in.hasNextLine()){
                    String aux[] = in.nextLine().split(";");
                    tmp.add(new Professor(aux[0],aux[1],aux[2],aux[3]));
                }
                professor.addAll(tmp);
                JOptionPane.showMessageDialog(null, "Professor Carregados com sucesso!","Carregar Professores",JOptionPane.INFORMATION_MESSAGE);
            } 
        }
        catch(FileNotFoundException ext){
            JOptionPane.showMessageDialog(null, "Ficheiro não encontrado!","Carregar Alunos",JOptionPane.WARNING_MESSAGE);
        }
    }
}
