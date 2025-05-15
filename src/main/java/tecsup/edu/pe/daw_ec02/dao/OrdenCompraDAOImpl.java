package tecsup.edu.pe.daw_ec02.dao;

import org.springframework.stereotype.Repository;
import tecsup.edu.pe.daw_ec02.model.OrdenCompra;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class OrdenCompraDAOImpl implements OrdenCompraDAO {

    private final Map<Long, OrdenCompra> baseDatos = new HashMap<>();
    private long idActual = 1;

    @Override
    public List<OrdenCompra> listar() {
        return new ArrayList<>(baseDatos.values());
    }

    @Override
    public OrdenCompra buscarPorId(Long nroOrdenC) {
        return baseDatos.get(nroOrdenC);
    }

    @Override
    public void guardar(OrdenCompra ordenCompra) {
        ordenCompra.setNroOrdenC(idActual++);
        baseDatos.put(ordenCompra.getNroOrdenC(), ordenCompra);
    }

    @Override
    public void actualizar(OrdenCompra ordenCompra) {
        baseDatos.put(ordenCompra.getNroOrdenC(), ordenCompra);
    }

    @Override
    public void eliminar(Long nroOrdenC) {
        baseDatos.remove(nroOrdenC);
    }
}
