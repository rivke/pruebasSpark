
public class EmpleadoView2 implements Updatable2{

	public String inicioEmpleado() {
		return "<div class='ui container' style='padding-top: 30px;'>";

		}

		public String updateNombre(String nombre) {
		return "<div class='ui blue segment' >"
		+ "<h3 class='ui teal centered header'> Nombre: </h3>"
		+ ""+nombre+""
		+"</div>";
		}

		public String updateApellido(String apellido) {
		return "<div class='ui blue segment' >"
		+ "<h3 class='ui teal centered header'>Apellido: </h3>"
		+ "<h3 class='ui teal centered header'>"+apellido+"</h3>"
		+"</div>";
		}


		public String finEmpleado() {
		return "</div>";	
		} 

}
