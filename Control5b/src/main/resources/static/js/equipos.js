function cargar() {
	EquiposController();
}

function EquiposController() {
	$.ajax({
		type 	: "get",
		url	 	: "/equipos/list",
		success	: function(res) {
			result="<table class='table'><thead><tr><th>Codigo Equipos</th><th>Nombre Equipo</th><th>Goles Totales</th></tr>";
			result+="</thead><tbody>";
			
			$.each(res, function(k,v) {
				result+="<tr>";
				result+="<td>"+v.equ_codigo+"</td>";
				result+="<td>"+v.equ_nombre+"</td>";
				result+="<td>"+v.gol_cantidad+"</td>";
				result+="</tr>";
			});
			result+="</tbody></table>";
				
			$("#equipos").html(result);
		},
		error	: function() {
			$("#msg").show();
			$("#msg").html("Error en busqueda de notas");
		}
	});
}
cargar();
