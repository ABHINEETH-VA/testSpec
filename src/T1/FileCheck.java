package T1;

public class FileCheck {

	public static void main(String[] args) {
		char [] elm = {'I','N','D','I','A'};
		String txt = "INDIA";
		char [] ne = txt.toCharArray();
		//String fin
		int i = 0;
		int flag = 0;
		while(i < txt.length())
		{
			char srch = txt.charAt(i);
			for(int j=0; j< txt.length(); j++)
			{
				if (srch == ne[j])
				{
					flag++;
				}
				if (flag == 2)
				{
					System.out.println("CHAR: " + srch);					
					txt = txt.replaceFirst(Character.toString(srch),"");
					int z = txt.indexOf(srch);
					System.out.println(z);
					System.out.println(txt);
					flag --;
				}
			}
			i++;
			flag = 0;
		}
		System.out.println("FINAL: " + txt);

	}

}
