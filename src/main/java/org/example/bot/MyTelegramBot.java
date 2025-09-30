package org.example.bot;

import org.springframework.stereotype.Component;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

@Component
public class MyTelegramBot extends TelegramLongPollingBot {

    private final Main mainProcessor = new Main();

    @Override
    public void onUpdateReceived(Update update) {
        if (update.hasMessage() && update.getMessage().hasText()) {
            String userInput = update.getMessage().getText();
            String userId = update.getMessage().getFrom().getId().toString();

            mainProcessor.processUserInput(userInput, userId);

            String responseText;
            if ("/start".equals(userInput)) {
                responseText = mainProcessor.startMessage();
            } else if ("/help".equals(userInput)) {
                responseText = mainProcessor.helpMessage();
            } else {
                responseText = "Вы ввели: " + userInput;
            }

            SendMessage message = new SendMessage();
            message.setChatId(update.getMessage().getChatId().toString());
            message.setText(responseText);

            try {
                execute(message); // Убрали статический импорт
            } catch (TelegramApiException e) {
                e.printStackTrace();
            }
        }
    }

    @Override
    public String getBotUsername() {
        return "test_my_super_demo_bot";  // Замените на имя вашего бота
    }

    @Override
    public String getBotToken() {
        return "8371469199:AAH6HpFEje3PqgwLHjMXdyhmYVJiIQxCUmA";  // Замените на токен от @BotFather
    }
}