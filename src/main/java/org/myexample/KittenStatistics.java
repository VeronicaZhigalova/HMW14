package org.myexample;

import java.util.*;

public class KittenStatistics {

    private List<Kitten> kittens;

    /**
     * Устанавливает список котят для анализа.
     *
     * @param kittens Список котят.
     */
    public void setKittens(List<Kitten> kittens) {
        this.kittens = kittens;
    }

    /**
     * Находит средний возраст котят в списке.
     * Используйте обычные циклы итд
     *
     * @return Средний возраст котят в виде double.
     */
    public double findKittensAverageAge() {
        int size = kittens.size();
        int sum = 0;
        for (Kitten kitten : kittens) {
            sum += kitten.getAge();

        }
        return (double) sum / size;
    }

    /**
     * Находит самого старшего котенка в списке.
     * Используйте обычные циклы итд
     *
     * @return Самый старший котенок в виде Optional.
     */
    public Optional<Kitten> findOldestKitten() {
        int oldestOfAge = 0;
        Kitten oldest = null;
        for (Kitten kitten : kittens) {
            int age = kitten.getAge();
            if (age > oldestOfAge) {
                age = oldestOfAge;
                oldest = kitten;
            }
        }
        return Optional.ofNullable(oldest);
    }


    /**
     * Находит самых младших котят в списке.
     * Используйте обычные циклы итд
     *
     * @return Список самых младших котят.
     */
    public List<Kitten> findYoungestKittens() {
        List<Kitten> youngest = new ArrayList<>();
        int youngestOfAge = kittens.get(0).getAge();
        for (Kitten kitten : kittens) {
            int age = kitten.getAge();
            if (age < youngestOfAge) {
                youngestOfAge = age;
                youngest.clear();
                youngest.add(kitten);
            } else if (age == youngestOfAge) {
                youngest.add(kitten);
            }
        }
        return youngest;
    }

    /**
     * Находит котят по заданному полу.
     * Используйте обычные циклы итд
     *
     * @param gender Пол котят (Kitten.Gender).
     * @return Список котят, соответствующих заданному полу.
     */
    public List<Kitten> findKittensAccordingToGender(Kitten.Gender gender) {
        List<Kitten> kittensAccordingToGender = new ArrayList<>();
        for (Kitten kitten : kittens) {
            if (kitten.getGender() == gender) {
                kittensAccordingToGender.add(kitten);

            }
        }
        return kittensAccordingToGender;
    }

    /**
     * Находит котят в заданном диапазоне возрастов.
     * Используйте обычные циклы итд
     *
     * @param minAge Минимальный возраст.
     * @param maxAge Максимальный возраст.
     * @return Список котят в указанном диапазоне возрастов.
     */
    public List<Kitten> findKittensBetweenAges(int minAge, int maxAge) {
        List<Kitten> kittensBetweenAges = new ArrayList<>();
        for (Kitten kitten : kittens) {
            if ((kitten.getAge() >= minAge) && (kitten.getAge() <= maxAge)) {
                kittensBetweenAges.add(kitten);

            }
        }
        return kittensBetweenAges;
    }

    /**
     * Находит первого котенка с заданным именем (регистронезависимо).
     * Используйте обычные циклы итд
     *
     * @param givenName Заданное имя котенка.
     * @return Первый котенок с указанным именем в виде Optional.
     */
    public Optional<Kitten> findFirstKittenWithGivenName(String givenName) {
        for (Kitten kitten : kittens) {
            if (kitten.getName().equals(givenName)) {
                return Optional.of(kitten);
            }
        }
        return Optional.empty();
    }

    /**
     * Возвращает список котят, отсортированный по возрасту (младшие впереди).
     * Используйте обычные циклы итд
     *
     * @return Список котят, отсортированный по возрасту (младшие впереди).
     */
    public List<Kitten> kittensSortedByAgeYoungerFirst() {
        List<Kitten> kittensSortedByAgeYoungerFirst = new ArrayList<>(kittens);
        kittensSortedByAgeYoungerFirst.sort(Comparator.comparingInt(Kitten::getAge));
        return kittensSortedByAgeYoungerFirst;
    }

    /**
     * Возвращает список котят, отсортированный по возрасту (старшие впереди).
     * Используйте обычные циклы итд
     *
     * @return Список котят, отсортированный по возрасту (старшие впереди).
     */
    public List<Kitten> kittensSortedByAgeOlderFirst() {
        List<Kitten> kittensSortedByAgeOlderFirst = new ArrayList<>(kittens);
        kittensSortedByAgeOlderFirst.sort(Comparator.comparingInt(Kitten::getAge).reversed());
        return kittensSortedByAgeOlderFirst;
    }
}
