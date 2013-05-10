
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import javax.swing.JOptionPane;


public class Aluno {
    
    private int numero;
    private String nome;
    private String dataNascimento;
    private int telefone;
    private String mail;
    private static ArrayList<Aluno> aluno = new ArrayList<>();
    // arraylist displinas
    
    public Aluno(int numero, String nome, String dataNascimento, int telefone, String mail) {
        this.numero = numero;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.mail = mail;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public String getMail() {
        return mail;
    }

    public String getNome() {
        return nome;
    }

    public int getNumero() {
        return numero;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    public static void carregarAlunoTxt(){
        try{
            Scanner in = new Scanner(new File("alunos.txt"));
            if(!in.hasNextLine()){
                JOptionPane.showMessageDialog(null,"O ficheiro está vazio!","Carregar Alunos",JOptionPane.WARNING_MESSAGE);
            }
            else{
                ArrayList<Aluno> tmp = new ArrayList<Aluno>();
                while(in.hasNextLine()){
                    String aux[] = in.nextLine().split(";");
                    tmp.add(new Aluno(Integer.parseInt(aux[0]),aux[1],aux[2],Integer.parseInt(aux[3]),aux[4]));
                }
                aluno.addAll(tmp);
                JOptionPane.showMessageDialog(null, "Alunos Carregados com sucesso!","Carregar Alunos",JOptionPane.INFORMATION_MESSAGE);
            } 
        }
        catch(FileNotFoundException ext){
            JOptionPane.showMessageDialog(null, "Ficheiro não encontrado!","Carregar Alunos",JOptionPane.WARNING_MESSAGE);
        }
    }
	public static void visualizarAlunosTxt(){
	   
	}
	
   public static void ordenarAlunosNumero() {
	  List<Aluno> listaAlunos = new ArrayList<Aluno>();
	  Comparator<Aluno> comparator = new Comparator<Aluno>() {

		 public int compare(Aluno num1, Aluno num2) {
			return num2.getNumero() - num1.getNumero() ; // use your logic
		 }
	  };
	  Collections.sort(listaAlunos, comparator);
	  System.out.println(listaAlunos);
   }
	
/*   public static void ordenarAlunosNome() {
	  List<Aluno> listaAlunos = new ArrayList<Aluno>();
	  Comparator<Aluno> comparator = new Comparator<Aluno>() {

    public String compare(Aluno nome1, Aluno nome2) {
        return nome2.getNome() - nome1.getNome(); // use your logic
		 }
	  };
	  Collections.sort(listaAlunos, comparator);
	  System.out.println(listaAlunos);
   }
	
	public static void infoAlunoNumero(){
	   
	}
*/
}
