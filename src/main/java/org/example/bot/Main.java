package org.example.bot;

public class Main {

    public String processUserInput(String userInput, String userId) {
        System.out.println("сообщение: " + userInput + " от: " + userId);
        String outputText = Response(userInput);
        System.out.println("Ответ: " + outputText);
        return outputText;
    }

    private String Response(String userInput){
        if ("/start".equals(userInput)) {
            return startMessage();
        } else if ("/help".equals(userInput)) {
            return helpMessage();
        } else {
            return "Вы ввели: " + userInput;
        }
    }

    String startMessage() {
        return "Добро пожаловать в наш первый бот!\n" +
                "Он умеет возвращать текст, который вы ему напишите.\n" +
                "Просто отправьте ему текстовое сообщение, и он ответит вам.\n" +
                "Его команды:\n" +
                "/start - начать работу\n" +
                "/help - показать, как я работаю\n";
    }

    String helpMessage() {
        return "Справка по работе:\n" +
                "Бот умеет возвращать текст, который вы ему напишите.\n" +
                "Например: вы пишите \"привет\", он ответит:\n" +
                "Вы ввели: \"привет\"\n" +
                "/start - начать работу\n" +
                "/help - показать, как я работаю\n" +
                "Попробуйте ему написать!";
    }
}