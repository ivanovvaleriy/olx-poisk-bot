import lombok.SneakyThrows;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.AnswerCallbackQuery;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.CallbackQuery;
import org.telegram.telegrambots.meta.api.objects.Message;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.w3c.dom.Text;
import pages.ChallangeTenPage;
import utils.BrowserManager;
import utils.Navigator;


public class OlxPoiskBot extends TelegramLongPollingBot {



    @Override
    public String getBotUsername() {
        return "OlxPoiskBot.";
    }

    @Override
    public String getBotToken() {
        return "1676125498:AAFsZ84d7xznY0yyOo0mwSshIuDgQh8V06o";
    }




    //старт рабочий


    @Override
    public void onUpdateReceived(Update update) {
        // We check if the update has a message and the message has text


        if (update.hasMessage() && update.getMessage().hasText()) {
            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
            if (update.getMessage().getText().equals("/start")) {
                message.setChatId(update.getMessage().getChatId().toString());
                message.setText("Шо тебе найти голова?");
                try {
                    execute(message); // Call method to send the message
                } catch (TelegramApiException e) {
                    e.printStackTrace();

                }





            } else if (update.getMessage().getText().equals("Валерий")) {
                message.setChatId(update.getMessage().getChatId().toString());
                message.setText("Мое уважение " + update.getMessage().getText());
                try {
                    execute(message); // Call method to send the message
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

            } else if (update.hasMessage() && update.getMessage().hasText()) {
                message.setChatId(update.getMessage().getChatId().toString());
                Message message2 = new Message();

                //SendMessage message2 = new SendMessage();
                message2.setText(update.getMessage().getText());
               String BackMessage = String.format(message2.getText());
               // message2.setChatId(update.getMessage().getChatId().toString());
                //get text
                //String BackMessage = update.getMessage().getText();
                message.setText("30 сек, ищу твою хуйню - " + BackMessage);
                try {

                    execute(message); // Call method to send the message

                    // execute(message); //
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }

                // message.setText("Пососи " + ChallangeTenPage.getMess());
                BrowserManager.openBrowser();
                Navigator.openChallengeTenPage();
                try {
                    ChallangeTenPage.searchFor(BackMessage);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //ChallangeTenPage.getAllResoults();
                //String s = ChallangeTenPage.getStAllResoults();
                //MyClass.firstMethod();
                ChallangeTenPage.getStAllResoults();
                //ChallangeTenPage.getStAllResoults();

                message.setText("Нашел твое ебаное - " + ChallangeTenPage.getMess().toString());

                // message.setText("Пососи " + ChallangeTenPage.getMess());
                //message.setText("Пососи " + update.getMessage().getText());
                try {

                    execute(message); // Call method to send the message

                    // execute(message); //
                } catch (TelegramApiException e) {
                    e.printStackTrace();
                }
                BrowserManager.closeBrowser();

            }


        }
    }
}



////
//
//    @SneakyThrows
//    private String handleCallback(CallbackQuery CallbackQuery) {
//        String param = CallbackQuery.getMessage().getText().toString();
//        String CharSequence = CallbackQuery.getMessage().getText();
//        ChallangeTenPage thread = new ChallangeTenPage(CharSequence);
//
//        String BackMessage = param;
//        Navigator.openChallengeTenPage().searchFor(BackMessage);
//
//        //                    Navigator.openChallengeTenPage().searchFor(answerThread).getAllResoults();
//
////        var ChallangeTenPage = Navigator.openChallengeTenPage().searchFor(param).getAllResoults();
//        Navigator.openChallengeTenPage().searchFor(CharSequence).getAllResoults();
//        return param;
//    }
//    @SneakyThrows
//    private void handleMessage(Message message) {
//        // handle command
//        if (message.hasText() ) {
//            String messageText = message.getText();
//            Navigator.openChallengeTenPage().searchFor(messageText).getAllResoults();
////            Currency originalCurrency = currencyModeService.getOriginalCurrency(message.getChatId());
////            Currency targetCurrency = currencyModeService.getTargetCurrency(message.getChatId());
////            double ratio = currencyConversionService.getConversionRatio(originalCurrency, targetCurrency);
//
//            }
//        }
//
//
//    }
//
//
//
//
//











//        if (update.hasMessage() && update.getMessage().hasText()) {
//            SendMessage message = new SendMessage(); // Create a SendMessage object with mandatory fields
//            if (update.getMessage().getText().equals("/start")) {
//                message.setChatId(update.getMessage().getChatId().toString());
//                message.setText("Напиши свое имя голова ");
//                try {
//                    execute(message); // Call method to send the message
//                } catch (TelegramApiException e) {
//                    e.printStackTrace();
//
//                }
//
//
//
//
//            }
//            else  if(update.hasCallbackQuery()) {
//                AnswerCallbackQuery answerThread = new AnswerCallbackQuery(update.getCallbackQuery());
//
//            }
//            else if (update.getMessage().hasText()) {
//
////                    ThreadClass thread = new ThreadClass(update.getMessage().getText());
////                } else  if(update.hasCallbackQuery()) {
////                    AnswerCallbackThread answerThread = new AnswerCallbackThread(update.getCallbackQuery());
////                }
//                AnswerCallbackQuery answera = new AnswerCallbackQuery(update.getCallbackQuery());
//                try {
//
////                    MessageText messageText = new messageText(update.getMessage());
////                    String s = messageText;
////                    System.out.println(s);
//                    Navigator.openChallengeTenPage().searchFor(answerThread).getAllResoults();
//
//                    return;
//                } catch (InterruptedException e) {
//                    e.printStackTrace();
//
//
//
//
//
//                }
//
//
//
//            } else if (update.getMessage().getText().equals("Валерий")) {
//                message.setChatId(update.getMessage().getChatId().toString());
//                message.setText("Мое уважение " + update.getMessage().getText());
//                try {
//                    execute(message); // Call method to send the message
//                } catch (TelegramApiException e) {
//                    e.printStackTrace();
//                }
//
//            } else if (update.hasMessage() && update.getMessage().hasText()) {
//
//                message.setChatId(update.getMessage().getChatId().toString());
//                message.setText("Пососи " + update.getMessage().getText());
//                try {
//                    execute(message); // Call method to send the message
//                } catch (TelegramApiException e) {
//                    e.printStackTrace();
//                }
//            }

//
//        }



//    }
//
//}










