package animais.demo.service;

import animais.demo.model.Animal;
import animais.demo.repository.AnimalRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AnimalService {

    private final AnimalRepository repository;

    public AnimalService(AnimalRepository repository) {
        this.repository = repository;
    }

    public Animal salvar(Animal animal) {
        return repository.save(animal);
    }

    public List<Animal> listarTodos() {
        return repository.findAll();
    }

    public Optional<Animal> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public void excluir(Long id) {
        repository.deleteById(id);
    }
}
