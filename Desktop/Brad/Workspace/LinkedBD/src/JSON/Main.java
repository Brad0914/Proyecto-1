package JSON;
import com.google.gson.*;
import java.io.FileReader;
import java.util.Map.Entry;

public class Main {

	public static void main(String[] args) {
    		SerializadorJson();
			DeserializadorJson();

	}

	private static void DeserializadorJson() {
		String user = "{'nombre': Brad, 'apellido': Valverde, 'nacionalidad': Tico, 'edad': 18}";
		
		Gson gson = new Gson();
		
		
		Usuario json = gson.fromJson(user, Usuario.class);
		

		
		System.out.println(json.getApellido());
		System.out.println(json.getEdad());
		System.out.println(json.getNacionalidad());
		System.out.println(json.getNombre());
		
	}

	private static void SerializadorJson() {
		Usuario user = new Usuario("Brad", "Valverde", "Tico", 18);
		
		Gson gson =new Gson();
		
		String json = gson.toJson(user);
		
		System.out.println(json);
		
		
	}
	

}
