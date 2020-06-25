package cl.icap.controlCincoB.controller;

import java.util.List;
import java.util.stream.Collectors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import cl.icap.controlCincoB.model.dto.EquipoDTO;
import cl.icap.controlCincoB.service.EquipoService;

@Controller
@RequestMapping(value="/equipos")
public class EquiposController {

	@Autowired
	private EquipoService equipoService;
	
	@RequestMapping(value="/list")
	public @ResponseBody List<EquipoDTO> ajaxList(HttpServletRequest req, HttpServletResponse res) {
		return equipoService.list();
	}
	/*
	@RequestMapping(value="/update")
	public @ResponseBody int ajaxUpdate(HttpServletRequest req, HttpServletResponse res) {
		int rows = 0;
		String requestData;
		try {
			requestData = req.getReader().lines().collect(Collectors.joining());
			Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
			EquipoDTO equipoDTO= gson.fromJson(requestData, EquipoDTO.class);
			rows = equipoService.update(equipoDTO);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return rows;
	}*/
}
