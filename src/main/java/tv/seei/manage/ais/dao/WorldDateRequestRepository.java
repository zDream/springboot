package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.WorldDateRequest;

import java.io.Serializable;

public interface WorldDateRequestRepository extends
        JpaRepository<WorldDateRequest,Long>,Serializable,
        JpaSpecificationExecutor<WorldDateRequest> {
//    WorldDateRequest findByName(String name);
}
