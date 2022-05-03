package com.nitin.algoPractice.collection;

public class TimeConversion {
		public static void main(String[] args) {
			String s="01:45:59AM";
			
			String [] arr = s.split(":",0);
					
			//AM PM
			String AmPm = arr[2].substring(2,4);
			
			int h = Integer.parseInt(arr[0]),
					m = Integer.parseInt(arr[1]),
					sec = Integer.parseInt(arr[2].substring(0, 2));
			
			if(AmPm.equals("AM") && h==12)
				h=0;
			else if (AmPm.equals("PM") && h<12)
				h=h+12;
			
			//String //hh=Integer.toString(h),
					//	mm=Integer.toString(m),
					//	second= Integer.toString(sec);
			String militartTime = String.format("%02d:%02d:%02d", h,m,sec);

			System.out.println(militartTime);
		}
}
