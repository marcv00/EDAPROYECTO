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
}
