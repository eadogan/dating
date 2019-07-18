package co.uk.atlantis.dating.account;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Credential implements Serializable {

    private String emailAddress;
    private String password;
    private User user;
}
