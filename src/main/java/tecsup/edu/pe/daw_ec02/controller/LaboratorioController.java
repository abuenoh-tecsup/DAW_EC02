package tecsup.edu.pe.daw_ec02.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tecsup.edu.pe.daw_ec02.model.Laboratorio;
import tecsup.edu.pe.daw_ec02.service.LaboratorioService;

import java.util.List;

@RestController
@RequestMapping("/laboratorios")
public class LaboratorioController {

    private final LaboratorioService laboratorioService;

    @Autowired
    public LaboratorioController(LaboratorioService laboratorioService) {
        this.laboratorioService = laboratorioService;
    }

    @GetMapping
    public List<Laboratorio> listar() {
        return laboratorioService.listar();
    }

    @GetMapping("/{id}")
    public Laboratorio buscar(@PathVariable Long id) {
        return laboratorioService.obtener(id);
    }

    @PostMapping
    public void crear(@RequestBody Laboratorio laboratorio) {
        laboratorioService.crear(laboratorio);
    }

    @PutMapping("/{id}")
    public void actualizar(@PathVariable Long id, @RequestBody Laboratorio laboratorio) {
        laboratorio.setCodLab(id);
        laboratorioService.actualizar(laboratorio);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        laboratorioService.eliminar(id);
    }
}
