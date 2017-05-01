import static spark.Spark.*;

import freemarker.template.Configuration;
import freemarker.template.Template;
import freemarker.template.Version;
import spark.ModelAndView;
import spark.Spark;

 
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;





public class Main {
	public static void main(String[] args) {
		Updatable2 u = new EmpleadoView2();
		
		
		/* get("/regi", (request, response) -> {
			
				 Map<String, Object> model = new HashMap<String, Object>();
	           // model.put("name", update(u));
	            
		      return new ModelAndView(model, "prueba.vtl");
		    }, vel());
		 */
		  staticFileLocation("/public");
		    
		    get("/regi", (request, response) -> {
		      return new ModelAndView(new HashMap(), "form.vtl");
		    }, vel());

		    
		    post("/ver", (request, response) -> {
		    	String name = request.queryParams("name") != null ? request.queryParams("name") : "anonymous";
	            String email = request.queryParams("email") != null ? request.queryParams("email") : "unknown";
	            Map<String, Object> model = new HashMap<String, Object>();
	            model.put("name", request.queryParams("name") != null ? request.queryParams("name") : "anonymous");

	            model.put("email", request.queryParams("email") != null ? request.queryParams("email") : "unknown");
		      return new ModelAndView(model, "mostrar3.vtl");
		    }, vel());
		    
		
		
		

}
	
	public static VelocityTemplateEngine vel()
	{VelocityTemplateEngine v;
		return v=new VelocityTemplateEngine();
		
		
	}
	
	public static String update(Updatable2 u) {
		String result = "";
		result += u.inicioEmpleado();
		result += u.updateNombre("rebe");
		result += u.updateApellido("noe");
		result += u.finEmpleado();
		return result;
		}
	
	
	
	
}