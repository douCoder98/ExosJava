package tools;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

public class MesDates {
    public static String dateFRtoUS(String date) {
        String usDate = DateFormat.getDateInstance(DateFormat.LONG, Locale.US).format(new Date(date));

        return usDate;
    }

    public static String dateUStoFR(String date) {
        String frDate = DateFormat.getDateInstance(DateFormat.LONG, Locale.FRANCE).format(new Date(date));

        return frDate;
    }
}
