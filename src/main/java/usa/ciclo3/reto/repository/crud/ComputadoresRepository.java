/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usa.ciclo3.reto.repository.crud;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import usa.ciclo3.reto.model.Computadores;

/**
 *
 * @author jacke
 */

@Repository
public class ComputadoresRepository {
    @Autowired
    private ComputadoresCrudRepository computadoresCrudRepository;
    
    public List<Computadores> getAll(){
        return (List<Computadores>)computadoresCrudRepository.findAll();
    }
    public Optional<Computadores> getComputadores(int id){
        return computadoresCrudRepository.findById(id);
    }
    public Computadores save(Computadores p){
        return computadoresCrudRepository.save(p);
    }
}
