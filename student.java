
public class student 
{
 int rollno;
 String name;
 int sub1,sub2;
 int sum;
 int avg;
 void get(String n,int r,int a,int b)
 {
	 rollno=r;
	 name=n;
	 sub1=a;
	 sub2=b;
 }
 void disp()
 {
	 sum=sub1+sub2;
	 avg=(sub1+sub2)/2;
	 System.out.println("rollno="+rollno);
	 System.out.println("name="+name);
	 System.out.println("avg="+avg);
 }
 
	public static void main(String[] args)
	{
	  student S1=new student();
	  student S2=new student();
	  student S3=new student();
	  S1.get("maheshwar",303,88,98);
	  S2.get("john cena",304,96,97);
	  S3.get("roman",301,95,94);
	  S1.disp();
	  S2.disp();
	  S3.disp();

	}

}
