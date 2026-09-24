package br.com.guilherme.app.catalagojogos.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.guilherme.app.catalagojogos.model.Catalago;
import br.com.guilherme.app.catalagojogos.repository.CatalagoRepository;

@Controller 
public class CatalagoController {
    private final CatalagoRepository repository;

    public CatalagoController(CatalagoRepository repository){
        this.repository=repository;
    }

    @GetMapping("/")
    public String incio(){
        return "redirect:/catalagos";
    }

    @GetMapping("/catalagos")
    public String lista(Model model){//Cria e salva o catálago
        model.addAttribute("catalagos", repository.findAll());
        model.addAttribute("novoCatalago", new Catalago());
        return "catalagos";
    }

    @PostMapping("/catalagos")
    public String salvar(@ModelAttribute Catalago catalago){
        repository.save(catalago);
        return "redirect:/catalagos";
    }

    @GetMapping("/catalagos/deletar/{id}")
    public String deletar(@PathVariable Long id){
        repository.deleteById(id);
        return "redirect:/catalagos";
    }

   @GetMapping("/catalagos/pesquisatitulo")
        public String pesquisarTitulo(
            @RequestParam String titulo,
            Model model) {

        model.addAttribute("catalagos", repository.findByTitulo(titulo));
        model.addAttribute("novoCatalago", new Catalago());

        return "catalagos";
    }   
}
