package juegosPanamericanos;
import java.util.*;

public class Atleta {
	Collection<Equipo> equipo;
	Collection<Disciplina> disciplina;
	private String nombre;
	private String pais;
	private int edad;
	private ArrayList<Disciplina> disciplinas;

	public Atleta() {
	}
	public String getNombre() {
		return this.nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPais() {
		return this.pais;
	}
	public void setPais(String pais) {
		this.pais = pais;
	}
	public int getEdad() {
		return this.edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}

	public void agregarDisciplina(Disciplina disciplina) {
	}
	public void eliminarDisciplina(Disciplina disciplina) {
	}
	public String mostrarInfoAtleta(String nombre) {
		String lista = "";
		return lista;
	}


}