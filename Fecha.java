public class Fecha {
    //atributos
    private static final int ANIO_ACTUAL = 2025;
    private int dia;
    private int mes;
    private int anio;

    //constructor
    public Fecha(int dia,int mes, int anio){
        this.dia=dia;
        this.mes=mes;
        this.anio=anio;

    }

    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAnio() {
        return anio;
    }

    //te da la fecha formateada
    public String obtenerFechaFormateada(){
        StringBuilder str= new StringBuilder();
        str.append(dia);
        str.append("/");
        str.append(mes);
        str.append("/");
        str.append(anio);
        String string =str.toString();
        return string;
    }
    //calcula la antiguedad
    public void calcularAntiguedadAnios(){
        int antiguedad=ANIO_ACTUAL-anio;
    }

}
