package juegosPanamericanos;

import java.util.*;

public class Disciplina {

	//Collection<Equipo> equipo;
	//Collection<Atleta> atleta;
	private String nombreDisciplina;
	private int num_participantes;
	private double recordMundial;

	public String getNombreDisciplina() {
		return this.nombreDisciplina;
	}
	public void setNombreDisciplina(String nombreDisciplina) {
		this.nombreDisciplina = nombreDisciplina;
	}
	public int getNum_participantes() {
		return this.num_participantes;
	}

	public void setNum_participantes(int num_participantes) {
		this.num_participantes = num_participantes;
	}
	public double getRecordMundial() {
		return this.recordMundial;
	}
	public void setRecordMundial(double recordMundial) {
		this.recordMundial = recordMundial;
	}
	public void mostrarInfoDisciplina() {
		System.out.println("Disciplina{" +
				"nombreDisciplina='" + nombreDisciplina + '\'' +
				", num_participantes=" + num_participantes +
				", recordMundial=" + recordMundial +
				'}');
	}

	public Disciplina(String nombreDisciplina, int num_participantes, double recordMundial) {
		this.nombreDisciplina = nombreDisciplina;
		this.num_participantes = num_participantes;
		this.recordMundial = recordMundial;
	}
}