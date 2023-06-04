package homework7;

public class Sum {
    private double sum = 0.0;
    public void dealNumber(double ret) throws ComputaException {
        if(ret > 100.0 || ret < 0.0){
            throw new ComputaException(ret);
        }
        sum += ret;
    }
    public double getSum(){
        return sum;
    }

    public void showSum(){
        System.out.println("总成绩为" + sum);
    }

}
