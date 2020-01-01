package vista;

public class Persona {
    String Nombres, Apellidos, Rut, Numero, dv, email;

    public Persona(String Nombres, String Apellidos, String Rut, String Numero) {
        this.Nombres = Nombres;
        this.Apellidos = Apellidos;
        this.Rut = Rut;
        this.Numero = Numero;
        this.dv = dv;
        this.email = email;
        
    }

    public String getNombres() {
        return Nombres;
    }

    public void setNombres(String Nombres) {
        this.Nombres = Nombres;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public void setApellidos(String Apellidos) {
        this.Apellidos = Apellidos;
    }

    public String getRut() {
        return Rut;
    }

    public void setRut(String Rut) {
        this.Rut = Rut;
    }

    public String getNumero() {
        return Numero;
    }

    public void setNumero(String Numero) {
        this.Numero = Numero;
    }
    
    
}
