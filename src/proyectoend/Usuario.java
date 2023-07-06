package proyectoend;

public class Usuario {
    private String usuario;
    private String password;
    
    private int edad;
    private String sexo;
    private String eMail;
    private String puesto;

    public Usuario(String usuario, String password, int edad, String sexo, String eMail, String puesto) {
        this.usuario = usuario;
        this.password = password;
        this.edad = edad;
        this.sexo = sexo;
        this.eMail = eMail;
        this.puesto = puesto;
    }
    
    public Usuario(){
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }
}
