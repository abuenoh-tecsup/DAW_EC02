package tecsup.edu.pe.daw_ec02.service;

import org.springframework.stereotype.Service;
import tecsup.edu.pe.daw_ec02.dao.OrdenCompraDAO;
import tecsup.edu.pe.daw_ec02.model.OrdenCompra;

import java.util.List;

@Service
public class OrdenCompraServiceImpl implements OrdenCompraService {

    private final OrdenCompraDAO ordenCompraDAO;

    public OrdenCompraServiceImpl(OrdenCompraDAO ordenCompraDAO) {
        this.ordenCompraDAO = ordenCompraDAO;
    }

    @Override
    public List<OrdenCompra> listar() {
        return ordenCompraDAO.listar();
    }

    @Override
    public OrdenCompra obtener(Long nroOrdenC) {
        return ordenCompraDAO.buscarPorId(nroOrdenC);
    }

    @Override
    public void crear(OrdenCompra ordenCompra) {
        ordenCompraDAO.guardar(ordenCompra);
    }

    @Override
    public void actualizar(OrdenCompra ordenCompra) {
        ordenCompraDAO.actualizar(ordenCompra);
    }

    @Override
    public void eliminar(Long nroOrdenC) {
        ordenCompraDAO.eliminar(nroOrdenC);
    }
}
