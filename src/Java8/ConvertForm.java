package Java8;

@java.lang.FunctionalInterface
public interface ConvertForm<T, F> {
    F Convert(T form);
}
