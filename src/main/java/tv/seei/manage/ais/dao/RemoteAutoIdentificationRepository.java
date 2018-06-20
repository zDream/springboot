package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.RemoteAutoIdentification;

import java.io.Serializable;

public interface RemoteAutoIdentificationRepository extends
        JpaRepository<RemoteAutoIdentification,Long>,Serializable,
        JpaSpecificationExecutor<RemoteAutoIdentification> {
//    RemoteAutoIdentification findByName(String name);
}
