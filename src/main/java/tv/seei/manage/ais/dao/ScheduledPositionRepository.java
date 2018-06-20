package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.ScheduledPosition;

import java.io.Serializable;

public interface ScheduledPositionRepository extends
        JpaRepository<ScheduledPosition,Long>,Serializable,
        JpaSpecificationExecutor<ScheduledPosition> {
//    ScheduledPosition findByName(String name);
}
