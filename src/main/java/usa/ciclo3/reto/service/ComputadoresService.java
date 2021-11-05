/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usa.ciclo3.reto.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import usa.ciclo3.reto.model.Computadores;
import usa.ciclo3.reto.repository.crud.ComputadoresRepository;

/**
 *
 * @author jacke
 */
@Service
public class ComputadoresService {
    @Autowired
    private ComputadoresRepository computadoresRepository;
    public List<Computadores>getAll(){
        return computadoresRepository.getAll();
    }
    public Optional<Computadores> getComputadores(int id){
        return computadoresRepository.getComputadores(id);
    }
    public Computadores save (Computadores p){
        if (p.getId()==null){
            return computadoresRepository.save(p);
        }else{
            Optional<Computadores> paux=computadoresRepository.getComputadores(p.getId());
            if(paux.equals(p)){
                return computadoresRepository.save(p);
            }else{
                return p;
            }
        }
    }
}
