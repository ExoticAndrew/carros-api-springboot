package Acoes.Andrew.Carro;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Carros")
@RequiredArgsConstructor  
public class CarroController {

    private final CarroService carroService; 

    @PostMapping
    public void salvar(@RequestBody Carro carro) {
        carroService.salvar(carro);  
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        carroService.deletar(id);  
    }

    @GetMapping("/{id}")
    public Carro buscarPorId(@PathVariable Long id) {
        return carroService.buscarPorId(id);  
    }

    @PutMapping("/{id}")
    public Carro atualizar(@PathVariable Long id, @RequestBody Carro novoCarro){
        return carroService.atualizar(id, novoCarro);  
    }
}
