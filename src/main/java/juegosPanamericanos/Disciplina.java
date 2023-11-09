package juegosPanamericanos;

import java.util.*;

public class Disciplina {

	Collection<Equipo> equipo;
	Collection<Atleta> atleta;
	private String nombreDisciplina;
	private int num_participantes;
	private double recordMundial;

	public String getNombreDisciplina() {
		return this.nombreDisciplina;
	}

	/**
	 * 
	 * @param nombreDisciplina
	 */
	public void setNombreDisciplina(String nombreDisciplina) {
		this.nombreDisciplina = nombreDisciplina;
	}

	public int getNum_participantes() {
		return this.num_participantes;
	}

	/**
	 * 
	 * @param num_participantes
	 */
	public void setNum_participantes(int num_participantes) {
		this.num_participantes = num_participantes;
	}

	public double getRecordMundial() {
		return this.recordMundial;
	}

	/**
	 * 
	 * @param recordMundial
	 */
	public void setRecordMundial(double recordMundial) {
		this.recordMundial = recordMundial;
	}

	public void mostrarInfoDisciplina() {
		// TODO - implement Disciplina.mostrarInfoDisciplina
		throw new UnsupportedOperationException();
	}

	public Disciplina() {
		// TODO - implement Disciplina.Disciplina
		throw new UnsupportedOperationException();
	}

}