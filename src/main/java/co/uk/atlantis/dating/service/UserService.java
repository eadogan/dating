package co.uk.atlantis.dating.service;

import co.uk.atlantis.dating.model.Role;
import co.uk.atlantis.dating.model.User;
import co.uk.atlantis.dating.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.*;


@Service
public class UserService implements UserDetailsService {
	
	@Autowired
	private UserRepository repository;

	@Autowired
	private BCryptPasswordEncoder bcryptEncoder;

	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		User user = repository.findByUsername(username);
		if(user == null){
			throw new UsernameNotFoundException("Invalid username or password.");
		}
		return new org.springframework.security.core.userdetails.User(user.getUsername(), user.getPassword(), user.getRoles());
	}

	public List<User> findAll() {
		List<User> list = new ArrayList<>();
		repository.findAll().iterator().forEachRemaining(list::add);
		return list;
	}

	public void delete(long id) {
		repository.deleteById(id);
	}

	public User findOne(String username) {
		return repository.findByUsername(username);
	}

	public User findById(Long id) {
		return repository.findById(id).get();
	}

    public User save(User user) {
	    user.setUsername(user.getUsername());
	    user.setPassword(bcryptEncoder.encode(user.getPassword()));
	    user.setRoles(Collections.singleton(Role.ROLE_ANONYMUS));
        return repository.save(user);
    }
}
