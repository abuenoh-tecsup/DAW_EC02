package tecsup.edu.pe.daw_ec02.service;

import org.springframework.stereotype.Service;
import tecsup.edu.pe.daw_ec02.dao.LaboratorioDAO;
import tecsup.edu.pe.daw_ec02.dao.OrdenCompraDAO;
import tecsup.edu.pe.daw_ec02.dto.OrdenCompraDTO;
import tecsup.edu.pe.daw_ec02.model.Laboratorio;
import tecsup.edu.pe.daw_ec02.model.OrdenCompra;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OrdenCompraServiceImpl implements OrdenCompraService {

    private final OrdenCompraDAO ordenCompraDAO;
    private final LaboratorioDAO laboratorioDAO;

    public OrdenCompraServiceImpl(OrdenCompraDAO ordenCompraDAO, LaboratorioDAO laboratorioDAO) {
        this.ordenCompraDAO = ordenCompraDAO;
        this.laboratorioDAO = laboratorioDAO;
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
    public void crear(OrdenCompra orden) {
        Laboratorio lab = laboratorioDAO.buscarPorId(orden.getCodLab());
        if (lab == null) {
            throw new IllegalArgumentException("No existe laboratorio con codLab = " + orden.getCodLab());
        }
        ordenCompraDAO.guardar(orden);
    }

    @Override
    public void actualizar(OrdenCompra orden) {
        Laboratorio lab = laboratorioDAO.buscarPorId(orden.getCodLab());
        if (lab == null) {
            throw new IllegalArgumentException("No existe laboratorio con codLab = " + orden.getCodLab());
        }
        ordenCompraDAO.actualizar(orden);
    }

    @Override
    public void eliminar(Long nroOrdenC) {
        ordenCompraDAO.eliminar(nroOrdenC);
    }

    @Override
    public OrdenCompraDTO obtenerConLaboratorio(long nroOrdenC) {
        OrdenCompra orden = ordenCompraDAO.buscarPorId(nroOrdenC);
        if (orden == null) return null;

        Laboratorio lab = laboratorioDAO.buscarPorId(orden.getCodLab());

        OrdenCompraDTO dto = new OrdenCompraDTO();
        dto.setNroOrdenC(orden.getNroOrdenC());
        dto.setFechaEmision(orden.getFechaEmision());
        dto.setSituacion(orden.getSituacion());
        dto.setTotal(orden.getTotal());
        dto.setNroFacturaProv(orden.getNroFacturaProv());
        dto.setLaboratorio(lab);

        return dto;
    }

    @Override
    public List<OrdenCompra> listarPorLaboratorio(long codLab) {
        return ordenCompraDAO.listar().stream()
                .filter(o -> o.getCodLab() == codLab)
                .collect(Collectors.toList());
    }

}
