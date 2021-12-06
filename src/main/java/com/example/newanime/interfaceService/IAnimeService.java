package com.example.newanime.interfaceService;

import java.util.List;
import java.util.Optional;

import com.example.newanime.modelo.Anime;

public interface IAnimeService {
    public List<Anime>listar();
    public Optional<Anime>listarId(int id);
    public int save(Anime p);
    public void delete(int id);
    
}
