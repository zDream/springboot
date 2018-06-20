package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.ExtendedClassB;

import java.io.Serializable;

public interface ExtendedClassBRepository extends
        JpaRepository<ExtendedClassB,Long>,Serializable,
        JpaSpecificationExecutor<ExtendedClassB> {
//    ExtendedClassB findByName(String name);
}

