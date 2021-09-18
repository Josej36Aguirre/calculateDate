/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculatedate;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author INDRA
 */
public class CalculateDate {

    
    public static void main(String[] args) {
      

        Calendar c = Calendar.getInstance();
//        c.set(Calendar.SECOND, -3600);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMddHHmmss");
        System.out.println("formatter = " + formatter.format(c.getTime()));
//        return formatter.format(c.getTime());
  
   }

}
