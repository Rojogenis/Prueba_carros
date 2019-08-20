package com.example.demo;

public class Camioneta extends Carro {
	int plazas;
	int carga;
	public Camioneta(int peso, int abcho, int largo, int plazas, int carga) {
		super(peso, abcho, largo);
		this.plazas = plazas;
		this.carga = carga;
	}
	public int getPlazas() {
		return plazas;
	}
	public void setPlazas(int plazas) {
		this.plazas = plazas;
	}
	public int getCarga() {
		return carga;
	}
	public void setCarga(int carga) {
		this.carga = carga;
	}
	@Override
	public String toString() {
		return "Camioneta [plazas=" + plazas + ", carga=" + carga + ", peso=" + peso + ", abcho=" + abcho + ", largo="
				+ largo + ", getPlazas()=" + getPlazas() + ", getCarga()=" + getCarga() + ", getPeso()=" + getPeso()
				+ ", getAbcho()=" + getAbcho() + ", getLargo()=" + getLargo() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}
