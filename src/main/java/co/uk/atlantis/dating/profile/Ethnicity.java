package co.uk.atlantis.dating.profile;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Ethnicity {

    UNSPECIFIED("unspecified"),
    AFRICAN("ethnic.african"),
    ASIAN("ethnic.asian"),
    CAUCASIAN("ethnic.caucasian"),
    HISPANIC("ethnic.hispanic"),
    INDIAN("ethnic.indian");

    @Getter
    private final String label;

}