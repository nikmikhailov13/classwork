package gmail.nikmikhailov13.lesson16.animals;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class CatTest {

  @Test
  void shouldDoMiau() {
    // given
    Cat cat = new Cat();

    // when
    String catVoice = cat.voice();

    // then
    assertEquals("Miau", catVoice);
  }

  @Test
  void shouldSetBreedToCat() {
    // given
    Cat cat = new Cat();

    // when
    cat.setBreed(Breed.BRITISH);
    Breed breed = cat.getBreed();

    // then
    assertEquals(Breed.BRITISH, breed);
  }

  @Test
  void shouldCreateACompleteCat(){
    // given
    Cat cat = new Cat("Amur", 3, 3.7, Breed.DVOROVISH);

    // when
    String catName = cat.getName();
    int catAge = cat.getAge();
    double catWeight = cat.getWeight();
    Breed breed = cat.getBreed();

    // then
    assertEquals(Breed.DVOROVISH, breed);
    assertEquals("Amur", catName);
    assertEquals(3, catAge);
    assertEquals(3.7, catWeight);
  }


}