package horariogui;

//import Library.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
//import java.util.ArrayList;
import javax.swing.*;

/* Janela Principal do programa
 * 
 */
public class Janela extends JFrame {

    //  *** VARIÁVEIS DE CLASSE ***

    
    //  *** VARIÁVEIS DE INSTÂNCIA ***


    //  *** CONSTRUTORES ***

    // construtor da janela
    public Janela(String titulo){
        // titulo da janela = titulo da superclasse
        super(titulo);
        
        // declarar menubar, JMenu e menuitems
        JMenuBar menuBar;
        JMenu menu,menuC;
        JMenuItem menuItem;
        
        // criar menubar
        menuBar = new JMenuBar();
        
        
        
        // menu Importar TXT*******************************************************************************************************************************************************************************************************
        menu = new JMenu("Ficheiro");
        menu.setMnemonic('F');
        menuBar.add(menu);
        
        // menuC CARREGAR ficheiros
        menuC = new JMenu("Carregar Ficheiro");
        menuC.setMnemonic('C');
       
        // menuitem carregar alunos
        menuItem = new JMenuItem("Carregar Ficheiro Alunos",'A');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl A"));
        // actionListener para carregar alunos a partir de txt
        /*menuItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.carregarAlunosTxt();
            }
        });*/
        menuC.add(menuItem);
        
       
        
        // menuItens CARREGAR Professores
        menuItem = new JMenuItem("Carregar Ficheiro Professores",'P');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl P"));
        // actionListener para carregar professores a partir de txt
        /*menuItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.carregarProfessoresTxt();
            }
        });*/
        menuC.add(menuItem);
        
//      menuItens CARREGAR Disciplinas
        menuItem = new JMenuItem("Carregar Ficheiro Disciplinas",'D');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl D"));
//      /*
//      * fazer actionlistener para Carregar Disciplinas a partir de txt
//      */
        menuC.add(menuItem);
        
        //menuItens CARREGAR Salas
        menuItem = new JMenuItem("Carregar Ficheiro Salas",'S');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
//      /*
//      * fazer actionlistener para Carregar Salas a partir de txt
//      */
        menuC.add(menuItem);
        
        //menuItens CARREGAR Turmas
        menuItem = new JMenuItem("Carregar Ficheiro Turmas",'T');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl T"));
//      /*
//      * fazer actionlistener para Carregar Turmas a partir de txt
//      */
        menuC.add(menuItem);
        
        //menuItens CARREGAR horarios
        menuItem = new JMenuItem("Carregar Ficheiro horarios",'H');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl H"));
//      /*
//      * fazer actionlistener para Carregar Horarios a partir de txt
//      */
        menuC.add(menuItem);
        menu.add(menuC);
        
        // separador
        menu.addSeparator();
        
         // menuItens GRAVAR
        menuItem = new JMenuItem("Gravar",'G');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl G"));
        menuItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //gravar();
            }
        });
        menu.add(menuItem);
        
         // menuItens ELIMINAR TUDO
        menuItem = new JMenuItem("Eliminar",'R');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));
        menuItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                //eliminar();
            }
        });
        menu.add(menuItem);
        
        // separador
        menu.addSeparator();
        
        // menuItens SAIR 
        menuItem = new JMenuItem("Sair",'S');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl s"));
        menuItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
             //   fechar();
            }
        });
        menu.add(menuItem);
        //**********************************************************************************************************************************************************************************************************************************************
 
 
        
        // menu DELEGAÇÃO*******************************************************************************************************************************************************************************************************************************
        menu = new JMenu("Editar");
        menu.setMnemonic('E');
        menuBar.add(menu);
        
        // menuItens Inserir celula no horario
        menuItem = new JMenuItem("Inserir Celula",'C');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl C"));
        // actionListener para criar celula
       /* menuItem.addActionListener(new ActionListener(){
            });*/
        menu.add(menuItem);
        
        // menuItens EDITAR Celula
        menuItem = new JMenuItem("Editar Celula",'E');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl E"));
        // actionListener para editar DELEGAÇÃO
       /* menuItem.addActionListener(new ActionListener(){
         
        });*/
        menu.add(menuItem);
        
        // menuItens ELIMINAR Celula 
        menuItem = new JMenuItem("Eliminar Celula",'X');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl X"));
        // actionListener para eliminar celula
        /* menuItem.addActionListener(new ActionListener(){
           
        });*/
        menu.add(menuItem);
        
                
         //**********************************************************************************************************************************************************************************************************************
        
        
        
        // menu Listagens *************************************************************************************************************************************************************************************
        menu = new JMenu("Listagens");
        menu.setMnemonic('L');
        menuBar.add(menu);
        
        // menuItens Listar Alunos do menu Listagens
        menuItem = new JMenu("Listar Alunos");
        menuItem.setMnemonic('L');
        // actionListener para listar Alunos
        
        
        
        JMenu submenu1= new JMenu("Por Numero do Aluno");
        submenu1.setMnemonic('N');
                
        JMenuItem subsubmenu1= new JMenuItem("Ordem Ascendente",'A');
        submenu1.setMnemonic('A');
        submenu1.add(subsubmenu1);
        
        
        JMenuItem subsubmenu2= new JMenuItem("Ordem Descendente");
        submenu1.setMnemonic('D');
        submenu1.add(subsubmenu2);
        
        menuItem.add(submenu1);
        
        
        
        JMenu submenu2= new JMenu("Por Nome do Aluno");
        submenu1.setMnemonic('M');
        
        JMenuItem subsubmenu3= new JMenuItem("Ordem Ascendente");
        submenu2.setMnemonic('A');
        submenu2.add(subsubmenu3);
        
        JMenuItem subsubmenu4= new JMenuItem("Ordem Descendente");
        submenu2.setMnemonic('D');
        submenu2.add(subsubmenu4);
        menuItem.add(submenu2);
        
        menu.add(menuItem);
        //########################################
        
        menu = new JMenu("Horario");
        menu.setMnemonic('H');
        menuBar.add(menu);
        
        // menuC Apresentar Horario
        menuC = new JMenu("Apresentar Horario");
        menuC.setMnemonic('A');
       
        // menuitem carregar alunos
        menuItem = new JMenuItem("dos Alunos",'A');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl A"));
        // actionListener para carregar alunos a partir de txt
        /*menuItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.carregarAlunosTxt();
            }
        });*/
        menuC.add(menuItem);
        
       
        
        // menuItens CARREGAR Professores
        menuItem = new JMenuItem("dos Professores",'P');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl P"));
        // actionListener para carregar professores a partir de txt
        /*menuItem.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                Main.carregarProfessoresTxt();
            }
        });*/
        menuC.add(menuItem);
        
//      menuItens CARREGAR Disciplinas
        menuItem = new JMenuItem("das Disciplinas",'D');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl D"));
//      /*
//      * fazer actionlistener para Carregar Disciplinas a partir de txt
//      */
        menuC.add(menuItem);
        
        //menuItens CARREGAR Salas
        menuItem = new JMenuItem("das Salas",'S');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));
//      /*
//      * fazer actionlistener para Carregar Salas a partir de txt
//      */
        menuC.add(menuItem);
        
        //menuItens CARREGAR Turmas
        menuItem = new JMenuItem("das Turmas",'T');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl T"));
//      /*
//      * fazer actionlistener para Carregar Turmas a partir de txt
//      */
        menuC.add(menuItem);
        
        menu.add(menuC);
        
        
        // ############################################## 
        
       
        
        // menu ACERCA*******************************************************************************************************************************************************************************************************
        menu = new JMenu("Acerca");
        menu.setMnemonic('A');
        menuBar.add(menu);
        
        // menuItens Autores
        menuItem = new JMenuItem("Autores",'a');
        menuItem.setAccelerator(KeyStroke.getKeyStroke("ctrl A"));
        menuItem.addActionListener(new ActionListener(){
           @Override
           public void actionPerformed(ActionEvent e){
                   JOptionPane.showMessageDialog(Janela.this,"Software desenvolvido por:\nJoão Silva (nº 1040314)\nNelson Tavares (nº 0000000)\n\nParadigmas da Programação\nLicenciatura em Eng. Informática\nISEP - Porto, Maio 2013","Autores",JOptionPane.PLAIN_MESSAGE);
           }
        });
        menu.add(menuItem);
        //**************************************************************************************************************************************************************************************
        
        
        
        // adicionar menuBar
        setJMenuBar(menuBar);
        
        // settings standard para janela principal
        add(new JLabel(new ImageIcon("logo.jpg")));
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                dispose();
            }
        });
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        pack();
        setSize(800,450);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public static void main(String[] args){
        Janela j = new Janela("Gestao de Horarios");
    }

    //  *** MÉTODOS DE CLASSE ***

    // método para confirmar fechar da aplicação
    private void fechar(){
        Object opSimNao[] = {"Sim","Não"};
        if(JOptionPane.showOptionDialog(Janela.this,"Deseja sair da aplicação?","Gestão de Medalhas Olímpicas",JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE,null,opSimNao,opSimNao[1])==0)
     //       Main.gravarEstado();
            dispose();       
    }
    
}
