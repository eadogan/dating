package co.uk.atlantis.dating.profile;

import co.uk.atlantis.dating.account.User;
import co.uk.atlantis.dating.db.Auditable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Profile extends Auditable {

    private long id;
    private User user;
    private Gender gender;
    private MatchedGender matchedGender;
    private LocalDate dateOfBirth;
    private String profileName;
    private String profileMessage;
    private String tagLine;
    private BodyType bodyType;
    private EyeColour eyeColour;
    private HairColour hairColour;
    private Integer weight;
    private Integer height;
    private Ethnicity ethnicity;
    private Religion religion;
    private Education education;
    private TriStateType smoker;
    private TriStateType drivingLicence;
    private TriStateType alcoholDrinker;
    private TriStateType children;
    private TriStateType youngChildren;
    private TriStateType employed;

}
