import java.util.Scanner;

public class Main {
    final static int legalAge = 18;

    public static void main(String[] args) throws UserNotFoundException, AccessDeniedException {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите логин");
        String login = scanner.nextLine();
        System.out.println("Введите пароль");
        String password = scanner.nextLine();

        validateUser(getUserByLoginAndPassword(login, password));

        System.out.println("Доступ предоставлен");
    }

    public static User[] getUsers() {
        User user = new User("jhon", "pass", "jhon@gmail.com", 17);
        User user1 = new User("Flacis", "pass", "flacis@mail.ru", 31);
        return new User[]{user1, user};
    }

    public static User getUserByLoginAndPassword(String login, String password) throws UserNotFoundException {
        User[] users = getUsers();
        for (User user : users) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        throw new UserNotFoundException("Пользователь не найден");
    }

    public static void validateUser(User user) throws AccessDeniedException {
        if (user.getAge() < legalAge) {
            throw new AccessDeniedException("Вам меньше 18 лет");
        }
    }
}