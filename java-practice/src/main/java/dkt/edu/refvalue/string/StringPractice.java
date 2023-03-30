package dkt.edu.refvalue.string;

public class StringPractice {
    public static void main(String[] args){
        String str1 = "test1";
        String str2 = "test1";
        String str3 = new String("test1");
        System.out.println(str1==str2); //true 같은 객체임을 알 수 있다.
        System.out.println(str1==str3); //false 다른 객체임을 알 수 있다.
    }
}
