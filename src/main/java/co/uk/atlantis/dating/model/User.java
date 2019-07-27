package co.uk.atlantis.dating.model;

import lombok.Builder;
import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;

import java.util.Set;

@Data
@Builder
public class User {

    @Id
    @Generated
    private String id;
    private String identification;
    private String username;
    private String password;
    private Set<Role> roles;

}
