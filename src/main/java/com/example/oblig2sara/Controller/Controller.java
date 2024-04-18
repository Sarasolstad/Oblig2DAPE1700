package com.example.oblig2sara.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class Controller {
    public final List<billettkontroll> alleBilletter = new ArrayList<>();
    @PostMapping("/lagre")
    public void lagre(billettkontroll listeUt){
        alleBilletter.add(listeUt);
    }
    @GetMapping("/hentAlle")
    public List<billettkontroll> hentAlle() {
        return alleBilletter;
    }
    @GetMapping("/slettAlle")
    public void setAlleBilletter(){
        alleBilletter.clear();
    }
}
