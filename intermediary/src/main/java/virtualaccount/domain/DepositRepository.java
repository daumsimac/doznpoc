package virtualaccount.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import virtualaccount.domain.*;

@RepositoryRestResource(collectionResourceRel = "deposits", path = "deposits")
public interface DepositRepository
    extends PagingAndSortingRepository<Deposit, Long> {}
