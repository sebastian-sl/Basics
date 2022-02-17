import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class App {
    public static void main(String[] args) {
        // Using provide configuration in resources
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        // Opening Connection
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        // Getting all Records (create query and get Results)
        String queryText = "from User";
        List<User> users = session.createQuery(queryText, User.class).getResultList();
        System.out.println(users);

        // Getting one user by Id (get and getTransaction)
        User user = session.get(User.class, 1L);
        session.getTransaction();
        System.out.println("User with given Id: " + user);

        // Getting one user by non-Id (create query, set Parameter and get Result)
        queryText = "from User WHERE first_name = :VALUE";
        User Ben = session.createQuery(queryText, User.class).setParameter("VALUE", "Ben").getSingleResult();
        System.out.println("User with name 'Ben': " + Ben);

        // Getting one user with multiple entries by non-Id (create Query, set Parameter and get Results)
        queryText = "from User WHERE last_name = :VALUE";
        List <User> Millers = session.createQuery(queryText, User.class).setParameter("VALUE", "Miller").getResultList();
        System.out.println("All Users called 'Miller': " + Millers);

        // Updating one user
        user.setFirst_name("Joe");
        user.setLast_name("Biden");

        session.update(user);
        System.out.println(user);

        // Create Record
        User newUser = new User(6L, "Hans", "Landa");
        session.save(newUser);

        // Delete Record
        User deleteUser = session.get(User.class, 25L);
        session.delete(deleteUser);

        session.close();
    }

}
