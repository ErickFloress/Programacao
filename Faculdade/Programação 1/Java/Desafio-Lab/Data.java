public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor que valida a data
    public Data(int dia, int mes, int ano) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida. A data foi definida como 1/1/2000.");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    // Métodos de acesso
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        if (validaData(dia, mes, ano)) {
            this.dia = dia;
        }
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        if (validaData(dia, mes, ano)) {
            this.mes = mes;
        }
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        if (validaData(dia, mes, ano)) {
            this.ano = ano;
        }
    }

    // Método para validar se o ano é bissexto
    public boolean verificaAnoBissexto() {
        return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
    }

    // Método para validar a data
    private boolean validaData(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12) {
            return false;
        }

        int maxDia;
        switch (mes) {
            case 2:
                maxDia = verificaAnoBissexto() ? 29 : 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                maxDia = 30;
                break;
            default:
                maxDia = 31;
        }

        return dia >= 1 && dia <= maxDia;
    }

    // Método toString para exibir a data no formato dia/mês/ano
    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }
}
