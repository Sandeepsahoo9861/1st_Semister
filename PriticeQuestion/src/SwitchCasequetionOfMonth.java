 //wap a program that randomly generate an integer between 1 and 12 and display the
// english  month name  january ,february.....december for 1,2,3,..12
public class SwitchCasequetionOfMonth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int rand=(int) (Math.random() *12)+1;
	String a="";
	

	
	switch(rand) {
	case 1:
	a="january";
	break;
	case 2:
	a="frebuary";
	break;
	case 3:
    a="march";
   	break;
	case 4:
	a="april";
	break;
	case 5:
	a="may";
	break;
	case 6:
	a="june";
	break;
	case 7:
	a="july";
	break;
	case 8:
	a="augest";
	break;
	case 9:
	a="september";
	break;
	case 10:
	a="october";
	break;
	case 11:
	a="november";
	break;
	case 12:
	a="december";
	break;
	
	}
	System.out.println( "random no generated by computer is" + " " + rand);
	System.out.println("month is" +" " +a);
	}

}
