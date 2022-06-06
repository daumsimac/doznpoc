package virtualaccount.domain;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import virtualaccount.domain.*;

@RepositoryRestResource(
    collectionResourceRel = "depositReplies",
    path = "depositReplies"
)
public interface DepositReplyRepository
    extends PagingAndSortingRepository<DepositReply, Long> {}
