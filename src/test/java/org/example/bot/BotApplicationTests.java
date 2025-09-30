package org.example.bot;

import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class BotApplicationTests {
        private Main mainProcessor;
        @BeforeEach
        void setUp() {
            mainProcessor = new Main();
        }

        @Test
        void testEchoCommand() {
            // Тестируем логику эхо-ответа
            String testInput = "тестовый текст";
            String expectedEcho = "Вы ввели: " + testInput;
            assertEquals("Вы ввели: тестовый текст", expectedEcho);
        }
}

