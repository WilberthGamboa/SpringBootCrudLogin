package com.example.newanime.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name="anime")
public class Anime {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String nameCapitulo;

    public Anime(){
        
    }
    public Anime(int id, String name, String nameCapitulo) {
        this.id = id;
        this.name = name;
        this.nameCapitulo = nameCapitulo;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getNameCapitulo() {
        return nameCapitulo;
    }
    public void setNameCapitulo(String nameCapitulo) {
        this.nameCapitulo = nameCapitulo;
    }

    
    
}
