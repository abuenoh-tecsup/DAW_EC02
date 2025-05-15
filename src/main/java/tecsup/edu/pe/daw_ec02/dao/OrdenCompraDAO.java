package tecsup.edu.pe.daw_ec02.dao;

import tecsup.edu.pe.daw_ec02.model.OrdenCompra;

import java.util.List;

public interface OrdenCompraDAO {
    List<OrdenCompra> listar();
    OrdenCompra buscarPorId(Long nroOrdenC);
    void guardar(OrdenCompra ordenCompra);
    void actualizar(OrdenCompra ordenCompra);
    void eliminar(Long nroOrdenC);
}
