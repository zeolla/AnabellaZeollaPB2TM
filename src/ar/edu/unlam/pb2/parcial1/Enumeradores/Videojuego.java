package ar.edu.unlam.pb2.parcial1.Enumeradores;

public class Videojuego implements Alquilable{

	private Integer codigo;
	private String descripcion;
	private TipoDeConsola tipo;
	private Double precioAlquiler;
	
	
	public Videojuego(Integer codigo, String descripcion, TipoDeConsola tipo) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.tipo = tipo;
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


	public TipoDeConsola getTipo() {
		return tipo;
	}


	public void setTipo(TipoDeConsola tipo) {
		this.tipo = tipo;
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
