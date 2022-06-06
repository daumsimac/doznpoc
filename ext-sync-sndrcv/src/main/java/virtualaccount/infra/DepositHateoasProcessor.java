package virtualaccount.infra;

import org.springframework.hateoas.EntityModel;
import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import virtualaccount.domain.*;

@Component
public class DepositHateoasProcessor
    implements RepresentationModelProcessor<EntityModel<Deposit>> {

    @Override
    public EntityModel<Deposit> process(EntityModel<Deposit> model) {
        return model;
    }
}
