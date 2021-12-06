package com.example.newanime.interfaces;

import com.example.newanime.modelo.Anime;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface IAnime extends CrudRepository <Anime,Integer> {
    
}
