package co.uk.atlantis.dating.account;

import co.uk.atlantis.dating.db.Auditable;
import co.uk.atlantis.dating.profile.Profile;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;
import java.util.Locale;
import java.util.Set;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User extends Auditable implements UserDetails {

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

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
