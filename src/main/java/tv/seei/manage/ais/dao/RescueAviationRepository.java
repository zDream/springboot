package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.RescueAviation;

import java.io.Serializable;

public interface RescueAviationRepository extends
        JpaRepository<RescueAviation,Long>,Serializable,
        JpaSpecificationExecutor<RescueAviation> {
//    RescueAviation findByName(String name);
}
