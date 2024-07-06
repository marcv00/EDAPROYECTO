/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package helpers;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JLabel;

/**
 *
 * @author villa
 */
public class DateTimeLabelUpdater {
    private JLabel label;

    public DateTimeLabelUpdater(JLabel label) {
        this.label = label;
        updateLabel();
    }

    public void updateLabel() {
        // Define the date and time format
        SimpleDateFormat formatter = new SimpleDateFormat("EEEE d 'de' MMMM 'del' yyyy, HH:mm a");
        
        // Get the current date and time
        Date date = new Date();
        
        // Format the date and time
        String dateTimeString = formatter.format(date);
        
        // Capitalize the first letter of the formatted string
        dateTimeString = dateTimeString.substring(0, 1).toUpperCase() + dateTimeString.substring(1);
        
        // Set the text of the label
        label.setText(dateTimeString);
    }
    public static void updateLabelStatic(JLabel label) {
        new DateTimeLabelUpdater(label);
    }

    // Método estático para obtener la hora actual en formato HH:mm a
    public static String getCurrentTime() {
        SimpleDateFormat timeFormatter = new SimpleDateFormat("HH:mm a");
        Date date = new Date();
        return timeFormatter.format(date);
    }

    // Método estático para obtener la fecha actual en formato EEEE d 'de' MMMM 'del' yyyy
    public static String getCurrentDate() {
        SimpleDateFormat dateFormatter = new SimpleDateFormat("EEEE d 'de' MMMM 'del' yyyy");
        Date date = new Date();
        String dateString = dateFormatter.format(date);
        return dateString.substring(0, 1).toUpperCase() + dateString.substring(1); // Capitaliza la primera letra
    }

    // Método estático para obtener la fecha y hora actual en formato completo
    public static String getCurrentDateTime() {
        SimpleDateFormat dateTimeFormatter = new SimpleDateFormat("EEEE d 'de' MMMM 'del' yyyy, HH:mm a");
        Date date = new Date();
        String dateTimeString = dateTimeFormatter.format(date);
        return dateTimeString.substring(0, 1).toUpperCase() + dateTimeString.substring(1); // Capitaliza la primera letra
    }
}
