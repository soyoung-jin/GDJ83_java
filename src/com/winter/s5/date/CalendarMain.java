package com.winter.s5.date;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class CalendarMain {

	public static void main(String[] args) {
		Calendar ca = new GregorianCalendar();
		ca = Calendar.getInstance(); // new 연산자 사용하지 않고 getInstance 메서드를 사용함

		System.out.println(ca.get(Calendar.YEAR));
		System.out.println(ca.get(Calendar.HOUR_OF_DAY));
		System.out.println(ca.get(Calendar.DAY_OF_MONTH));
		Single single = Single.get();

		Date d = ca.getTime();
		System.out.println(d);

		Calendar future = Calendar.getInstance();
		future.set(Calendar.DATE, future.get(Calendar.DATE) + 17);
		System.out.println(future.getTime());

		ca = Calendar.getInstance();
		SimpleDateFormat st = new SimpleDateFormat("yyyy년MM월dd일 HH시 mm븐 ss초");
		String s = st.format(ca.getTime());

	}

}
