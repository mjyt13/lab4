import java.util.Scanner;
public class zA4 {
    public static void main(String[] args) {
        Scanner Vv = new Scanner(System.in);
        System.out.println("введите массу одной пачки в граммах");
        double A = Vv.nextDouble();
        A = A/1000;
        System.out.println("введите массу израсходованных вместе кофе и цикория в килограммах");
        double B = Vv.nextDouble();
        System.out.println("введите количество частей кофе");
        int X = Vv.nextInt();
        System.out.println("введите количество частей цикория");
        int Y = Vv.nextInt();
        System.out.println("введите количество частей желудей");
        int Z = Vv.nextInt();
        System.out.println("введите количество частей каштанов");
        int W = Vv.nextInt();
        double m1 = A/(X+Y+Z+W);
        double mk = m1 * X;
        double mz = m1 * Y;
        int N = (int) ((B/(mk+mz))-(B%(mk+mz)));
        System.out.printf("Было изготовлено "+N+" пачек напитка");
    }
}