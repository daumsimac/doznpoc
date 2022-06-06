package virtualaccount.domain;

import java.util.Date;
import lombok.Data;
import virtualaccount.domain.*;
import virtualaccount.infra.AbstractEvent;

@Data
public class DepositReplySent extends AbstractEvent {

    private Long id;
    private String bnk_c;
    private String org_c;
    private String tgrm_dsc;

    public DepositReplySent() {
        super();
    }
    // keep

}
