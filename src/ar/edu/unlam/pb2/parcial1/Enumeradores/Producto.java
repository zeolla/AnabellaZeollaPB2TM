package ar.edu.unlam.pb2.parcial1.Enumeradores;

public abstract class Producto {

	private String nombre;
	protected Integer codigo;
	private Estado estado;
	private Cliente poseedor;
	
	
	public Producto(String nombre, Integer codigo) {
		this.nombre = nombre;
		this.codigo=codigo;
		this.estado=Estado.DISPONIBLE;
		
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public Estado getEstadoActual() {
		return this.estado;
	}
	
	
	public abstract void agregarProducto(Producto nuevoProducto);
	
	

	public Cliente getQuienPoseeElProducto() {
		
		return null;
	}
		
		
	
	
	
	
}
