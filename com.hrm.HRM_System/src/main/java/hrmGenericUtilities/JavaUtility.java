package hrmGenericUtilities;

import java.util.Date;
import java.util.Random;
/**
 * 
 * @author Pavan
 *
 */
public class JavaUtility {

	/**
	 * This method returns random number from 1 to 999
	 * @return int
	 */
	public int getRandomNumber() {
		Random random=new Random();
		int rNum=random.nextInt(1000);
		return rNum;
	}
	/**
	 * This method returns current system date
	 * @return String
	 */
	public String getSystemDate() {
		Date date=new Date();
		String sysDate=date.toString();
		return sysDate;
	}
	/**
	 * This method return the system date in mon week date year formate
	 * @return String
	 */
	public String getSystemDateInFormate() {
		Date date=new Date();
		String sysDate=date.toString();
		String[] d = sysDate.split(" ");
		
		int month=date.getMonth();
		String week=d[0];
		String cDate=d[1];
		String year=d[5];
		
		return month+" "+week+" "+cDate+" "+year;
	}
	
}
