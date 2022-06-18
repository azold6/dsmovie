package com.devsuperior.dsmovie.controllers;

import com.devsuperior.dsmovie.dto.MovieDTO;
import com.devsuperior.dsmovie.services.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/movies")
public class MovieController {

    @Autowired
    private MovieService movieService;

    //Resposta paginada
    @GetMapping
    public Page<MovieDTO> findAll(Pageable pageable){
        return movieService.findAll(pageable);
    }

    @GetMapping("/{id}")
    public MovieDTO findById(@PathVariable Long id){
        return movieService.findById(id);
    }
}
