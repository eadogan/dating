package co.uk.atlantis.dating.repository;

import co.uk.atlantis.dating.account.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, Long> {

    Optional<User> findByUsername(String username);

}