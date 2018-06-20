package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.StandardClassB;

import java.io.Serializable;

public interface StandardClassBRepository extends
        JpaRepository<StandardClassB,Long>,Serializable,
        JpaSpecificationExecutor<StandardClassB> {
//    StandardClassB findByName(String name);
}