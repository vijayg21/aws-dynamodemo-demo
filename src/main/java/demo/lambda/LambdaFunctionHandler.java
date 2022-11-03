package demo.lambda;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import com.amazonaws.services.lambda.runtime.events.SNSEvent;
import demo.model.InputModel;
import demo.service.EmailService;


public class LambdaFunctionHandler {

    EmailService emailService = new EmailService();

    public String handleRequest(InputModel inputModel, Context context) {
        emailService.sendEmail(inputModel,context);
        return "Successfully sent mail";
    }
}