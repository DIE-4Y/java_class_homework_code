package homework7;

import java.util.Scanner;

public class GetSumAndGetAverage {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = 0;
        Sum sum = new Sum();
        while(sc.hasNextDouble()){
            double ret = sc.nextDouble();
            try {
                sum.dealNumber(ret);
            }
            catch (ComputaException computaException){
                System.out.println(computaException.message);
                System.exit(0);
            }
            m++;
        }
        System.out.println("总成绩为" + sum.getSum());
        System.out.println("平均成绩为" + sum.getSum() / m);
    }
}
