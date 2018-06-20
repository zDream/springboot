package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.DataLinkManagement;

import java.io.Serializable;

public interface DataLinkManagementRepository extends
        JpaRepository<DataLinkManagement,Long>,Serializable,
        JpaSpecificationExecutor<DataLinkManagement> {
//    DataLinkManagement findByName(String name);
}

