package dio.springdatajpa;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import repository.UserRepository;

@Component
public class StartApp implements CommandLineRunner {
    @Autowired
    private UserRepository repository;
    @Override
    public void run(String... args) throws Exception {
        User user = new User();
        user.setName("Marcos");
        user.setUsername("marcosr3000");
        user.setPassword("12345");

        repository.save(user);

        for(User u: repository.findAll()) System.out.println(u);
    }
}
