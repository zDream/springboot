package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.SpecialPosition;

import java.io.Serializable;

public interface SpecialPositionRepository extends
        JpaRepository<SpecialPosition,Long>,Serializable,
        JpaSpecificationExecutor<SpecialPosition> {
//    SpecialPosition findByName(String name);
}
