import org.example.Package.ru.netology.sqr.services.SQRService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void CalcSqrttwelve() {
        SQRService service = new SQRService();

        int expected = 12;
        int actual = service.CalcSqrt(144);

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void CalcSqrtthirteen() {
        SQRService service = new SQRService();

        int expected = 13;
        int actual = service.CalcSqrt(169);

        Assertions.assertEquals(expected, actual);
    }
}
// мне не понятен ващ комментарий о том что
// "В условии прописано какие параметры должны быть у сервисного метода, а у вас не так:
//Метод должен принимать два целых числа в параметрах - границы диапазона."
// у меня диапазон 144 - 169 и в нём принимается два целых числа 12 и 13, не могу понять что не так