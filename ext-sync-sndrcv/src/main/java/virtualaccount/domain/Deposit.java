package virtualaccount.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import virtualaccount.ExtSyncSndrcvApplication;
import virtualaccount.domain.DepositMsgSent;
import virtualaccount.domain.DepositReplySent;

@Entity
@Table(name = "Deposit_table")
@Data
public class Deposit {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String bnk_c;

    private String org_c;

    private String tgrm_dsc;

    @PostPersist
    public void onPostPersist() {
//        DepositMsgSent depositMsgSent = new DepositMsgSent();
//        BeanUtils.copyProperties(this, depositMsgSent);
//        depositMsgSent.publishAfterCommit();

        DepositReplySent depositReplySent = new DepositReplySent();
        BeanUtils.copyProperties(this, depositReplySent);
        depositReplySent.publishAfterCommit();
    }

    public static DepositRepository repository() {
        DepositRepository depositRepository = ExtSyncSndrcvApplication.applicationContext.getBean(
            DepositRepository.class
        );
        return depositRepository;
    }

    public static void depositMsgReq(DepositMsgSent depositMsgSent) {
        Deposit deposit = new Deposit();
        /*
        LOGIC GOES HERE
        */
        // repository().save(deposit);

    }
    // keep

}
