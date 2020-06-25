package cl.icap.controlCincoB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.controlCincoB.model.dao.EquipoDAO;
import cl.icap.controlCincoB.model.dto.EquipoDTO;

@Service
public class EquipoServiceImpl implements EquipoService {

	@Autowired
	EquipoDAO equipoDAO;
	
	public List<EquipoDTO> list() {
		return equipoDAO.list();
	}

	public EquipoDTO get(Integer equ_codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insert(EquipoDTO equipoDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(EquipoDTO equipoDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int delete(Integer equ_codigo) {
		// TODO Auto-generated method stub
		return 0;
	}
}
