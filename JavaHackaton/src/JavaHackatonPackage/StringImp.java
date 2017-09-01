package JavaHackatonPackage;

public class StringImp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s1="sangeetha";
		String s2=new String("Hegde");
		String s3="Teck arch";
		String[] s4=new String[2];
		 s4=s3.split(" ");
		 
		 for(int i=0;i<2;i++)
		 System.out.println(s4[i]);
		
		/*s1=s1.toUpperCase();
		s2=s2.toLowerCase();*/
		System.out.println(s1.toUpperCase());
		System.out.println(s1.subSequence(2,6));
		
		System.out.println(s1+" "+s2);
	}

}
