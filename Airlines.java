import java.util.Scanner;

public class Airlines {
    public static void main(String[] args) {
        double baby = 0.5;
        double teen = 0.9;
        double old = 0.7;
        double twoway = 1.6;
        double rate = 0.1;
        double distance,cost,p1=0,p2;
        int w,dis;
        Scanner input = new Scanner(System.in);

        System.out.println("Patika havayollarına hoşgeldiniz");
        System.out.println("Lütfen gitmek istediğiniz mesafeyi yazın : ");
        distance = input.nextDouble();

        System.out.println("Tek Yön veya Gidiş-Dönüş seçiniz : ");
        System.out.println("1 : Tek Yön \n2 : Gidiş-Dönüş");
        w = input.nextInt();

        System.out.println("Lütfen indirim tarifenizi seçiniz");
        System.out.println("1 : Çocuk\n2 : Genç\n3 : Yaşlı\n4 : İndirim tarifesi istemiyorum");
        dis = input.nextInt();

        switch (w) {
            case 1:
                p1 = 1;
                break;
            case 2:
                p1 = twoway;
                break;
        }
        switch (dis){
            case 1 :
                p2 = baby;
                break;
            case 2 :
                p2 = teen;
                break;
            case 3 :
                p2 = old;
                break;
            default :
                p2 = 1;
            }
        cost = distance*rate*p1*p2;
        System.out.print("Bilet Fiyatı : ");
        System.out.println(cost+" TL");
    }
}
