package juegosPanamericanos;

import java.util.ArrayList;
import java.util.List;

public class Evento {

	private Disciplina disciplina;
	private String fecha;
	private String tipo;

	public Evento(Disciplina disciplina, String fecha, String tipo) {
		this.disciplina = disciplina;
		this.fecha = fecha;
		this.tipo = tipo;
	}

	public boolean esEnEquipo(String tipo) {
		boolean resultado = false;
		if (tipo == "individual") {
			resultado = false;
		} else if (tipo == "equipo") {
			resultado = true;
		}
		return resultado;
	}

	public void agregarAtleta(Atleta atleta) {

	}
	public void eliminarAtleta(Atleta atleta) {

	}
	public void mostrarInfoEvento() {
		System.out.println("Evento{" +
				"disciplina=" + disciplina +
				", fecha='" + fecha + '\'' +
				", tipo='" + tipo + '\'' +
				'}');
	}

}