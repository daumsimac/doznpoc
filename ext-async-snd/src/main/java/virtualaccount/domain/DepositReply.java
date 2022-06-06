package virtualaccount.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;
import org.springframework.beans.BeanUtils;
import virtualaccount.ExtAsyncSndApplication;

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

    public static DepositReplyRepository repository() {
        DepositReplyRepository depositReplyRepository = ExtAsyncSndApplication.applicationContext.getBean(
            DepositReplyRepository.class
        );
        return depositReplyRepository;
    }

    public static void depositReplyRcv(
        DepositReplyProcessed depositReplyProcessed
    ) {
        DepositReply depositReply = new DepositReply();
        /*
        LOGIC GOES HERE
        */
        // repository().save(depositReply);

    }
    // keep

}
