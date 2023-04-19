package TY_GenerealUtilitiess;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * This class is used to get  System date
 * @author Kiran
 *
 */
public class DateGeneric_Utility
{

	 /**
	  * This method used to get current date
	  * @return
	  */
	public  Date present_date()
	{
	Date d=new Date();
	return d;
	}

	/**
	 * This method is used to get current System date in desirable format
	 * this method takes desirable date format as String argument
	 * @param format
	 * @return
	 */
	public  String present_date(String format)//"dd_mm_yyyy_hh_mm_ss"
	{
	
		Date d=new Date();
		SimpleDateFormat sdf=new SimpleDateFormat(format);//for constructor u hv to intialize with dezire format
		return sdf.format(d);//by using format() we have to send date object 
	}
	
	
	/**
	 * This method is used to get next date from current date
	 * @param format
	 * @param days
	 * @return
	 */
	public String present_date(String format,int days) 
	{
	
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH,days);//5 days addead
		return sdf.format(cal.getTime());
	}
	
		
	public  String present_date(int year,String format) 
	{
	
		SimpleDateFormat sdf=new SimpleDateFormat(format);
		Calendar cal=Calendar.getInstance();
		cal.add(Calendar.DAY_OF_YEAR,year);
		return sdf.format(cal.getTime());
	}
	
	
}
