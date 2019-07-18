package co.uk.atlantis.dating.profile;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Education {

    UNSPECIFIED("unspecified"),
    SECONDARY("secondary"),
    COLLEGE("college"),
    OPEN_UNIVERSITY("open_university"),
    UNIVERSITY("university");

    @Getter
    private final String label;

}
