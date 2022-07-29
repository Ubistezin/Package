import org.example.Package.ru.netology.sqr.services.SQRService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void normal() {
        SQRService service = new SQRService();

        int expected = 3;
        int actual = service.calculate(200,300);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void minimal() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calculate(100,110);

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void maximal() {
        SQRService service = new SQRService();

        int expected = 1;
        int actual = service.calculate(9801,9810);

        Assertions.assertEquals(expected, actual);
    }

}
