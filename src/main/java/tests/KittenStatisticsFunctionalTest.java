package tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.myexample.Kitten;
import org.myexample.KittenStatisticsFunctional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.myexample.Kitten.Gender.FEMALE;
import static org.myexample.Kitten.Gender.MALE;

public class KittenStatisticsFunctionalTest {

    KittenStatisticsFunctional kittenStatisticsFunctional = new KittenStatisticsFunctional();

    List<Kitten> kittenList = new ArrayList<>(of(
            new Kitten("Micky", Kitten.Gender.MALE, 2),
            new Kitten("Jessi", FEMALE, 5),
            new Kitten("Harry", Kitten.Gender.MALE, 7),
            new Kitten("Moon", FEMALE, 9),
            new Kitten("Lion", Kitten.Gender.MALE, 11)
    ));

    @BeforeEach
    void setUp() {
        kittenStatisticsFunctional.setKittens(kittenList);
    }

    @Test
    void testFindKittensAverageAge() {
        assertEquals(6.8, kittenStatisticsFunctional.findKittensAverageAge());

    }

    @Test
    void testFindOldestKitten() {
        Optional<Kitten> expected = Optional.of(new Kitten("Lion", MALE, 11));
        assertEquals(expected, kittenStatisticsFunctional.findOldestKitten());

    }

    @Test
    void testFindYoungestKittens() {
        List<Kitten> youngestKitten = new ArrayList<>(of(new Kitten("Micky", Kitten.Gender.MALE, 2)));
        assertEquals(youngestKitten, kittenStatisticsFunctional.findYoungestKittens());
    }


    @Test
    void testFindKittensAccordingToGender() {
        List<Kitten> result = new ArrayList<>(List.of(new Kitten("Jessi", FEMALE, 5), new Kitten("Moon", FEMALE, 9)));
        assertEquals(kittenStatisticsFunctional.findKittensAccordingToGender(FEMALE), result);
    }


    @Test
    void testFindKittensBetweenAges() {
        List<Kitten> result = new ArrayList<>(List.of(new Kitten("Micky", MALE, 2), new Kitten("Jessi", FEMALE, 5)));
        assertEquals(kittenStatisticsFunctional.findKittensBetweenAges(1, 5), result);

    }

    @Test
    void testFindFirstKittenWithGivenName() {
        Optional<Kitten> result = Optional.of(new Kitten("Moon", FEMALE, 9));
        assertEquals(kittenStatisticsFunctional.findFirstKittenWithGivenName("Moon"), result);

    }

    @Test
    void testKittensSortedByAgeYoungerFirst() {
        List<Kitten> expected = new ArrayList<>(List.of(
                new Kitten("Micky", Kitten.Gender.MALE, 2),
                new Kitten("Jessi", FEMALE, 5),
                new Kitten("Harry", Kitten.Gender.MALE, 7),
                new Kitten("Moon", FEMALE, 9),
                new Kitten("Lion", Kitten.Gender.MALE, 11)));
        assertEquals(expected, kittenStatisticsFunctional.kittensSortedByAgeYoungerFirst());

    }

    @Test
    void testKittensSortedByAgeOlderFirst() {
        List<Kitten> expected = new ArrayList<>(List.of(
                new Kitten("Lion", Kitten.Gender.MALE, 11),
                new Kitten("Moon", FEMALE, 9),
                new Kitten("Harry", Kitten.Gender.MALE, 7),
                new Kitten("Jessi", FEMALE, 5),
                new Kitten("Micky", Kitten.Gender.MALE, 2)));
        assertEquals(expected, kittenStatisticsFunctional.kittensSortedByAgeOlderFirst());
    }
}




