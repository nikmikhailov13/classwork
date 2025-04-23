package academy.codillas.classwork.lesson29.animals;

import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class ZooTest {

    @Test
    void shouldFindAFox() {
        // given
        Zoo zoo = new Zoo(1);
        Fox fox = new Fox(3, 4, "Fyrfyrfyr", false);
        zoo.add(fox);

        // when
        Optional<Fox> optionalFox = zoo.searchFoxByName("Fyrfyrfyr");

        // then
        assertTrue(optionalFox.isPresent());
        assertEquals(new Fox(3, 4, "Fyrfyrfyr", false), optionalFox.get(), "Foxes are not equal. Check the equals method.");
    }

    @Test
    void shouldNotFindAFox() {
        // given
        Zoo zoo = new Zoo(1);
        Fox fox = new Fox(3, 4, "Fyrfyrfyr", false);
        zoo.add(fox);

        // when
        Optional<Fox> optionalFox = zoo.searchFoxByName("GavGavGav");

        // then
        assertFalse(optionalFox.isPresent());
    }

}