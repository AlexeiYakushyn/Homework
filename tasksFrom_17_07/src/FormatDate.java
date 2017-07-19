import java.time.LocalDate;
/**
 * Created by alexei.yakushyn on 19.07.2017.
 */
public class FormatDate {



    public static void main(String[] args) {
        LocalDate today = LocalDate.of(2017,07,19);

        // Output must be 17 July 2017
        System.out.println(String.format("%1$td %1$tB %1$tY", today));
    }
}
