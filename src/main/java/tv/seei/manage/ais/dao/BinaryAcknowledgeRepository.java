package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.BinaryAcknowledge;

import java.io.Serializable;

public interface BinaryAcknowledgeRepository extends
        JpaRepository<BinaryAcknowledge,Long>,Serializable,
        JpaSpecificationExecutor<BinaryAcknowledge> {
//    BinaryAcknowledge findByName(String name);
}

