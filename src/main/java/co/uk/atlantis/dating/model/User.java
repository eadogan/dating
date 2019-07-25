package co.uk.atlantis.dating.model;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;

import java.util.Set;

@Data
@Builder
public class User {


    @Id
    private long id;
    private String username;
    private String password;
    private Set<Role> roles;

}
