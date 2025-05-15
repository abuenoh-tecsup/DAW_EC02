package tecsup.edu.pe.daw_ec02.dao;

import tecsup.edu.pe.daw_ec02.model.Laboratorio;

import java.util.List;

public interface LaboratorioDAO {
    List<Laboratorio> listar();
    Laboratorio buscarPorId(Long codLab);
    void guardar(Laboratorio laboratorio);
    void actualizar(Laboratorio laboratorio);
    void eliminar(Long codLab);
}
