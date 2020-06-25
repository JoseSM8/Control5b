package cl.icap.controlCincoB.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.icap.controlCincoB.model.dto.JugadorDTO;

@Repository
@Transactional
public class JugadorDAOImpl implements JugadorDAO {
	
	private String list = "SELECT j.jug_rut, j.jug_nombre, j.equ_cod, e.equ_nombre, g.gol_cantidad FROM JUGADOR j, EQUIPO e, GOLES g WHERE j.JUG_RUT=g.JUG_RUT AND j.EQU_COD=e.EQU_CODIGO";
	private String get = "";
	private String insert = "";
	private String update = "UPDATE GOLES SET gol_cantidad=? WHERE jug_rut=?";
	private String delete = "";

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<JugadorDTO> list() {
		List<JugadorDTO> listJugador = jdbcTemplate.query(list, BeanPropertyRowMapper.newInstance(JugadorDTO.class));
		return listJugador;
	}

	@Override
	public JugadorDTO get(Integer jug_rut) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(JugadorDTO jugadorDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(JugadorDTO jugadorDTO) {
		int rows = 0;
		Object[] args = {
			jugadorDTO.getGol_cantidad(),
			jugadorDTO.getJug_rut()
		};
		try {
			rows = jdbcTemplate.update(update, args);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rows;
	}

	@Override
	public int delete(Integer jug_rut) {
		// TODO Auto-generated method stub
		return 0;
	}

}
