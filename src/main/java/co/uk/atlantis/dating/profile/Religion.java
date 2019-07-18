package co.uk.atlantis.dating.profile;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Religion {

    UNSPECIFIED("unspecified"),
    ATHEIST("atheist"),
    CHRISTIAN("christian"),
    HINDU("hindu"),
    MUSLIM("muslim"),
    BUDDHIST("buddhist"),
    OTHER("other");

    @Getter
    private final String label;

}