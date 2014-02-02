package almacen_ficheros;
import java.io.File;

public class FileExists {
	/**
	 * Primero hay que inicializar los argumentos, pasandole rutas de ficheros</br>
	 * Ejemplo: <code>args[0] == E:\workspace_JAVA\xXavi_Programacion\Permisos.txt;</code>
	 * @param args <strong>rutas absolutas</strong> pasadas como parametros en el main
	 */
	public static void main(String[] args) {

		String arch=args[0];
		File archivo = new File(arch);
		
		boolean bool;
		bool=archivo.exists();
			if(bool) System.out.println("el archivo existe");
			else System.out.println("no se encuentra el archivo");

	}
}
