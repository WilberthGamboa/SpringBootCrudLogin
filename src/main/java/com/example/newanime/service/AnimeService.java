package com.example.newanime.service;

import java.util.List;
import java.util.Optional;

import com.example.newanime.interfaceService.IAnimeService;
import com.example.newanime.interfaces.IAnime;
import com.example.newanime.modelo.Anime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class AnimeService implements IAnimeService {
    @Autowired
    private IAnime data;
    @Override
    public List<Anime> listar() {
        // TODO Auto-generated method stub
        return (List<Anime>)data.findAll();
    }

    @Override
    public Optional<Anime> listarId(int id) {
        // TODO Auto-generated method stub
        return data.findById(id);
    }

    @Override
    public int save(Anime p) {
        int res=0;
        Anime anime=data.save(p);
        if(!anime.equals(null)){
            res=1;
        }
        // TODO Auto-generated method stub
        return res;
    }

    @Override
    public void delete(int id) {
        // TODO Auto-generated method stub
        data.deleteById(id);
        
    }
    
}
