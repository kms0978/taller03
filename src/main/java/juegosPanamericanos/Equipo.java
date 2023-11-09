package juegosPanamericanos;

import java.util.ArrayList;
import java.util.List;

public class Equipo {
	Disciplina disciplina;
	private String nombreEquipo;
	private ArrayList<Atleta> atletas;
	private String disciplinaEquipo;



	public Equipo(String nombreEquipo, ArrayList<Atleta> atletas, String disciplinaEquipo) {
		this.nombreEquipo = nombreEquipo;
		this.atletas = atletas;
		this.disciplinaEquipo = disciplinaEquipo;
	}

	public String getNombreEquipo() {
		return this.nombreEquipo;
	}

	public void setNombreEquipo(String nombreEquipo) {
		this.nombreEquipo = nombreEquipo;
	}

	public ArrayList<Atleta> getAtletas() {
		return this.atletas;
	}

	public void setAtletas(ArrayList<Atleta> atletas) {
		this.atletas = atletas;
	}

	public void agregarAtleta(Atleta atleta) {
		atletas.add(atleta);
	}
	public void eliminarAtleta(Atleta atleta) {
		atletas.remove(atleta);
	}
	public void mostrarInfoEquipo() {
		System.out.println("Equipo{" +
				", nombreEquipo='" + nombreEquipo + '\'' +
				", atletas=" + atletas +
				", disciplinaEquipo='" + disciplinaEquipo + '\'' +
				'}');
	}

}