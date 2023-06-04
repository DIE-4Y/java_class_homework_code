package homeword_4;

import java.util.Scanner;


class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        Circle cirle = new Circle();
        cirle.radius = sc.nextInt();
        cirle.area = cirle.getArea(cirle.radius);
        cirle.girth = cirle.getGirth(cirle.radius);
        System.out.println("圆的面积是：" + cirle.area);
        System.out.println("圆的周长是：" + cirle.girth);
    }
}

class Circle{
    int radius;
    double area;
    double girth;
    double getArea(int r){
        double area = r * 3.14 * r;
        return area;
    }
    double getGirth(int r){
        double girth = 3.14 * r *2;
        return girth;
    }
}
