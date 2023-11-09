package juegosPanamericanos;

import java.util.*;

public class Atleta {

	Collection<Equipo> equipo;
	Collection<Disciplina> disciplina;
	private String nombre;
	private String pais;
	private int edad;
	private ArrayList<Disciplina> disciplinas;

	public String getNombre() {
		return this.nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPais() {
		return this.pais;
	}

	/**
	 * 
	 * @param pais
	 */
	public void setPais(String pais) {
		this.pais = pais;
	}

	public int getEdad() {
		return this.edad;
	}

	/**
	 * 
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}

	/**
	 * 
	 * @param disciplina
	 */
	public void agregarDisciplina(Disciplina disciplina) {
		// TODO - implement Atleta.agregarDisciplina
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param disciplina
	 */
	public void eliminarDisciplina(Disciplina disciplina) {
		// TODO - implement Atleta.eliminarDisciplina
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param nombre
	 */
	public String mostrarInfoAtleta(String nombre) {
		// TODO - implement Atleta.mostrarInfoAtleta
		throw new UnsupportedOperationException();
	}

	public Atleta() {
		// TODO - implement Atleta.Atleta
		throw new UnsupportedOperationException();
	}

}