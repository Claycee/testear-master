import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    Person p ;
    @BeforeEach
    void setUp() {
        p = new Person("45673254S" , "correo");
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getDni() {
        assertEquals("45673254S", p.getDni());
    }

    @Test
    void setDni() {
    }

    @Test
    void getCorreo() {
    }

    @Test
    void setCorreo() {
    }

    @org.junit.jupiter.api.Test
    void testGetName() {
    }

    @org.junit.jupiter.api.Test
    void testSetName() {
    }

    @org.junit.jupiter.api.Test
    void testGetCorreo() {
    }

    @org.junit.jupiter.api.Test
    void testSetCorreo() {
    }
}