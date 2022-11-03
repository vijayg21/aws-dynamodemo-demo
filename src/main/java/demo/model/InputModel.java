package demo.model;


import lombok.Data;

@Data
public class InputModel {

    private String fromEmail;

    private String toEmail;

    private String message;

    private String subject;
}
