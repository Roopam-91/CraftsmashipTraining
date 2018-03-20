package com.cleancode;

public class DateUtils {
	public static final int[][] MONTHSDICT={{1,31},{2,28},{3,31},
			{4,30},{5,31},{6,30},{7,31},{8,31},{9,30},{10,31},{11,30},{12,31}};
	public static int duration(Date start,Date end){
		int duration =end.getDate()-start.getDate();
		duration = manipulateMonth(start, end, duration);
		if(end.getYear()>start.getYear()){
			if(end.getMonth()>=start.getMonth()){
				duration = manipulateYear(start, end, duration);
			}
			else{
				duration = remainingDaysInYearOfStartDate(start);
				duration = remainingDaysInYearOfEndDate(end, duration);
			}
		}
		System.out.println("Total duration in days "+duration);
		return duration;
	}
	private static int remainingDaysInYearOfEndDate(Date end, int duration) {
		Date temp;
		temp=new Date(0,1,end.getYear());
		duration+=end.getDate()-temp.getDate();
		duration=manipulateMonth(temp, end, duration);
		return duration;
	}
	private static int remainingDaysInYearOfStartDate(Date start) {
		int duration;
		Date temp=new Date(31,12,start.getYear());
		duration=temp.getDate()-start.getDate();
		duration=manipulateMonth(start, new Date(31,12,start.getYear()), duration);
		return duration;
	}
	private static int manipulateMonth(Date start, Date end, int duration) {
		for(int[] months:MONTHSDICT){
			if(months[0] >= start.getMonth() && months[0] < end.getMonth()){
				duration+= months[1];
			}			
		}
		return duration;
	}
	private static int manipulateYear(Date start, Date end, int duration) {
		for(int y=start.getYear()+1;y<=end.getYear();y++){
			if(y%400==0||((y%4==0) && (y%100!=0))){
				duration+=366;
			}
			else{
				duration+=365;
			}
		}

		return duration;
	}
	public static void main(String[] args){
		System.out.println(duration(new Date(19,3,2018), new Date(28,03,2020)));
	}
}
