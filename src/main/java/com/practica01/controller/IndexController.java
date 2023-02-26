package com.practica01.controller;
import com.practica01.domain.Estados;
import com.practica01.service.EstadosService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 *
 * @author Usuario
 */
@Slf4j
@Controller
public class IndexController {
    @Autowired
    //EstadosDao estadosDao;
    EstadosService EstadosService;
    @RequestMapping("/")
    public String inicio(Model model) {
        log.info("Utilizando MVC");
        var estados = EstadosService.getEstados();
        model.addAttribute("estados", estados);
        return "index";
    }
    @GetMapping("/nuevoEstado")
    public String nuevoEstado(Estados estados) {
        return "modificarEstado";
    }
    @PostMapping("/guardarEstados")
    public String guardarEstados(Estados estados) {
        EstadosService.save(estados);
        return "redirect:/";
    }
    @GetMapping("/modificarEstado/{idEstado}")
    public String modificarEstados(Estados estados, Model model) {
        estados = EstadosService.getEstados(estados);
        model.addAttribute("estados", estados);
        return "modificarEstado";
    }
    @GetMapping("/eliminarEstado/{idEstado}")
    public String eliminarEstado(Estados estados) {
        EstadosService.delete(estados);
        return "redirect:/";
    }
}
