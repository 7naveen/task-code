
import java.time.format.DateTimeFormatter;
import java.text.SimpleDateFormat;

import java.util.*;
import java.time.temporal.ChronoUnit;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);

	    SimpleDateFormat formatt=new SimpleDateFormat("yyyy-MM-dd");
	     String a=sc.next();
	    int f=sc.nextInt();
	    String b=sc.next();
	    int d=sc.nextInt();
	    Dictionary geek = new Hashtable();

        // put() method
        geek.put(a,f);
        geek.put(b,d);
try
{	    Date d1 = formatt.parse(a);
			Date d2 = formatt.parse(b);

					long diff = d2.getTime() - d1.getTime();
			long diffDays = diff / (24 * 60 * 60 * 1000);

		System.out.println("total days: "+diffDays);
		int arr[]=new int[5];
		int count=0;


		 for (Enumeration i = geek.elements(); i.hasMoreElements();)
        {
          arr[count]=(Integer)i.nextElement();
          count++;
        }


        int dif=arr[--count]-arr[0];
        int e=arr[0];

        System.out.println("difference in values: "+dif);
        int div=dif/(int)diffDays;
        System.out.println("value to increment: "+div);




         Calendar c = Calendar.getInstance();
        c.setTime(d1);
        System.out.print("{");
        for(int i=1;i<=diffDays;i++){
        c.add(Calendar.DAY_OF_MONTH, 1);

         Date currentDatePlusOne = c.getTime();
e+=div;
        System.out.print(formatt.format(currentDatePlusOne)+":"+e);
        if(i!=diffDays)
        System.out.print(",");
        }
        System.out.print("}");





}
 catch (Exception e) {
			e.printStackTrace();
		}
}
}

