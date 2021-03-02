package ru.job4j.ex;

public class UserStore {

    public static User findUser(User[] users, String login) throws UserNotFoundException {
        for (User user : users) {
            if (user.getUsername().equals(login)) {
                return user;
            }
        }
        throw new UserNotFoundException("User not found");
    }

    public static boolean validate(User user) throws UserInvalidException {
        if (user.getUsername().length() > 2 && user.isValid()) {
            return true;
        }
        throw new UserInvalidException("The user is not valid");
    }

    public static void main(String[] args) {
        try {
            User[] users = {
                    new User("Petr Arsentev", true)
            };
            User user = findUser(users, "Petr Arsentev");
            if (validate(user)) {
                System.out.println("This user has an access");
            }
        } catch (UserNotFoundException un) {
            un.printStackTrace();
        }
    }
}
