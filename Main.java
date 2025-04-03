//Q1. 문자열 바꾸기

public class Main{
    public static void main(String[] args) {
            String a = "a:b:c:d";
            String[] temp = a.split(":");
            String result = String.join("#", temp);
        System.out.println(result);
    }
}