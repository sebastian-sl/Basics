import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // Using provide configuration in resources
        SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();

        // Opening Connection
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // Getting all Records (query)
        String queryText = "from User";
        Query query = session.createQuery(queryText, User.class);
        List<User> users = query.list();

        System.out.println("All users in List: " + users);

        // Getting one user by Id (get)
        User user = session.get(User.class, 1L);
        session.getTransaction();
        System.out.println("User with given Id: " + user);

        // Getting one user by non-Id (query)
        queryText = "from User WHERE first_name = :VALUE";
        query = session.createQuery(queryText, User.class);
        query.setParameter("VALUE", "Ben");

        User Ben = (User) query.getSingleResult();
        System.out.println("User with name 'Ben': " + Ben);

        // Getting one user with multiple entries by non-Id (query)
        queryText = "from User WHERE last_name = :VALUE";
        query = session.createQuery(queryText, User.class);
        query.setParameter("VALUE", "Miller");

        List <User> Millers = query.list();
        System.out.println("All Users called 'Miller': " + Millers);

        // Updating one user
        user.setFirst_name("Joe");
        user.setLast_name("Biden");

        session.update(user);

        // Create Record
        User newUser = new User(6L, "Hans", "Landa");
        session.save(newUser);

        // Delete Record
        User deleteUser = session.get(User.class, 25L);
        session.delete(deleteUser);

        session.close();
    }

}
