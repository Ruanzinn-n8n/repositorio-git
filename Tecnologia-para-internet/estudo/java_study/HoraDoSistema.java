import java.time.LocalTime;
import java.util.Locale;

public class HoraDoSistema {
    public static void main(String[] args) {
        LocalTime dataehora = LocalTime.now();
        Locale language = Locale.getDefault();
        int hora = dataehora.getHour();
        int minuto = dataehora.getMinute();
        String lingua = language.getDisplayLanguage();

        System.out.println("Agora são: " + hora + " horas e " + minuto + " minutos!");
        System.out.print("E seu sistema está em " + lingua);
    }
    
}
