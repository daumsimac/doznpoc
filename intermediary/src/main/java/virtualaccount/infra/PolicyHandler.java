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
    DepositRepository depositRepository;

    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString) {}

    @StreamListener(KafkaProcessor.INPUT)
    public void wheneverDepositMsgSent_DepositMsgReq(
        @Payload DepositMsgSent depositMsgSent
    ) {
        if (!depositMsgSent.validate()) return;
        DepositMsgSent event = depositMsgSent;
        System.out.println(
            "\n\n##### listener DepositMsgReq : " +
            depositMsgSent.toJson() +
            "\n\n"
        );

        String depositreqmsg = depositMsgSent.toJson();

        depositMsgSent.publish(depositreqmsg);

        // Sample Logic //
        Deposit.depositMsgReq(event);
    }
    // keep

}
