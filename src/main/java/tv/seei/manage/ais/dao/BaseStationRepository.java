package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.BaseStation;

import java.io.Serializable;

public interface BaseStationRepository extends
        JpaRepository<BaseStation,Long>,Serializable,
        JpaSpecificationExecutor<BaseStation> {
//    BaseStation findByName(String name);
}
