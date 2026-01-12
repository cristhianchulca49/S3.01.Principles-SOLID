package Services;

import Services.Exceptions.FailConfirmationException;

public class EmailConfirmation {

    public void sendEmailConfirmation(String message, User user) {
        System.out.println(message + user.email());
        boolean userConfirmed = true;
        if (!userConfirmed) {
            throw new FailConfirmationException("⚠️ User did not confirm registration.");
        }
    }
}
