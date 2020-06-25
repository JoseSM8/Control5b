package cl.icap.controlCincoB.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.icap.controlCincoB.model.dao.JugadorDAO;
import cl.icap.controlCincoB.model.dto.JugadorDTO;

@Service
public class JugadorServiceImpl implements JugadorService {
	
	@Autowired
	JugadorDAO jugadorDAO;

	public List<JugadorDTO> list() {
		return jugadorDAO.list();
	}

	public JugadorDTO get(Integer jug_rut) {
		// TODO Auto-generated method stub
		return null;
	}

	public int insert(JugadorDTO jugadorDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int update(JugadorDTO jugadorDTO) {
		return jugadorDAO.update(jugadorDTO);
	}

	public int delete(Integer jug_rut) {
		// TODO Auto-generated method stub
		return 0;
	}
}
