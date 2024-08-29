package attestation.attestation01;

import attestation.attestation01.model.User;
import attestation.attestation01.repositories.UsersRepository;
import attestation.attestation01.repositories.UsersRepositoryFileImpl;

import java.time.LocalDateTime;

public class App {
    public static void main(String[] args) {

        String filePath = "src/attestation/attestation01/Users.TXT";


        UsersRepository usersRepository = new UsersRepositoryFileImpl(filePath);

        // Создаем и добавляем пользователей
        User user1 = new User("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.now(), "user1", "password1", "password1", "Мальцев", "Леша", null, 25, true);
        User user2 = new User("k5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.now(), "user2", "password2", "password2", "Кравец", "Марина", null, 30, false);
        User user3 = new User("d5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.now(), "noisemc_99", "password3", "password3", "Крылов", "Виктор", "Павлович", 25, false);
        usersRepository.create(user1);
        usersRepository.create(user2);
        usersRepository.create(user3);

        // Поиск пользователя по ID
        User foundUser = usersRepository.findById("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2");
        System.out.println("Найден пользователь: " + foundUser.getLogin());

        // Выгрузка всех пользователей
        System.out.println("Все пользователи:");
        for (User user : usersRepository.findAll()) {
            System.out.println(user.getLogin());
        }

        // Обновление данных пользователя
        user1.setLogin("updatedUser1");
        usersRepository.update(user1);
        System.out.println("Обновленный пользователь: " + usersRepository.findById("d5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2").getLogin());

        // Удаление пользователя по ID
        usersRepository.deleteById("k5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2");
        System.out.println("Пользователь с ID k5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2 удален");

        // Удаление всех пользователей
//        usersRepository.deleteAll();
//        System.out.println("Все пользователи удалены");
    }
}
