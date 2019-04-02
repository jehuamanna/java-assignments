package assignments;
import java.time.LocalDate;
import java.time.Period;
import java.time.ZoneId;
import java.util.Date;

public class Calculate {
	DateDifferenceHolder calculateDateDifference(Date A, Date B) {
		LocalDate localDateA = A.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int monthA = localDateA.getMonthValue();
		int yearA = localDateA.getYear();
		int dayA = localDateA.getDayOfMonth();
		
		LocalDate localDateB = B.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
		int monthB = localDateB.getMonthValue();
		int yearB = localDateB.getYear();
		int dayB = localDateB.getDayOfMonth();
		
		LocalDate pdate = LocalDate.of(yearA, monthA, dayA);
        LocalDate now = LocalDate.of(yearB, monthB, dayB);
 
        Period diff = Period.between(pdate, now);
 
        DateDifferenceHolder dateDiff = new DateDifferenceHolder();
		DateDifferenceHolder.differenceInYears = diff.getYears();
		DateDifferenceHolder.differenceInMonths = diff.getMonths();
		DateDifferenceHolder.differenceInDays = diff.getDays();

		
		return dateDiff;
	}
	
	
	public static void main(String[] args) {
		Date A = new Date(1234561111112L)	;
		Date B = new Date(1554213618290L);
		Calculate dd = new Calculate();
		DateDifferenceHolder ddh = dd.calculateDateDifference(A, B);
		System.out.println("Difference in years: " + ddh.differenceInYears + " months: " + ddh.differenceInMonths + " days: " + ddh.differenceInDays );
		
		
	}
}


