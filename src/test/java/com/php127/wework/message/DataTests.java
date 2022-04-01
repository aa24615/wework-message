package com.php127.wework.message;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class DataTests {


    @Test
    public void test_init() {

        Data data = new Data();
        data.setText("test");
        Assertions.assertSame("test", data.getText());
    }
}
