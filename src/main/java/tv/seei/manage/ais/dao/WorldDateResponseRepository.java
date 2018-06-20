package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.WorldDateResponse;

import java.io.Serializable;

public interface WorldDateResponseRepository extends
        JpaRepository<WorldDateResponse,Long>,Serializable,
        JpaSpecificationExecutor<WorldDateResponse> {
//    WorldDateResponse findByName(String name);
}
