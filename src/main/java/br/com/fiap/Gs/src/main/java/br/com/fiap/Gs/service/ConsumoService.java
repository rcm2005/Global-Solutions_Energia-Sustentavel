package br.com.fiap.Gs.service;
// RM: 99679 - Gustavo Kawamura Christofani
// RM : 99874 - Rafael Carvalho Mattos

import br.com.fiap.Gs.dto.ConsumoDTO;
import java.util.List;
import java.util.Optional;

public interface ConsumoService {
    List<ConsumoDTO> findAll();
    Optional<ConsumoDTO> findById(Integer idConsumo); // Alterando para Long
    ConsumoDTO save(ConsumoDTO consumoDTO);
    void delete(Integer idConsumo); // Alterando para Long
}
