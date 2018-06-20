package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.UnknownPosition;

import java.io.Serializable;

public interface UnknownPositionRepository extends
        JpaRepository<UnknownPosition,Long>,Serializable,
        JpaSpecificationExecutor<UnknownPosition> {
//    UnknownPosition findByName(String name);
}