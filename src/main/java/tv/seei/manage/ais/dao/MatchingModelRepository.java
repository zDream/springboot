package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.MatchingModel;

import java.io.Serializable;

public interface MatchingModelRepository extends
        JpaRepository<MatchingModel,Long>,Serializable,
        JpaSpecificationExecutor<MatchingModel> {
//    MatchingModel findByName(String name);
}
