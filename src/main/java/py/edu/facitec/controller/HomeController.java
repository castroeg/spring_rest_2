package py.edu.facitec.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

	//recibir una URL como configuracion
	@RequestMapping("/")
	public String home() {
		
		System.out.println("Ingrese a la pagina de inicio");
		
		//retornar una pagina
		return "usuario/login";
		
	}
	@RequestMapping("/form")
	public String suscritos() {
		
		
		System.out.println("Cargando página de suscritos");
	    return "suscrito/form";
	}

}
