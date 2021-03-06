package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.GlobalNavigationSatellite;

import java.io.Serializable;

public interface GlobalNavigationSatelliteRepository extends
        JpaRepository<GlobalNavigationSatellite,Long>,Serializable,
        JpaSpecificationExecutor<GlobalNavigationSatellite> {
//    GlobalNavigationSatellite findByName(String name);
}