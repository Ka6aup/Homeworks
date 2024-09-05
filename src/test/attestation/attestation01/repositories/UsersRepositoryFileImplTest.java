package attestation.attestation01.repositories;

import attestation.attestation01.model.User;
import org.junit.jupiter.api.*;


import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UsersRepositoryFileImplTest {
    private UsersRepositoryFileImpl userRepositoryFileImpl;
    private final String testFile = "src/test/testUsers.txt";



    @BeforeEach
    void setUp() {
        userRepositoryFileImpl = new UsersRepositoryFileImpl(testFile);


    }


    @Test
    @DisplayName("Создание нового пользователя")
    void testCreate() {
        User user = new User("d5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.now(), "noisemc_98", "password3", "password3", "Крылов", "Виктор", null, 30, true);
        assertDoesNotThrow(() -> userRepositoryFileImpl.create(user));

    }

    @Test
    @DisplayName("Нахождение пользователя по id")
    void testFindById() {
        User user = new User("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.now(), "noisemc_99", "789ghu", "789ghu", "Петров", "Петя", "Петрович", 30, true);
        userRepositoryFileImpl.create(user);
        Assertions.assertNotNull(userRepositoryFileImpl.findById(user.getId()));
    }

    @Test
    @DisplayName("Тест на наличие пользователей")
    void findAll() {
        User user1 = new User("d5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.now(), "noisemc_99", "789ghu", "789ghu", "Петров", "Петя", "Петрович", 30, true);
        userRepositoryFileImpl.create(user1);
        User user2 = new User("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.now(), "noisemc_95", "889ghu", "889ghu", "Метров", "Митя", "Кедрович", 50, true);
        userRepositoryFileImpl.create(user2);
        userRepositoryFileImpl.findAll();

    }

    @Test
    @DisplayName("Тест на измененние пользователя")
    void update() {
        User user = new User("d5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.now(), "noisemc_99", "789ghu", "789ghu", "Петров", "Петя", "Петрович", 30, true);
        userRepositoryFileImpl.create(user);
        String newLogin = "updatedTestUser";
        user.setLogin(newLogin);
        userRepositoryFileImpl.findAll();
        userRepositoryFileImpl.update(user);
        Assertions.assertEquals(userRepositoryFileImpl.findById(user.getId()).getLogin(),newLogin);
        System.out.println();
    }

    @Test
    @DisplayName("Удаление пользователя по id")
    void deleteById() {
        userRepositoryFileImpl.deleteById("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2");
    }

    @Test
    @DisplayName("Тест на удаление всех пользователей")
    void deleteAll() {
        userRepositoryFileImpl.deleteAll();
    }
}