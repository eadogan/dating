package co.uk.atlantis.dating.profile;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum EyeColour{

    UNSPECIFIED("unspecified"),
    BROWN("colour.brown"),
    HAZEL("colour.hazel"),
    BLUE("colour.blue"),
    GREEN("colour.green"),
    SILVER("colour.silver"),
    AMBER("colour.amber"),
    MIXED("colour.mixed");

    @Getter
    private String label;

}