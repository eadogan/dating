package co.uk.atlantis.dating.account;

import co.uk.atlantis.dating.db.Auditable;
import co.uk.atlantis.dating.profile.Profile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Locale;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class User extends Auditable {

    private long id;
    private Set<Role> roles;
    private Credential credential;
    private String firstName;
    private String email;
    private String password;
    private String postCode;
    private Locale country;
    private Profile profile;
    private Credit credit;
    private Unit preferredUnit;
}
