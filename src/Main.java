
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student[] student=new Student[100];
        System.out.println("welcome");
        Scanner scanner=new Scanner(System.in);
        do{

            System.out.println("baraye log in shodan gozine morede nazar ra type konif");
            System.out.println("1.vorod be onvane admin \n2.vorod be onvane daneshjoo");
//            int a=scanner.nextInt();
            int a=scanner.nextInt();
            switch (a){
                case 1:{
                    System.out.println("1");

                    break;
                } case 2:{
                    System.out.println("2");
                    break;
                } default:
                    System.out.println("dastoore tarif nashode\nlotfan dobare dastoore morede nazar ra vared konid");
                    break;
            }

        }while (true);

    }
}