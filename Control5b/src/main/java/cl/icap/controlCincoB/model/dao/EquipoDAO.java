package cl.icap.controlCincoB.model.dao;

import java.util.List;

import cl.icap.controlCincoB.model.dto.EquipoDTO;

public interface EquipoDAO {
	
	public List<EquipoDTO> list();
	public EquipoDTO get(Integer equ_codigo);
	public int insert(EquipoDTO equipoDTO);
	public int update(EquipoDTO equipoDTO);
	public int delete(Integer equ_codigo);
}
