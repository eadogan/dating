package co.uk.atlantis.dating.account;

import co.uk.atlantis.dating.db.Auditable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Credit extends Auditable {

    private long id;
    private Integer tokens;
    private User user;

}
