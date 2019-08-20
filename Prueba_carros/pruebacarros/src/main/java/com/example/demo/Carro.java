package com.example.demo;

public class Carro {
	int peso;
	int abcho;
	int largo;
	
	public Carro(int peso, int abcho, int largo) {
		super();
		this.peso = peso;
		this.abcho = abcho;
		this.largo = largo;
	}
	
	
	public int getPeso() {
		return peso;
	}
	public void setPeso(int peso) {
		this.peso = peso;
	}
	public int getAbcho() {
		return abcho;
	}
	public void setAbcho(int abcho) {
		this.abcho = abcho;
	}
	public int getLargo() {
		return largo;
	}
	public void setLargo(int largo) {
		this.largo = largo;
	}
	

}
