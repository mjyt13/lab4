import java.util.Scanner;

import static java.lang.System.out;

public class za5 {
    public static void main(String[] args) {
        Scanner kl = new Scanner(System.in);
        out.println("введите координаты 1 точки, через которые проходит прямая");
        double xa = kl.nextDouble(); double ya = kl.nextDouble();
        out.println("введите координаты 2 точки, через которые проходит прямая");
        double xb = kl.nextDouble(); double yb = kl.nextDouble();
        out.println("введите координаты точки, проекцию которой хотите найти");
        double x = kl.nextDouble(); double y = kl.nextDouble();
        out.print("проекция равна( "+x+", "+Prlin(xa,ya,xb,yb,x)+")");
    }
    public static double Prlin(double xa, double ya, double xb, double yb, double x){
        return(ya-yb)/(xa-xb)*x+(yb*xa-ya*xb)/(xa-xb);
    }
}
