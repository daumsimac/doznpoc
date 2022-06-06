package virtualaccount.infra;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import javax.naming.NameParser;
import javax.naming.NameParser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import virtualaccount.config.kafka.KafkaProcessor;
import virtualaccount.domain.*;

@Service
public class PolicyHandler {

    @Autowired
    DepositReplyRepository depositReplyRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverDepositReplyProcessed_DepositReplyRcv(
        @Payload DepositReplySent depositReplySent
    ) {
        if (!depositReplySent.validate()) return;
        DepositReplySent event = depositReplySent;
        System.out.println(
            "\n\n##### listener DepositReplyRcv : " +
                    depositReplySent.toJson() +
            "\n\n"
        );

        // Sample Logic //
        //DepositReply.depositReplyRcv(event);
    }
    // keep

}
