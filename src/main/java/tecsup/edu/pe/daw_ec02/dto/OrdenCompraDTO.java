package tecsup.edu.pe.daw_ec02.dto;

import tecsup.edu.pe.daw_ec02.model.Laboratorio;

public class OrdenCompraDTO {
    private Long nroOrdenC;
    private String fechaEmision;
    private String situacion;
    private double total;
    private Laboratorio laboratorio; // en vez de codLab
    private String nroFacturaProv;

    public OrdenCompraDTO() {}

    public OrdenCompraDTO(Long nroOrdenC, String fechaEmision, String situacion, double total, Laboratorio laboratorio, String nroFacturaProv) {
        this.nroOrdenC = nroOrdenC;
        this.fechaEmision = fechaEmision;
        this.situacion = situacion;
        this.total = total;
        this.laboratorio = laboratorio;
        this.nroFacturaProv = nroFacturaProv;
    }

    public Long getNroOrdenC() {
        return nroOrdenC;
    }

    public void setNroOrdenC(Long nroOrdenC) {
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

    public Laboratorio getLaboratorio() {
        return laboratorio;
    }

    public void setLaboratorio(Laboratorio laboratorio) {
        this.laboratorio = laboratorio;
    }

    public String getNroFacturaProv() {
        return nroFacturaProv;
    }

    public void setNroFacturaProv(String nroFacturaProv) {
        this.nroFacturaProv = nroFacturaProv;
    }
}
