package br.com.alura.screenmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonProperty;

@jsonIgnoreProperties(ignoreUnknow = true)

public class DadosSeries {@com.fasterxml.jackson.annotation.JsonAlias("Title") String Titulo;
                         @JsonAlias("totalSeasons")  Integer totalTemporadas;
                          @JsonAlias("imdbRating")  String avaliacao;
                          @JsonProperty("imdbVotes") String votos; {

}
}