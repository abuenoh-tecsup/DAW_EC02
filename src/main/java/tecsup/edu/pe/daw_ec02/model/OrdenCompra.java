package tecsup.edu.pe.daw_ec02.model;

public class OrdenCompra {
    private long nroOrdenC;  // Clave primaria
    private String fechaEmision;
    private String situacion;
    private double total;
    private long codLab;  // FK simulada hacia Laboratorio
    private String nroFacturaProv;

    public OrdenCompra() {}

    public OrdenCompra(long nroOrdenC, String fechaEmision, String situacion, double total, long codLab, String nroFacturaProv) {
        this.nroOrdenC = nroOrdenC;
        this.fechaEmision = fechaEmision;
        this.situacion = situacion;
        this.total = total;
        this.codLab = codLab;
        this.nroFacturaProv = nroFacturaProv;
    }

    public long getNroOrdenC() {
        return nroOrdenC;
    }

    public void setNroOrdenC(long nroOrdenC) {
        this.nroOrdenC = nroOrdenC;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public void setFechaEmision(String fechaEmision) {
        this.fechaEmision = fechaEmision;
    }

    public String getSituacion() {
        return situacion;
    }

    public void setSituacion(String situacion) {
        this.situacion = situacion;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public long getCodLab() {
        return codLab;
    }

    public void setCodLab(long codLab) {
        this.codLab = codLab;
    }

    public String getNroFacturaProv() {
        return nroFacturaProv;
    }

    public void setNroFacturaProv(String nroFacturaProv) {
        this.nroFacturaProv = nroFacturaProv;
    }
}
