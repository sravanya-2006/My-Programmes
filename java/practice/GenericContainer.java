package practice;

public class GenericContainer<T> {
    private T value;

    public GenericContainer(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public static void main(String[] args) {
    
        GenericContainer<Integer> intContainer = new GenericContainer<>(100);
        System.out.println("Integer Value: " + intContainer.getValue());

        GenericContainer<String> stringContainer = new GenericContainer<>("Hello, Generics!");
        System.out.println("String Value: " + stringContainer.getValue());

        intContainer.setValue(200);
        stringContainer.setValue("Generics are powerful!");
        System.out.println("Updated Integer Value: " + intContainer.getValue());
        System.out.println("Updated String Value: " + stringContainer.getValue());
    }
}

