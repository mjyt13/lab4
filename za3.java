import static java.lang.Math.*;
import java.util.*;
public class za3 {
    public static void main(String[] args) {
        Scanner vv = new Scanner(System.in);
        System.out.println("введите длину первого основания");
        double a = vv.nextDouble();
        System.out.println("введите длину второго основания");
        double b = vv.nextDouble();
        System.out.println("введите длину высоты");
        double h = vv.nextDouble();
        if (a<=0 || b<=0 || h<=0){
            System.out.println("Стороны и высота трапеции не могут равняться отрицательным числам");
        } else if (a==b & a==h & b==h) {
            double S=(a/sqrt(2.0))*(a/sqrt(2.0))*PI;
            System.out.println("это квадрат,его площадь равна "+S);
        }else if (a==b) {
            double d = sqrt(a*a+h*h);
            double S=d*d*PI/4.0;
            System.out.println("это прямоугольник,его площадь равна "+S);
        }else if(a<b){
            double c = sqrt(h * h + pow((b - a) / 2.0, 2));
            double d = sqrt(h * h + pow((b + a) / 2.0, 2));
            double p = (a + d + c) / 2.0;
            double R = (a * d * c) / (4 * (sqrt(p * (p - a) * (p - c) * (p - d))));
            double S = PI * R * R;
            System.out.println("Площадь круга, описанного около трапеции, равна " + S);
        }else{
            double c = sqrt(h * h + pow((b - a) / 2.0, 2));
            double d = sqrt(h * h + pow((b + a) / 2.0, 2));
            double p = (b + d + c) / 2.0;
            double R = (b * d * c) / (4 * (sqrt(p * (p - b) * (p - c) * (p - d))));
            double S = PI * R * R;
            System.out.println("Площадь круга, описанного около трапеции, равна " + S);
        }
    }
}
