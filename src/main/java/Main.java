import org.example.Package.ru.netology.sqr.services.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.CalcSqrt(144));
        System.out.println(service.CalcSqrt(169));
        System.out.println("Количество квадратных корней в этом диапазоне равно 2");

    }
}
