import org.example.Package.ru.netology.sqr.services.SQRService;

public class Main {

    public static void main(String[] args) {
        SQRService service = new SQRService();
        System.out.println(service.calculate(200,300));
        System.out.println(service.calculate(400,500));

    }
}
