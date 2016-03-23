package it.polito.tdp.lab3.model;

import java.util.*;

public class Insegnamento {
	private String codice;
	private int crediti;
	private String nome; 
	private int periodo;
	private List<Studente> iscritti;
	
	public Insegnamento(String codice, int crediti, String nome, int periodo) {
		this.codice = codice;
		this.crediti = crediti;
		this.nome = nome;
		this.periodo = periodo;
		iscritti = new LinkedList<Studente>();
	}
	
	
}
