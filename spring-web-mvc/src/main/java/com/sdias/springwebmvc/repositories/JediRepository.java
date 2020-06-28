package com.sdias.springwebmvc.repositories;

import com.sdias.springwebmvc.model.Jedi;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class JediRepository {
    private List<Jedi> jedi;

    public  JediRepository(){
        jedi = new ArrayList<>();
        jedi.add(new Jedi("Luke", "Skywallker"));
    }

    public List<Jedi> getAllJedi(){
        return this.jedi;
    }

    public void add(Jedi jedi) {
        this.jedi.add(jedi);
    }
}
