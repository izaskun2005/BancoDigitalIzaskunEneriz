public class DetalleContacto {
    private String email;
    private String telefono;

    public DetalleContacto(String email,String telefono){
        this.email=email;
        this.telefono=telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }

    public String obtenerContacto() {
        StringBuilder str = new StringBuilder();
        str.append("Email:\t");
        str.append(this.email);
        str.append("\n");
        str.append("Telefono:\t");
        str.append(this.telefono);
        str.append("\n");
        String string = str.toString();
        return string;
    }
}