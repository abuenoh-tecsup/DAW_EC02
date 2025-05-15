package tecsup.edu.pe.daw_ec02.service;

import tecsup.edu.pe.daw_ec02.dto.OrdenCompraDTO;
import tecsup.edu.pe.daw_ec02.model.OrdenCompra;

import java.util.List;

public interface OrdenCompraService {
    List<OrdenCompra> listar();
    OrdenCompra obtener(Long nroOrdenC);
    void crear(OrdenCompra ordenCompra);
    void actualizar(OrdenCompra ordenCompra);
    void eliminar(Long nroOrdenC);

    OrdenCompraDTO obtenerConLaboratorio(long nroOrdenC);
    List<OrdenCompra> listarPorLaboratorio(long codLab);

}
