package co.uk.atlantis.dating.profile;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum BodyType {

    UNSPECIFIED("unspecified"),
    ATHLETIC("body_type.athletic"),
    SLIM("body_type.slim"),
    MUSCULAR("body_type.muscular"),
    STOCKY("body_type.stocky"),
    AVERAGE("body_type.average"),
    AVERAGE_FIT("body_type.average_fit"),
    CURVACEOUS("body_type.curvaceous"),
    CUDDLY("body_type.cuddly"),
    PLUS_SIZED("body_type.plus_sized");

    @Getter
    private final String label;

}
