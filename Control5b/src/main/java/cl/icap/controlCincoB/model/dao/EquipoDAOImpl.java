package cl.icap.controlCincoB.model.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import cl.icap.controlCincoB.model.dto.EquipoDTO;

@Repository
@Transactional
public class EquipoDAOImpl implements EquipoDAO {

	private String list = "SELECT e.equ_codigo, e.equ_nombre, sum(g.gol_cantidad) as gol_cantidad FROM JUGADOR j, EQUIPO e, GOLES g WHERE j.JUG_RUT=g.JUG_RUT AND j.EQU_COD=e.EQU_CODIGO GROUP BY e.equ_codigo, e.equ_nombre";
	private String get = "";
	private String insert = "";
	private String update = "";
	private String delete = "";
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
	public List<EquipoDTO> list() {
		List<EquipoDTO> listEquipo = jdbcTemplate.query(list, BeanPropertyRowMapper.newInstance(EquipoDTO.class));
		return listEquipo;
	}

	@Override
	public EquipoDTO get(Integer equ_codigo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int insert(EquipoDTO equipoDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(EquipoDTO equipoDTO) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(Integer equ_codigo) {
		// TODO Auto-generated method stub
		return 0;
	}

}
