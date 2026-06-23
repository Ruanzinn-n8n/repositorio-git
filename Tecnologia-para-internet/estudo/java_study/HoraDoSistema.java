import java.util.Date;
import java.util.Locale;

public class HoraDoSistema {

    public static void main(String[] args) {
        Date dataehora = new Date();
        Locale language = new Locale();

        System.out.print("A hora do sistema é: ");
        System.out.println(dataehora.toString());
        System.out.print("Seu sistema está em ");
        System.out.println(language.toString());
    }
    
}
