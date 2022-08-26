package javaoop;

public class JavaEnumTypes {
  Day day;
  
  public JavaEnumTypes(Day day) {
	  this.day=day;
  }//constructor
  
  public void tell_Truth() {
	  switch(day) {
	  case MONDAY : System.out.println("i dont want to wakeup ....monday  "); break;
	  case FRIDAY : System.out.println(" FRIDAY IS BEST.... "); break;
	  case SATURDAY : case SUNDAY : System.out.println("Weekends are best always.... "); break;
	  default : System.out.println("Midweek days are so-onnnnnnnnnnnn "); break;
	  }// switch
  }//tell_Truth()
	
	public static void main(String[] args) {
		JavaEnumTypes objFirstDay=new JavaEnumTypes(Day.MONDAY);
		objFirstDay.tell_Truth();
		JavaEnumTypes objSecondDay=new JavaEnumTypes(Day.TUESDAY);
		objSecondDay.tell_Truth();
		JavaEnumTypes objThirdDay=new JavaEnumTypes(Day.WEDNESDAY);
		objThirdDay.tell_Truth();
		JavaEnumTypes objFourthDay=new JavaEnumTypes(Day.THURDAY);
		objFourthDay.tell_Truth();
		JavaEnumTypes objFifthDay=new JavaEnumTypes(Day.FRIDAY);
		objFifthDay.tell_Truth();
		JavaEnumTypes objSixthDay=new JavaEnumTypes(Day.SATURDAY);
		objSixthDay.tell_Truth();
		JavaEnumTypes objSeventhDay=new JavaEnumTypes(Day.SUNDAY);
		objSeventhDay.tell_Truth();
		
		
     
	}//main()

}//end class

