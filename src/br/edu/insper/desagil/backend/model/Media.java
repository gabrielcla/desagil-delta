package br.edu.insper.desagil.backend.model;

import java.util.HashMap;
import java.util.Map;

public class Media {
	private String name; // só Getter
	private int duration;
	private Map<String,Integer> ratings;
	
	public Media(String name, int duration) {
		this.name = name;
		this.duration = duration;
		this.ratings = new HashMap<>();
	}

	public String getName() {
		return name;
	}
	
	public String getDurationString() {		
		
		if (duration >3600) {
			int h = duration%3600;
			int m = duration%60;
		} else if (t>60 && t<3600) {
			
		} else {
			
		}

		
		return null;
	}
	
	public void putRating(String nome, int avaliacao) {
		this.ratings.put(nome, avaliacao);
	}
	
	public int numberRatings() {
		return ratings.size();
	}
	
	public double averageRatings() {
		if (this.numberRatings() == 0) {
			return 0.0;
		}
		
		double tot = 0.0;
		for (String nome:ratings.keySet()) {
			int nota = ratings.get(nome);
			tot = tot + nota;
		}
		if (ratings.size() != 0) {
			tot = tot/ratings.size();;
		}
		
		return tot;
	}
	
	
}
