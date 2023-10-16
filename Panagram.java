package basic;

public class Panagram {
public static void main(String[] args) {
	String s="THE QUICK BROWN FOX JUMPS OVER A LAZY DOG";
	s=s.replace(" ", "");
	char[]a=s.toCharArray();
	int size=a.length;
	char[]b=  new char[size];//{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
	int i=0;
	while(i!=size) {
		int index=a[i]-65;
		b[index]=1;
		i++;
	}
	i=0;
	while(i!=26) {
		if(b[i]==1) {
			i++;
		}else {
			System.out.println("not a panagram");
			System.exit(0);
		}
	}
	System.out.println(" strings are panagram");
}
}
