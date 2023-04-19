package com.zyq;

import com.zyq.entity.WxWork;
import org.junit.jupiter.api.Test;
import org.openjdk.jol.info.ClassLayout;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
class ForZyqApplicationTests {

    @Test
    void contextLoads() {
        WxWork wxWork = new WxWork();
        System.out.println(ClassLayout.parseInstance(wxWork).toPrintable());
    }

}
