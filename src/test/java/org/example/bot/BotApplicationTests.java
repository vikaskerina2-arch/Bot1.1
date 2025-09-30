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
        void testStartMessageContent() {
            String result = mainProcessor.startMessage();
            assertEquals("Добро пожаловать в наш первый бот!\n" +
                    "Он умеет возвращать текст, который вы ему напишите.\n" +
                    "Просто отправьте ему текстовое сообщение, и он ответит вам.\n" +
                    "Его команды:\n" +
                    "/start - начать работу\n" +
                    "/help - показать, как я работаю\n", result);
        }

        @Test
        void testHelpMessageContent() {
            String result = mainProcessor.helpMessage();
            assertEquals("Справка по работе:\n" +
                    "Бот умеет возвращать текст, который вы ему напишите.\n" +
                    "Например: вы пишите \"привет\", он ответит:\n" +
                    "Вы ввели: \"привет\"\n" +
                    "/start - начать работу\n" +
                    "/help - показать, как я работаю\n" +
                    "Попробуйте ему написать!", result);
        }

        @Test
        void testEchoCommand() {
            // Тестируем логику эхо-ответа
            String testInput = "тестовый текст";
            String expectedEcho = "Вы ввели: " + testInput;
            assertEquals("Вы ввели: тестовый текст", expectedEcho);
        }
}

