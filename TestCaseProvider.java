package DataDifferenceProvider;

public class TestCaseProvider {

	public static void main(String[] args) {
		DateDifferenceProvider providers=new DateDifferenceProvider();
MyTestRecords[] mytestrecords=new MyTestRecords[4];
mytestrecords[0]= new MyTestRecords(new MyDate(20,11,2018),new MyDate(20,11,2018),0);
mytestrecords[1]=new MyTestRecords(new MyDate(20,11,2018),new MyDate(27,11,2018),7);
mytestrecords[2]=new MyTestRecords(new MyDate(20,11,2018),new MyDate(20,12,2018),31);
mytestrecords[3]=new MyTestRecords(new MyDate(6,4,2011),new MyDate(18,12,2011),73);
for(int index=0;index<mytestrecords.length;index++)
{
	int calculatediff=providers.getDateDifferenceProvider(mytestrecords[index].getstartdate(), mytestrecords[index].getenddate());
	if(calculatediff==mytestrecords[index].getactualdifference())
	{
		System.out.println("test case passed");
	}
	else
	{
		System.out.println("test case FAILED");
	}
}

	

}
}