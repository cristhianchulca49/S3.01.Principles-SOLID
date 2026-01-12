import Model.User;
import Services.EmailConfirmation;
import Services.EmailValidation;
import Services.Exceptions.FailConfirmationException;

public class Main {
    public static void main(String[] args) throws FailConfirmationException {

        EmailValidation emailValidation = new EmailValidation();
        EmailConfirmation emailConfirmation = new EmailConfirmation();

        User user = new User("Josep", "joser@ITAcademy.es", "ABC123");

        emailValidation.validation(user);

        String message = "📧 Sending confirmation email to: ";
        emailConfirmation.sendEmailConfirmation(message, user);
    }
}
