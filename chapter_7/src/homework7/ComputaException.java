package homework7;

public class ComputaException extends Exception{
    String message;
    public ComputaException(double ret){
        if(ret < 0.0)
            message = "输入小于0，停止运行";
        else
            message = "输入超过100，停止运行";
    }

}
