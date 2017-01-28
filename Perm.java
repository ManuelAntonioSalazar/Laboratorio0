import java.util.Arrays;
import java.util.List;

public class Perm {
	
	public static String[] listaletras = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l", "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    // Asuma que todos los parametros son validos
    public static String permutation(String message, int spaces) {
        int cont = message.length();
		String nueva = "";
		if(spaces >= 26){
			
			spaces = spaces - 26;	
		}
		for(int i = 0; i < cont; i++){
			
			String letra = String.valueOf(message.charAt(i));
			
			
			int pos = Arrays.asList(listaletras).indexOf(letra) + spaces;
			//int pos = listaletras.indexOf(letra);
			
			nueva += listaletras[pos];
		}
		
		
        return nueva;
    }

    // NO MODIFICAR A PARTIR DE AQUI

    public static void main(String[] args) {
        if(args.length > 0) {
            String entry = args[0];
            int spaces = Integer.parseInt(args[1]);
            System.out.println(permutation(entry, spaces));
        } else {
            System.err.println("No se paso ningun argumento");
        }
    }

}
