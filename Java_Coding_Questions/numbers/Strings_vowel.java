package numbers;

public class Strings_vowel {

	public static void main(String[] args) {
		String s= "Navya is good girl";
		String vow ="";
		String s1 = s.toLowerCase();
		int leng=s1.length();
		for (int i = 0;i<leng;i++){
			char ch =s1.charAt(i);
			if(ch=='a'|| ch =='e'|| ch=='i'|| ch=='o'||ch=='u') {
				vow=vow+ch;
			}
		}
		System.out.println(vow);

	}

}
/*
class Main {
    public static void main(String[] args) {
        String s= "Navya is good girl";
        String vow ="";
        String word="";
       String s1 = s.toLowerCase();
       
        int leng=s1.length();
        for (int i = 0;i<leng;i++){
            char ch =s1.charAt(i);
            if (ch ==' '){
            continue;
            }
            else if (ch=='a'|| ch =='e'|| ch=='i'|| ch=='o'||ch=='u'){
                vow=vow+ch;
            }
            else{
                word =word+ch;
            }
        }
        String total =word +vow;
        System.out.println(total+" "+ total.length());
        
        System.out.println(vow+vow.length());
    }
}


*/