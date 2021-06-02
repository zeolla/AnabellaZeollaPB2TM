package ar.edu.unlam.pb2.parcial1.Enumeradores;

import java.util.ArrayList;

public class Videoclub extends Producto{

	
	private ArrayList <Pelicula> peliculas;
	private ArrayList <Libro> libros;
	private ArrayList <Comestible> comestibles;
	private ArrayList <Videojuego> videoJuegos;
	private String nombre;
	
	
	public Videoclub(String nombre) {
		super(nombre, codigo);
		this.nombre=nombre;
		this.peliculas=new ArrayList<Pelicula>();
		this.libros=new ArrayList<Libro>();
		this.comestibles=new ArrayList<Comestible>();
		this.videoJuegos=new ArrayList<Videojuego>();
	}


	@Override
	public void agregarProducto(Producto nuevoProducto) {
		
	}


	public boolean alquilar(Producto nuevoProducto, Cliente nuevoCliente) {
		
		return false;
	}


	public Producto buscarProducto(Producto nuevoProducto) {
	
		return null;
	}


	
	
	
	

}
