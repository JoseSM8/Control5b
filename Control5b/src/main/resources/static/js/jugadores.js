function cargar(){
	JugadoresController("list");
}
function JugadoresController(opcion) {
	switch (opcion) {
	case "list":
		$.ajax({
			type 	: "get",
			url	 	: "/jugadores/list",
			success	: function(res) {
				
				result="<table class='table'><thead><tr><th>Rut Jugador</th><th>Nombre Jugador</th><th>Nombre Equipo</th><th>Goles</th><th>Accion</th></tr>";
				result+="</thead><tbody>";
				
				$.each(res, function(k,v) {
					result+="<tr>";
					result+="<td>"+v.jug_rut+"</td>";
					result+="<td>"+v.jug_nombre+"</td>";
					result+="<td>"+v.equ_nombre+"</td>";
					result+="<td>"+v.gol_cantidad+"</td>";
					result+='<td><button type="button" onclick="javascript:ActualizarGoles(\''+v+'\')"><span>Actualizar</span></button></td>';
					result+="</tr>";
				});
				result+="</tbody></table>";
					
				$("#jugadores").html(result);
				console.log(result);
			},
			error	: function() {
				$("#msg").show();
				$("#msg").html("Error en busqueda de notas");
			}
		});
		break;
	}
}
function ActualizarGoles(v){
	var json = 
	{
		'gol_cantidad': v.gol_cantidad,
		'jug_rut': v.jug_rut
	};
	
	$("#myModal").modal({show:true});
}
cargar();
