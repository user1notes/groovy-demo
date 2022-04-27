
class DateTimeDemo {
	
	static void main(String []args) {
		Date date = new Date();
		println(date.toString());
		
		Date date1 = new Date(100);
		println(date1.toString());
		
		println(date.after(date1));
		
		Date oldDate = new Date("01/01/2000");
		Date newDate = new Date("01/01/2000");
		println(oldDate.equals(newDate));
		println(date1.equals(newDate));
		
		println(date1.compareTo(date));
		println(oldDate.compareTo(newDate));
		println(date.compareTo(date1));
		
		println(date.getTime());
		
		date1.setTime(1000)
		date.setTime(1000)
		
		println(date1.toString())
		println(date.toString())
	}
}