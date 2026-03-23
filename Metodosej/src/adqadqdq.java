import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class adqadqdq {

	public static void main(String[] args) throws NumberFormatException, IOException {
   BufferedReader leer= new BufferedReader(new InputStreamReader(System.in));
	System.out.println("n: ");
	int num = Integer.parseInt(leer.readLine());
	for(int i=num;i>=1;i--) {
	System.out.println(i);
		}
	}

}
