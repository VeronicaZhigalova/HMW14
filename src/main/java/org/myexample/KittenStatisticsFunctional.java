package org.myexample;

import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class KittenStatisticsFunctional {

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
     * Используйте Stream
     * @return Средний возраст котят в виде double.
     */
    public double findKittensAverageAge() {
       return 0;
    }

    /**
     * Находит самого старшего котенка в списке.
     * Используйте Stream
     * @return Самый старший котенок в виде Optional.
     */
    public Optional<Kitten> findOldestKitten() {
        return null;
    }

    /**
     * Находит самых младших котят в списке.
     * Используйте Stream
     * @return Список самых младших котят.
     */
    public List<Kitten> findYoungestKittens() {
        return null;
    }

    /**
     * Находит котят по заданному полу.
     * Используйте Stream
     * @param gender Пол котят (Kitten.Gender).
     * @return Список котят, соответствующих заданному полу.
     */
    public List<Kitten> findKittensAccordingToGender(Kitten.Gender gender) {
        return null;
    }

    /**
     * Находит котят в заданном диапазоне возрастов.
     * Используйте Stream
     * @param minAge Минимальный возраст.
     * @param maxAge Максимальный возраст.
     * @return Список котят в указанном диапазоне возрастов.
     */
    public List<Kitten> findKittensBetweenAges(int minAge, int maxAge) {
        return null;
    }

    /**
     * Находит первого котенка с заданным именем (регистронезависимо).
     * Используйте Stream
     * @param givenName Заданное имя котенка.
     * @return Первый котенок с указанным именем в виде Optional.
     */
    public Optional<Kitten> findFirstKittenWithGivenName(String givenName) {
        return null;
    }

    /**
     * Возвращает список котят, отсортированный по возрасту (младшие впереди).
     * Используйте Stream
     * @return Список котят, отсортированный по возрасту (младшие впереди).
     */
    public List<Kitten> kittensSortedByAgeYoungerFirst() {
        return null;
    }

    /**
     * Возвращает список котят, отсортированный по возрасту (старшие впереди).
     * Используйте Stream
     * @return Список котят, отсортированный по возрасту (старшие впереди).
     */
    public List<Kitten> kittensSortedByAgeOlderFirst() {
        return null;
    }

}
