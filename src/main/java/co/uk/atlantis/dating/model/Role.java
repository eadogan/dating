package co.uk.atlantis.dating.model;


import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    ROLE_ADMIN,
    ROLE_USER,
    ROLE_ANONYMUS;

    public String getAuthority() {
        return name();
    }

}
