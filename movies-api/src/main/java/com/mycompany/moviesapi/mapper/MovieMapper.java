package com.mycompany.moviesapi.mapper;

import com.mycompany.moviesapi.model.Movie;
import com.mycompany.moviesapi.rest.dto.AddMovieDto;
import com.mycompany.moviesapi.rest.dto.MovieDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface MovieMapper {

    MovieDto toMovieDto(Movie movie);

    Movie toMovie(AddMovieDto addMovieDto);

}