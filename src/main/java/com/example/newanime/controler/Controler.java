package com.example.newanime.controler;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import com.example.newanime.interfaceService.IAnimeService;
import com.example.newanime.modelo.Anime;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;



@Controller
@RequestMapping
public class Controler {
    @Autowired
    private IAnimeService service;
   @GetMapping("/")
    public String listar(Model model){

        List<Anime>animes=service.listar();
        model.addAttribute("animes", animes);

        return "index";

    }


    @GetMapping("/new")
	public String nuevo(Model model) {
		model.addAttribute("anime", new Anime());
		return "form";
	}

	@PostMapping("/save")
	public String save(@Valid Anime p,Model model) {
		service.save(p);
		
		return "redirect:/";
	}

	@GetMapping("/editar/{id}")
	public String editar(@PathVariable int id,Model model){
		Optional<Anime>anime=service.listarId(id);
		model.addAttribute("anime", anime);
		return"form";
	}

	@GetMapping("/eliminar/{id}")
	public String eliminar(@PathVariable int id,Model model) {
		service.delete(id);
		return "redirect:/";
	}



	
    
}
