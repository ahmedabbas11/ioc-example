package ioc.example;

// RepositoryImpl.java
public class RepositoryImpl implements IRepository {
    @Override
    public void save(String data) {
        System.out.println("Data saved: " + data);
    }
}
