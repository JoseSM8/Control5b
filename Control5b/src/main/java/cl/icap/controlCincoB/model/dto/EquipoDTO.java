package cl.icap.controlCincoB.model.dto;

public class EquipoDTO {

	private Integer equ_codigo;
	private String equ_nombre;
	private Integer gol_cantidad;
	
	public Integer getEqu_codigo() {
		return equ_codigo;
	}
	public void setEqu_codigo(Integer equ_codigo) {
		this.equ_codigo = equ_codigo;
	}
	public String getEqu_nombre() {
		return equ_nombre;
	}
	public void setEqu_nombre(String equ_nombre) {
		this.equ_nombre = equ_nombre;
	}
	public Integer getGol_cantidad() {
		return gol_cantidad;
	}
	public void setGol_cantidad(Integer gol_cantidad) {
		this.gol_cantidad = gol_cantidad;
	}
}
