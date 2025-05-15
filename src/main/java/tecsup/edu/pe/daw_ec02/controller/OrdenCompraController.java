package tecsup.edu.pe.daw_ec02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tecsup.edu.pe.daw_ec02.dto.OrdenCompraDTO;
import tecsup.edu.pe.daw_ec02.model.OrdenCompra;
import tecsup.edu.pe.daw_ec02.service.OrdenCompraService;

import java.util.List;

@RestController
@RequestMapping("/ordenes")
public class OrdenCompraController {

    private final OrdenCompraService ordenCompraService;

    @Autowired
    public OrdenCompraController(OrdenCompraService ordenCompraService) {
        this.ordenCompraService = ordenCompraService;
    }

    @GetMapping
    public List<OrdenCompra> listar() {
        return ordenCompraService.listar();
    }

    @GetMapping("/{id}")
    public OrdenCompra buscar(@PathVariable Long id) {
        return ordenCompraService.obtener(id);
    }

    @GetMapping("/{id}/con-laboratorio")
    public OrdenCompraDTO obtenerConLaboratorio(@PathVariable("id") long id) {
        return ordenCompraService.obtenerConLaboratorio(id);
    }

    @GetMapping("/laboratorio/{codLab}")
    public List<OrdenCompra> listarPorLaboratorio(@PathVariable long codLab) {
        return ordenCompraService.listarPorLaboratorio(codLab);
    }


    @PostMapping
    public void crear(@RequestBody OrdenCompra ordenCompra) {
        ordenCompraService.crear(ordenCompra);
    }

    @PutMapping("/{id}")
    public void actualizar(@PathVariable Long id, @RequestBody OrdenCompra ordenCompra) {
        ordenCompra.setNroOrdenC(id);
        ordenCompraService.actualizar(ordenCompra);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        ordenCompraService.eliminar(id);
    }

}
