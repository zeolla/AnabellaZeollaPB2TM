package ar.edu.unlam.pb2.parcial1.Enumeradores;

public class Cliente {

	private Integer codigo;
	private String nombre;
	private String apellido;
	private Integer edad;
	
	
	
	public Cliente(Integer codigo, String apellido,  String nombre,Integer edad) {
		this.codigo = codigo;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
	}



	public Integer getCodigo() {
		return codigo;
	}



	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}



	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public String getApellido() {
		return apellido;
	}



	public void setApellido(String apellido) {
		this.apellido = apellido;
	}



	public Integer getEdad() {
		return edad;
	}



	public void setEdad(Integer edad) {
		this.edad = edad;
	}
	
	
	
	
	
	
	
}
