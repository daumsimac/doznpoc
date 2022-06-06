package virtualaccount.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import virtualaccount.domain.*;

@Component
public class DepositReplyHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<DepositReply>> {

    @Override
    public EntityModel<DepositReply> process(EntityModel<DepositReply> model) {
        return model;
    }
}
