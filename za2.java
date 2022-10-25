import java.util.Scanner;
public class za2 {
    public static void main(String[] args) {
        Scanner VV = new Scanner(System.in);
        System.out.println("введите длину круговой трассы в км");
        double L = VV.nextDouble();
        System.out.println("введите скорость первого автомобиля в км/ч");
        double v1 = VV.nextDouble();
        System.out.println("введите время в минутах, через которое первый автомобиль обгонет второй на n кругов");
        double t = VV.nextDouble();
        t=t/60;
        if (L<=0 || v1<=0 || t<=0){
            System.out.println("длина трассы, время и скорость не могут быть меньше нуля в этой задаче");
        }else{
            System.out.println("введите количество кругов, на которое опережает первый автомобиль");
            double n = VV.nextDouble();
            if(v1<(L*n)/t){
                System.out.println("у первого автомобиля недостаточно высокая скорость");
            }else{
                double v2=v1-(L*n)/t;
                System.out.println("скорость второго автомобиля "+v2+" км/ч ");
            }
        }
    }
}
