package cl.icap.controlCincoB.service;

import java.util.List;

import cl.icap.controlCincoB.model.dto.EquipoDTO;

public interface EquipoService {

	public List<EquipoDTO> list();
	public EquipoDTO get(Integer equ_codigo);
	public int insert(EquipoDTO equipoDTO);
	public int update(EquipoDTO equipoDTO);
	public int delete(Integer equ_codigo);
}
