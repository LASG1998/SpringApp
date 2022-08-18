package com.example.SpringApp.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="alumno")
public class Alumno {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String nombre;
	private int redes;
	private int bd;
	private int calculo;
	private int d_web;
	

	private int prom;
	private String coord;
	
	public Alumno() {
		// TODO Auto-generated constructor stub
	}
	

	public Alumno(int id, String nombre, int redes, int bd, int calculo, int prom, String coord, int d_web) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.redes = redes;
		this.bd = bd;
		this.calculo = calculo;
		this.d_web = d_web;
		this.prom = prom;
		this.coord = coord;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getRedes() {
		return redes;
	}

	public void setRedes(int redes) {
		this.redes = redes;
	}


	public int getBd() {
		return bd;
	}

	public void setBd(int bd) {
		this.bd = bd;
	}

	public int getCalculo() {
		return calculo;
	}

	public void setCalculo(int calculo) {
		this.calculo = calculo;
	}

	public int getD_web() {
		return d_web;
	}


	public void setD_web(int d_web) {
		this.d_web = d_web;
	}

	public int getProm() {
		prom= (redes+bd+calculo+d_web)/4;
		return prom;
	}

	public void setProm(int prom) {
		prom= (redes+bd+calculo+d_web)/4;
		this.prom = prom;
	}

	public String getCoord() {
		return coord;
	}

	public void setCoord(String coord) {
		this.coord = coord;
	}
	

}
