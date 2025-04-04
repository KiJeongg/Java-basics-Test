//Q9. 계산기 만들기


import java.util.Arrays;
class Calculator {
    int[] data;
    public Calculator(int[] data) {
        this.data = data;
    }
    public int sum() {
        return Arrays.stream(data).sum();
    }
    public float avg() {
        return (float) sum() / data.length;
    }
}
public class Main9{
    public static void main(String[] args) {
        int[] data1 = {1,2,3,4,5};
        Calculator cal1 = new Calculator(data1);
        System.out.println(cal1.sum());
        System.out.println(cal1.avg());
        int[] data2 = {6,7,8,9,10};
        Calculator cal2 = new Calculator(data2);
        System.out.println(cal2.sum());
        System.out.println(cal2.avg());
    }
}