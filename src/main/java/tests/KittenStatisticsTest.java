package tests;

import lombok.RequiredArgsConstructor;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.myexample.Kitten;
import org.myexample.KittenStatistics;

import java.util.ArrayList;

import java.util.List;
import java.util.Optional;


import static java.util.List.of;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.myexample.Kitten.Gender.FEMALE;
import static org.myexample.Kitten.Gender.MALE;

@RequiredArgsConstructor
public class KittenStatisticsTest {

    KittenStatistics kitty = new KittenStatistics();
    List<Kitten> kittenList = new ArrayList<>(of(
            new Kitten("Micky", Kitten.Gender.MALE, 2),
            new Kitten("Jessi", FEMALE, 5),
            new Kitten("Harry", Kitten.Gender.MALE, 7),
            new Kitten("Moon", FEMALE, 9),
            new Kitten("Lion", Kitten.Gender.MALE, 11)
    ));


    @BeforeEach
    void setUp() {
        kitty.setKittens(kittenList);
    }

    @Test
    void testFindKittensAverageAge() {

        assertEquals(6.8, kitty.findKittensAverageAge());

    }

    @Test
    void testFindOldestKitten() {
        Optional<Kitten> expected = Optional.of(new Kitten("Lion", MALE, 11));
        assertEquals(expected, kitty.findOldestKitten());

    }

    @Test
    void testFindYoungestKittens() {
        List<Kitten> youngestKitten = new ArrayList<>(of(new Kitten("Micky", Kitten.Gender.MALE, 2)));
        assertEquals(youngestKitten, kitty.findYoungestKittens());
    }


    @Test
    void testFindKittensAccordingToGender() {
        List<Kitten> result = new ArrayList<>(List.of(new Kitten("Jessi", FEMALE, 5), new Kitten("Moon", FEMALE, 9)));
        assertEquals(kitty.findKittensAccordingToGender(FEMALE), result);
    }


    @Test
    void testFindKittensBetweenAges() {
        List<Kitten> result = new ArrayList<>(List.of(new Kitten("Micky", MALE, 2), new Kitten("Jessi", FEMALE, 5)));
        assertEquals(kitty.findKittensBetweenAges(1, 5), result);

    }

    @Test
    void testFindFirstKittenWithGivenName() {
        Optional<Kitten> result = Optional.of(new Kitten("Moon", FEMALE, 9));
        assertEquals(kitty.findFirstKittenWithGivenName("Moon"), result);

    }

    @Test
    void testKittensSortedByAgeYoungerFirst() {
        List<Kitten> expected = new ArrayList<>(List.of(
                new Kitten("Micky", Kitten.Gender.MALE, 2),
                new Kitten("Jessi", FEMALE, 5),
                new Kitten("Harry", Kitten.Gender.MALE, 7),
                new Kitten("Moon", FEMALE, 9),
                new Kitten("Lion", Kitten.Gender.MALE, 11)));
        assertEquals(expected, kitty.kittensSortedByAgeYoungerFirst());

    }

    @Test
    void testKittensSortedByAgeOlderFirst() {
        List<Kitten> expected = new ArrayList<>(List.of(
                new Kitten("Lion", Kitten.Gender.MALE, 11),
                new Kitten("Moon", FEMALE, 9),
                new Kitten("Harry", Kitten.Gender.MALE, 7),
                new Kitten("Jessi", FEMALE, 5),
                new Kitten("Micky", Kitten.Gender.MALE, 2)));
        assertEquals(expected, kitty.kittensSortedByAgeOlderFirst());
    }
}
