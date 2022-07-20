import org.example.Package.ru.netology.sqr.services.SQRService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void CalcSqrt() {
        SQRService service = new SQRService();

        int expected = 12;
        int actual = service.CalcSqrt(144);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CalcSqrt2() {
        SQRService service = new SQRService();

        int expected = 13;
        int actual = service.CalcSqrt(169);

        Assertions.assertEquals(expected, actual);
    }
}