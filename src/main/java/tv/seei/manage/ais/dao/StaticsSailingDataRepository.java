package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.StaticsSailingData;

import java.io.Serializable;

public interface StaticsSailingDataRepository extends
        JpaRepository<StaticsSailingData,Long>,Serializable,
        JpaSpecificationExecutor<StaticsSailingData> {
//    StaticsSailingData findByName(String name);
}

