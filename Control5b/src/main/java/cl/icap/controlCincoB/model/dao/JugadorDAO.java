package cl.icap.controlCincoB.model.dao;

import java.util.List;

import cl.icap.controlCincoB.model.dto.JugadorDTO;

public interface JugadorDAO {

	public List<JugadorDTO> list();
	public JugadorDTO get(Integer jug_rut);
	public int insert(JugadorDTO jugadorDTO);
	public int update(JugadorDTO jugadorDTO);
	public int delete(Integer jug_rut);
}
