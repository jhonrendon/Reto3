/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usa.ciclo3.reto.web;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import usa.ciclo3.reto.model.Computadores;
import usa.ciclo3.reto.service.ComputadoresService;

/**
 *
 * @author jacke
 */
@RestController
@RequestMapping("/api/Computadores")
@CrossOrigin(origins="*",methods={RequestMethod.GET,RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
public class ComputadoresController {
    
    @Autowired
    private ComputadoresService computadoresService;
    
    @GetMapping("/all")
    public List<Computadores> getComputadores(){
        return computadoresService.getAll();
        
    }
    @GetMapping ("/{id}")
    public Optional<Computadores> getComputadores(@PathVariable("id") int id){
        return computadoresService.getComputadores(id);
    
    
    }
    
    
    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Computadores save(@RequestBody Computadores p){
        return computadoresService.save(p);
    }
}
