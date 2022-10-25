import static java.lang.Math.*;
import java.util.Scanner;
public class Za1 {
    public static void main(String[] args) {
        Scanner Re = new Scanner(System.in);
        System.out.println("Введите переменные x,y,z,a,b,c");
        double x=Re.nextDouble();
        double y=Re.nextDouble();
        double z=Re.nextDouble();
        double a=Re.nextDouble();
        double b=Re.nextDouble();
        double c=Re.nextDouble();
        if (cos(pow(y,3)*(x+2*z))<0 || (y<0 & (z%1!=0)) || sin(x*y+E+pow(y,z))+5*z==0){
            System.out.println("Вычисление функции невозможно");
        }else{
            double L = a*b*c*((pow(cos(y*y*y*(x+2*z)),E)+pow(PI,5)*((x+1)/(2+y)))/(sin(x*y+E+pow(y,z))+5*z));
            System.out.println("L="+L);
        }
    }
    static {
        Scanner Re = new Scanner(System.in);
        System.out.println("Введите переменные y,n");
        double y=Re.nextDouble();
        double n=Re.nextDouble();
        double D = y*y+(0.5*n+4.8)/(sin(y)+E);
        System.out.println("D="+D);
    }
}


