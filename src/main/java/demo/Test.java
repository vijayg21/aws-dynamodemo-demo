package demo;

import demo.model.InputModel;
import demo.service.EmailService;

public class Test {

    public static void main(String[] args) {
        InputModel inputModel = new InputModel();
        inputModel.setSubject("AWS SES MAIL");
        inputModel.setMessage("Hello Vijay");
        inputModel.setToEmail("vijaygangadhaaram@gmail.com");
        inputModel.setFromEmail("vijaygangadharamind@gmail.com");
        EmailService emailService = new EmailService();
        emailService.sendEmail(inputModel, null);
    }
}
