package ioc.example;

// IoCContainer.java
import java.util.HashMap;
import java.util.Map;

public class IoCContainer {
    private Map<Class<?>, Object> instances = new HashMap<>();

    public <T> void register(Class<T> interfaceType, T instance) {
        instances.put(interfaceType, instance);
    }

    public <T> T resolve(Class<T> interfaceType) {
        return interfaceType.cast(instances.get(interfaceType));
    }
}
