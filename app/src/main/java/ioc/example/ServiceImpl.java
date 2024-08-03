package ioc.example;

// ServiceImpl.java
public class ServiceImpl implements IService {
    private final IRepository repository;

    // Constructor Injection
    public ServiceImpl(IRepository repository) {
        this.repository = repository;
    }

    @Override
    public void performAction(String data) {
        System.out.println("Performing action with data: " + data);
        repository.save(data);
    }
}
