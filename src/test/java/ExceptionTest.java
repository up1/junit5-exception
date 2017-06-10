import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class ExceptionTest {

    @Test
    @DisplayName("ทดสอบเกี่ยวกับ Exception ใน JUnit 5")
    @Tag("exception-testing")
    public void throwRuntimeException(){
        Throwable throwable = assertThrows(DivideByZeroException.class, () -> {
            new Calculator().divide(1, 0);
        });

        assertAll(
                ()-> assertEquals("กากนะ", throwable.getMessage()),
                () -> assertNull(throwable.getCause())
        );
    }

}
