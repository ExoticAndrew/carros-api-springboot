package Acoes.Andrew.Carro;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CarroService {
    private final CarroRepository carroRepository;

    public void salvar(Carro carro) {
        carroRepository.save(carro);
    }

    public Carro buscarPorId(Long id) {
        return carroRepository.findById(id).orElseThrow(() -> new IllegalArgumentException("Carro não encontrado"));

    }

    public Carro atualizar(Long id, Carro novocarro) {
        Carro carro = buscarPorId(id);
        carro.setModelo(novocarro.getModelo());
        carro.setMarca(novocarro.getMarca());
        carro.setAno(novocarro.getAno());
        return carroRepository.save(carro);
    }

    public void deletar(Long id) {
        carroRepository.deleteById(id);

    }
}
