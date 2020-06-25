package cl.icap.controlCincoB.service;

import java.util.List;

import cl.icap.controlCincoB.model.dto.JugadorDTO;

public interface JugadorService {
	
	public List<JugadorDTO> list();
	public JugadorDTO get(Integer jug_rut);
	public int insert(JugadorDTO jugadorDTO);
	public int update(JugadorDTO jugadorDTO);
	public int delete(Integer jug_rut);
}
