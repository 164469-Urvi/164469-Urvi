package DataDifferenceProvider;

public class MyTestRecords {
	private MyDate startdate;
	private MyDate enddate;
	int actualdifference;
	
	
	 MyTestRecords(MyDate startdate,MyDate enddate,int actualdifference)
	{
		this.startdate=startdate;
		this.enddate=enddate;
		this.actualdifference=actualdifference;
		
	}
	
	 public MyDate getstartdate()
	 {
		 return startdate;
	 }
	 public void  setstartdate(MyDate startdate)
	 {
		 this.startdate=startdate;
	 }
	 public MyDate getenddate()
	 {
		return enddate;
		 
	 }
	 public void setenddate(MyDate enddate)
	 {
		 this.enddate=enddate;
	 }
	 public int getactualdifference()
	 {
		 return actualdifference;
	 }
	 public void setactualdifference(int actualdifference)
	 {
		 this.actualdifference=actualdifference;
	 }
	 
}