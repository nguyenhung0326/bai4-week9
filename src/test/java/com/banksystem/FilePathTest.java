package com.banksystem;

import org.junit.jupiter.api.Test;
import java.nio.file.Path;
import java.nio.file.Paths;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class FilePathTest {

    @Test
    public void testCrossPlatformFilePath() {
        // Sử dụng java.nio.file.Paths để tự động tạo đường dẫn đúng cho cả 3 hệ điều hành
        Path safePath = Paths.get("logs", "transaction.log");

        assertNotNull(safePath.toString());
        System.out.println("Đường dẫn an toàn trên HĐH này là: " + safePath.toString());
    }
}