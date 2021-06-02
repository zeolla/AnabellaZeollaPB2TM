package ar.edu.unlam.pb2.parcial1.Enumeradores;

import java.util.ArrayList;

public class Pelicula implements Vendible, Alquilable{

	
	private Integer codigo;
	private String descripcion;
	private Genero genero;
	private Integer añoEstreno;
	private String director;
	private String  actores [];
	private Double precioVenta;
	private Double precioAlquiler;
	
	
	public Pelicula(Integer codigo, String descripcion, Genero genero,Integer añoEstreno, String director) {
		this.codigo=codigo;
		this.descripcion=descripcion;
		this.genero=genero;
		this.añoEstreno=añoEstreno;
		this.director=director;
		this.actores=new String [50];
		this.precioVenta=precioVenta;
		this.precioAlquiler=precioAlquiler;
	}


	public Integer getCodigo() {
		return codigo;
	}


	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public Genero getGenero() {
		return genero;
	}


	public void setGenero(Genero genero) {
		this.genero = genero;
	}


	public Integer getAñoEstreno() {
		return añoEstreno;
	}


	public void setAñoEstreno(Integer añoEstreno) {
		this.añoEstreno = añoEstreno;
	}


	public String getDirector() {
		return director;
	}


	public void setDirector(String director) {
		this.director = director;
	}


	public void agregarActor(String nombre) {
		
		for(int i=0; i<actores.length; i++) {
			actores[i]=nombre;
			
		}
		
 		
	}


	public Boolean actua(String nombre) {
	
		for(int i=0; i<actores.length; i++) {
			if(actores[i].equals(nombre)) {
				return true;
			}
		}
		
		return false;
	}


	@Override
	public Double getPrecioVenta() {
		
		return this.precioVenta;
	}



	@Override
	public void setPrecioVenta(Double precio) {
	this.precioVenta=precio;
		
	}


	@Override
	public void setPrecioAlquiler(Double precio) {
		this.precioAlquiler=precio;
		
	}


	@Override
	public Double getPrecioAlquiler() {
		
		return this.precioAlquiler;
	}




	
	
	

}
