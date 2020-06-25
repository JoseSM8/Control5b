package cl.icap.controlCincoB.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class WebController {

	@RequestMapping("/")
	public String getIndex() {
		return "index";
	}
	
	@RequestMapping("/equipos")
	public String getEquipos() {
		return "equipos";
	}
	
	@RequestMapping("/jugadores")
	public String getJugadores() {
		return "jugadores";
	}
}
