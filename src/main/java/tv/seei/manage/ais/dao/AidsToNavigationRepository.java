package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.AidsToNavigation;

import java.io.Serializable;

public interface AidsToNavigationRepository extends
        JpaRepository<AidsToNavigation,Long>,Serializable,
        JpaSpecificationExecutor<AidsToNavigation> {
//    AidsToNavigation findByName(String name);
}
