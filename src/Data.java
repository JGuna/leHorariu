public class Data {

    // -- variaveis de classe ------------------------------------------------------------
    
    private static String[] nomeDiaDaSemana = { "Domingo", "Segunda-feira",
                                                "Terca-feira", "Quarta-feira",
                                                "Quinta-feira", "Sexta-feira",
                                                "Sabado"};
    private static int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private static String[] nomeMes = { "Invalido", "Janeiro", "Fevereiro",
                                        "Marco", "Abril", "Maio", "Junho",
                                        "Julho", "Agosto", "Setembro",
                                        "Outubro", "Novembro", "Dezembro"};
    // -- variaveis de instancia ---------------------------------------------------------
    
    private int ano;
    private int mes;
    private int dia;

    // -- construtores -------------------------------------------------------------------
    
    public Data(int ano, int mes, int dia) {
        setData(ano, mes, dia);
    }

    public Data() {
        setData(1, 1, 1);
    }

    public Data(Data d) {
        ano = d.getAno();
        mes = d.getMes();
        dia = d.getDia();
    }

    // -- metodos de classe --------------------------------------------------------------
    
    public static boolean anoBissexto(int ano) {
        return ano % 4 == 0 && ano % 100 != 0 || ano % 400 == 0;
    }

    // -- metodos de instancia -----------------------------------------------------------
    
    // ----- metodos de consulta
    
    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    // ----- metodos de modificacao
    
    public void setData(int ano, int mes, int dia) {
        this.ano = ano > 0 ? ano : 1;			      // valida o ano 
        this.mes = (mes > 0 && mes <= 12) ? mes : 1;	      // valida o mes
        this.dia = validaDia(dia) ? dia : 1;		      // valida o dia
    }
    
    // ----- metodos complementares e auxiliares

    // valida o dia baseado no mes e ano
    private boolean validaDia(int dia) {
        return (dia > 0 && dia <= diasPorMes[ mes]
                || mes == 2 && dia == 29 && anoBissexto(ano)); // Se Fevereiro: verifica se ano bissexto
    }

    public String diaDaSemana() {
        int totalDias = contaDias();

        totalDias = totalDias % 7;

        return nomeDiaDaSemana[totalDias];
    }

    private int contaDias() {
        int totalDias = 0;

        for (int i = 1; i < ano; i++) {
            totalDias += anoBissexto(i) ? 366 : 365;
        }
        for (int i = 1; i < mes; i++) {
            totalDias += diasPorMes[i];
        }
        totalDias += (anoBissexto(ano) && mes > 2) ? 1 : 0;
        totalDias += dia;

        return totalDias;
    }

    public String toAnoMesDiaString() {
        return String.format("%04d/%02d/%02d", ano, mes, dia);
    }

    public String toString() {
        return diaDaSemana() + ", " + dia + " de " + nomeMes[mes] + " de " + ano;
    }

    public boolean maior(Data d1) {
        int totalDias = contaDias();
        int totalDias1 = d1.contaDias();

        return totalDias > totalDias1;
    }

    public int diferenca(Data d1) {
        int totalDias = contaDias();
        int totalDias1 = d1.contaDias();

        return Math.abs(totalDias - totalDias1);
    }
}