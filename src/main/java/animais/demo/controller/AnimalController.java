package animais.demo.controller;

import animais.demo.model.Animal;
import animais.demo.service.AnimalService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/animais")
public class AnimalController {

    private final AnimalService service;

    public AnimalController(AnimalService service) {
        this.service = service;
    }

    @GetMapping
    public String listar(Model model) {
        model.addAttribute("animais", service.listarTodos());
        return "lista";
    }

    @GetMapping("/novo")
    public String novo(Model model) {
        model.addAttribute("animal", new Animal());
        return "formulario";
    }

    @PostMapping("/salvar")
    public String salvar(@Valid @ModelAttribute("animal") Animal animal,
                         BindingResult result) {
        if (result.hasErrors()) {
            return "formulario";
        }

        service.salvar(animal);
        return "redirect:/animais";
    }

    @GetMapping("/editar/{id}")
    public String editar(@PathVariable Long id, Model model) {
        Animal animal = service.buscarPorId(id).orElseThrow();
        model.addAttribute("animal", animal);
        return "formulario";
    }

    @GetMapping("/excluir/{id}")
    public String excluir(@PathVariable Long id) {
        service.excluir(id);
        return "redirect:/animais";
    }
}
