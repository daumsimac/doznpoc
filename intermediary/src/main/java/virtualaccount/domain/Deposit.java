package virtualaccount.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import virtualaccount.IntermediaryApplication;
import virtualaccount.domain.DepositMsgSent;

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
        DepositMsgSent depositMsgSent = new DepositMsgSent();
        BeanUtils.copyProperties(this, depositMsgSent);
        depositMsgSent.publishAfterCommit();
    }

    public static DepositRepository repository() {
        DepositRepository depositRepository = IntermediaryApplication.applicationContext.getBean(
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
