/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

import java.util.Calendar;
import java.util.Locale;

/**
 *
 * @author KEVIN
 */
public class FechaHora {
    
    static Calendar Hora = Calendar.getInstance();
    static Calendar Fecha = Calendar.getInstance();
    
    public static String FechaHora()
    {
        String HoraActual;
        int hora, minuto;
        hora = Hora.get(Calendar.HOUR_OF_DAY);
        minuto = Hora.get(Calendar.MINUTE);
        HoraActual = hora+":"+minuto;
        return HoraActual;
    }
    
    public static String Fecha()
    {
        int dia, mes, año;
        String FechaActual;
        dia = Fecha.get(Calendar.DATE);
        mes = Fecha.get(Calendar.MONTH)+1;
        año = Fecha.get(Calendar.YEAR);
        FechaActual = dia+"/"+mes+"/"+año;
        return FechaActual;
    }
}
