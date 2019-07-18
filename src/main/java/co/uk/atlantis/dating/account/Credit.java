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


    @Builder
    public Credit(long id,
                  Integer tokens,
                  User user,
                  Date createdAt,
                  Date updatedAt) {
        super(createdAt, updatedAt);
        this.id = id;
        this.tokens = tokens;
        this.user = user;
    }
}
