package br.com.fiap.Gs.service;
// RM: 99679 - Gustavo Kawamura Christofani
// RM : 99874 - Rafael Carvalho Mattos

import br.com.fiap.Gs.dto.UsuarioDTO;
import br.com.fiap.Gs.model.Usuario;
import br.com.fiap.Gs.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    @Override
    public List<UsuarioDTO> findAll() {
        return usuarioRepository.findAll()
                .stream()
                .map(usuario -> new UsuarioDTO(usuario.getId_usuario_teste(), usuario.getUsuario_name(), usuario.getUsuario_senha()))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<UsuarioDTO> findById(Integer id) {
        Optional<Usuario> usuario = usuarioRepository.findById(id);
        return usuario.map(u -> new UsuarioDTO(u.getId_usuario_teste(), u.getUsuario_name(), u.getUsuario_senha()));
    }

    @Override
    public UsuarioDTO save(UsuarioDTO usuarioDTO) {
        Usuario usuario = new Usuario();
        usuario.setId_usuario_teste(usuarioDTO.getIdUsuario());
        usuario.setUsuario_name(usuarioDTO.getNome());
        usuario.setUsuario_senha(usuarioDTO.getSenha());

        usuario = usuarioRepository.save(usuario);
        return new UsuarioDTO(usuario.getId_usuario_teste(), usuario.getUsuario_name(), usuario.getUsuario_senha());
    }


    @Override
    public void delete(Integer id) {
        usuarioRepository.deleteById(id);
    }
}
