package cl.icap.controlCincoB.model.dto;

public class JugadorDTO {

	private Integer jug_rut;
	private String jug_nombre;
	private Integer equ_cod;
	private String equ_nombre;
	private String gol_cantidad;
	
	public Integer getJug_rut() {
		return jug_rut;
	}
	public void setJug_rut(Integer jug_rut) {
		this.jug_rut = jug_rut;
	}
	public String getJug_nombre() {
		return jug_nombre;
	}
	public void setJug_nombre(String jug_nombre) {
		this.jug_nombre = jug_nombre;
	}
	public Integer getEqu_cod() {
		return equ_cod;
	}
	public void setEqu_cod(Integer equ_cod) {
		this.equ_cod = equ_cod;
	}
	public String getEqu_nombre() {
		return equ_nombre;
	}
	public void setEqu_nombre(String equ_nombre) {
		this.equ_nombre = equ_nombre;
	}
	public String getGol_cantidad() {
		return gol_cantidad;
	}
	public void setGol_cantidad(String gol_cantidad) {
		this.gol_cantidad = gol_cantidad;
	}
}
