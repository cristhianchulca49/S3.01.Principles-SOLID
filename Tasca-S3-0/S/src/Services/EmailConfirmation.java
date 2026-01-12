package Services;

import Model.User;
import Services.Exceptions.FailConfirmationException;

public class EmailConfirmation {

    public void sendEmailConfirmation(String message, User user) throws FailConfirmationException {
        System.out.println(message + user.email());
        boolean userConfirmed = true;
        if (!userConfirmed) {
            throw new FailConfirmationException("⚠️ User did not confirm registration.");
        }
    }
}
