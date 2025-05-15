package tecsup.edu.pe.daw_ec02.model;

public class Laboratorio {
    private long codLab;  // Clave primaria
    private String razonSocial;
    private String direccion;
    private String telefono;
    private String email;
    private String contacto;

    public Laboratorio() {}

    public Laboratorio(long codLab, String razonSocial, String direccion, String telefono, String email, String contacto) {
        this.codLab = codLab;
        this.razonSocial = razonSocial;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.contacto = contacto;
    }

    public long getCodLab() {
        return codLab;
    }

    public void setCodLab(long codLab) {
        this.codLab = codLab;
    }

    public String getRazonSocial() {
        return razonSocial;
    }

    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }
}
