package br.com.fiap.Gs.service;
// RM: 99679 - Gustavo Kawamura Christofani
// RM : 99874 - Rafael Carvalho Mattos

import br.com.fiap.Gs.dto.UsuarioDTO;
import java.util.List;
import java.util.Optional;

public interface UsuarioService {

    List<UsuarioDTO> findAll();
    Optional<UsuarioDTO> findById(Integer id);
    UsuarioDTO save(UsuarioDTO usuarioDTO);
    void delete(Integer id);
}
