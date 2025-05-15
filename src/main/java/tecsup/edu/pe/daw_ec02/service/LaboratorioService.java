package tecsup.edu.pe.daw_ec02.service;

import tecsup.edu.pe.daw_ec02.model.Laboratorio;

import java.util.List;

public interface LaboratorioService {
    List<Laboratorio> listar();
    Laboratorio obtener(Long codLab);
    void crear(Laboratorio laboratorio);
    void actualizar(Laboratorio laboratorio);
    void eliminar(Long codLab);
}
