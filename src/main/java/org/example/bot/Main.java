package org.example.bot;

public class Main {

    public void processUserInput(String userInput, String userId) {
        System.out.println("сообщение: " + userInput + " от: " + userId);
        String outputText;

        if ("/start".equals(userInput)) {
            outputText = startMessage();
        } else if ("/help".equals(userInput)) {
            outputText = helpMessage();
        } else {
            outputText = "Вы ввели: " + userInput;
        }

        System.out.println("Ответ: " + outputText);
    }

    // Изменим модификаторы доступа на public
    public String startMessage() {
        return "Добро пожаловать в наш первый бот!\n" +
                "Он умеет возвращать текст, который вы ему напишите.\n" +
                "Просто отправьте ему текстовое сообщение, и он ответит вам.\n" +
                "Его команды:\n" +
                "/start - начать работу\n" +
                "/help - показать, как я работаю\n";
    }

    public String helpMessage() {
        return "Справка по работе:\n" +
                "Бот умеет возвращать текст, который вы ему напишите.\n" +
                "Например: вы пишите \"привет\", он ответит:\n" +
                "Вы ввели: \"привет\"\n" +
                "/start - начать работу\n" +
                "/help - показать, как я работаю\n" +
                "Попробуйте ему написать!";
    }
}