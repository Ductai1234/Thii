import com.example.demo2.TinhTong;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TinhTongTest {
    TinhTong tinhTong = new TinhTong();
    @Test
    public void test() {
        int exp = 7;
        int act = tinhTong.tong(3,4);
        Assertions.assertEquals(exp, act);
    }

}
