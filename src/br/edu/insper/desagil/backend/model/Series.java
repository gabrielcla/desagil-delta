package br.edu.insper.desagil.backend.model;

import java.util.List;

public class Series extends Collection {
	private List<Movie> episodes; 

	public Series(String title, List<Movie> episodes) {
		super(title);
		this.episodes = episodes;
	}

	public List<Movie> getEpisodes() {
		return episodes;
	}
	
	public double seasonRating(int temporada){
		return 0.0;
	}
}
