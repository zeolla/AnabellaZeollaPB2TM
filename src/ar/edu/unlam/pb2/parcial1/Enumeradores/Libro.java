package ar.edu.unlam.pb2.parcial1.Enumeradores;

public class Libro implements Vendible{

	private Integer codigo;
	private String descripcion;
	private String autor;
	private String editorial;
	private Double precio;
	
	
	public Libro(Integer codigo, String descripcion, String autor, String editorial) {
		this.codigo = codigo;
		this.descripcion = descripcion;
		this.autor = autor;
		this.editorial = editorial;
		this.precio=precio;
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



	public String getAutor() {
		return autor;
	}



	public void setAutor(String autor) {
		this.autor = autor;
	}



	public String getEditorial() {
		return editorial;
	}



	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}



	@Override
	public Double getPrecioVenta() {
	
		return this.precio;
	}



	@Override
	public void setPrecioVenta(Double precio) {
		this.precio=precio;
		
	}
	
	
	
	
	
	
	
}
