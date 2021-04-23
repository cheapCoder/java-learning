import java.util.*;

public class DAO<T> {
    Map<String, T> map = new HashMap<>();

    public void save(String id, T entity) {
        map.put(id, entity);
    }

    public T get(String id) {
        return map.get(id);
    }

    public void update(String id, T entity) {
        map.put(id, entity);
    }

    public List<T> list() {
        return new ArrayList<>(map.values());
    }

    public void delete(String id) {
        map.remove(id);
    }
}

class User {
    private int id;
    private int age;
    private String name;

    public User(int age, String name) {
        this.id = (int) new Date().getTime();
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}

class Test {
    public static void main(String[] args) {
        DAO<User> dao = new DAO<>();
        dao.save("H", new User(22, "liheng"));
        System.out.println(dao.get("H"));;
        dao.update("H", new User(18, "liusijie"));
        for(User user: dao.list()) {
            System.out.println(user);
        }
        dao.delete("H");
        System.out.println(dao.list());
    }
}
