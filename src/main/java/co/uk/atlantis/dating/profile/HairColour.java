package co.uk.atlantis.dating.profile;

import lombok.AllArgsConstructor;
import lombok.Getter;


@AllArgsConstructor
public enum HairColour {

    UNSPECIFIED("unspecified"),
    BLACK("colour.black"),
    BROWN("colour.brown"),
    BLOND("colour.blond"),
    AUBURN("colour.auburn"),
    CHESTNUT("colour.chestnut"),
    GINGER("colour.ginger"),
    GRAY("colour.gray"),
    WHITE("colour.white"),
    BALD("colour.bald"),
    COLOURED("colour.coloured"),
    STREAKED("colour.streaked"),
    DYED("colour.dyed");

    @Getter
    private final String label;

}