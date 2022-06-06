package virtualaccount.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import virtualaccount.DepositreplyprocessApplication;
import virtualaccount.domain.DepositReplyProcessed;

@Entity
@Table(name = "DepositReply_table")
@Data
public class DepositReply {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String bnk_c;

    private String org_c;

    private String tgrm_dsc;

    @PostPersist
    public void onPostPersist() {
        DepositReplyProcessed depositReplyProcessed = new DepositReplyProcessed();
        BeanUtils.copyProperties(this, depositReplyProcessed);
        depositReplyProcessed.publishAfterCommit();
    }

    public static DepositReplyRepository repository() {
        DepositReplyRepository depositReplyRepository = DepositreplyprocessApplication.applicationContext.getBean(
            DepositReplyRepository.class
        );
        return depositReplyRepository;
    }

    public static void depositReplyRcv(DepositReplySent depositReplySent) {
        DepositReply depositReply = new DepositReply();
        /*
        LOGIC GOES HERE
        */
        // repository().save(depositReply);

    }
    // keep

}
