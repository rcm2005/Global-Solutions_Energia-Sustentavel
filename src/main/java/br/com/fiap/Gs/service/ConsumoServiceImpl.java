package br.com.fiap.Gs.service;
// RM: 99679 - Gustavo Kawamura Christofani
// RM : 99874 - Rafael Carvalho Mattos

import br.com.fiap.Gs.dto.ConsumoDTO;
import br.com.fiap.Gs.model.Consumo;
import br.com.fiap.Gs.repository.ConsumoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class ConsumoServiceImpl implements ConsumoService {

    @Autowired
    private ConsumoRepository consumoRepository;

    @Override
    public List<ConsumoDTO> findAll() {
        return consumoRepository.findAll()
                .stream()
                .map(consumo -> new ConsumoDTO(
                        consumo.getIdConsumo(),
                        consumo.getNomeUsuario(),
                        consumo.getConsumoKwh(),
                        consumo.getDataConsumo(),
                        consumo.getNomeEquipamento(),
                        consumo.getNomeDistribuidora()
                ))
                .collect(Collectors.toList());
    }

    @Override
    public Optional<ConsumoDTO> findById(Integer idConsumo) {
        Optional<Consumo> consumoOpt = consumoRepository.findById(idConsumo);
        return consumoOpt.map(consumo -> new ConsumoDTO(
                consumo.getIdConsumo(),
                consumo.getNomeUsuario(),
                consumo.getConsumoKwh(),
                consumo.getDataConsumo(),
                consumo.getNomeEquipamento(),
                consumo.getNomeDistribuidora()
        ));
    }

    @Override
    public ConsumoDTO save(ConsumoDTO consumoDTO) {
        Consumo consumo = new Consumo();
        consumo.setIdConsumo(consumoDTO.getIdConsumo());
        consumo.setNomeUsuario(consumoDTO.getNomeUsuario());
        consumo.setConsumoKwh(consumoDTO.getConsumoKwh());
        consumo.setDataConsumo(consumoDTO.getDataConsumo());
        consumo.setNomeEquipamento(consumoDTO.getNomeEquipamento());
        consumo.setNomeDistribuidora(consumoDTO.getNomeDistribuidora());

        Consumo consumoSalvo = consumoRepository.save(consumo);
        return new ConsumoDTO(
                consumoSalvo.getIdConsumo(),
                consumoSalvo.getNomeUsuario(),
                consumoSalvo.getConsumoKwh(),
                consumoSalvo.getDataConsumo(),
                consumoSalvo.getNomeEquipamento(),
                consumoSalvo.getNomeDistribuidora()
        );
    }

    @Override
    public void delete(Integer idConsumo) {
        consumoRepository.deleteById(idConsumo);
    }
}
