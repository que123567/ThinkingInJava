package Java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Stream;

public interface Formula {
    public void add();

    default public int srqt() {
        return 1;
    }


    public static void main(String[] args) {
        List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");
        List<Integer> ages = Arrays.asList(3, 5, 1, 9);
        Collections.sort(names, (String a, String b) -> {return a.compareTo(b);});
        Collections.sort(names, (String a, String b) -> a.compareTo(b));
        ages.sort((a, b) -> a.compareTo(b));

        ConvertForm<String, Long> convertForm = (from) -> Long.valueOf(from);

        System.out.println(convertForm.Convert("123"));

        ConvertForm<String, Integer> converter = Integer::valueOf;

        PersonFactory<Person> personFactory = Person::new;
        PersonMockFactory<Person> personPersonMockFactory = Person::new;

        Predicate<String> isEmpty = String::isEmpty;
        Predicate<String> isNull = Objects::nonNull;
        System.out.println(isEmpty.and(isNull).test("1"));


        int num = 1;
        ConvertForm<Integer, String> stringConverter =
                (from) -> String.valueOf(from + num);

        System.out.println(stringConverter.Convert(2));

        Predicate<String> predicate = (s) -> test();
        System.out.println(predicate.test("100"));
        System.out.println(predicate.test(""));


        Function<String, Integer> toInteger = Integer::valueOf;
        Function<String, String> backToString = toInteger.andThen(String::valueOf);
        System.out.println(sqrt.apply(12.0));

        Consumer<Person> greeter = (p) -> System.out.println("Hello, " + p.First);
        greeter.accept(new Person("Luke", "Skywalker"));

        Stream.of("a1", "a2", "a3").map(s -> s.substring(1)).mapToInt(Integer::parseInt).max().ifPresent(System.out::println);

        Arrays.asList("1", "a", "a3").stream().filter(s -> s.startsWith("a")).map(String::toLowerCase).sorted().forEach(System.out::println);

        Arrays.asList("1","a","a3").stream().filter(s->s.startsWith("a")).map(String::toLowerCase).sorted().forEach(System.out::println);

    }

    Function<Double, Double> sqrt = input -> Math.sqrt(input);

    public static boolean test() {
        return false;
    }
}

