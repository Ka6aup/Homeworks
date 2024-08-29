package attestation.attestation01.model;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UserTest {
    @Test
    void createUserSuccessfully() {
        assertDoesNotThrow(() -> {
            new User("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.now(), "user1", "password1", "password1", "Мальцев", "Леша", null, 30, true);
        });
    }

    @Test
    void gettersTest() {
        User user = new User("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.now(), "user1", "password1", "password1", "Мальцев", "Леша", null, 30, true);
        assertEquals("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", user.getId());
        assertEquals("user1", user.getLogin());
        assertEquals("Мальцев", user.getLastName());
        assertEquals("Леша", user.getFirstName());
        assertNull(user.getMiddleName());
        assertEquals(30, user.getAge());
        assertTrue(user.isWorker());
    }

    @Test
    void invalidIdThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new User("invalid_id", LocalDateTime.now(), "user1", "password1", "password1", "Мальцев", "Леша", null, 30, true);
        });
    }

    @Test
    void invalidLoginThrowsException() {
        assertThrows(IllegalArgumentException.class, () -> {
            new User("f5a8a3cb-4ac9-4b3b-8a65-c424e129b9d2", LocalDateTime.now(), "12345", "password1", "password1", "Мальцев", "Леша", null, 30, true);
        });
    }

}