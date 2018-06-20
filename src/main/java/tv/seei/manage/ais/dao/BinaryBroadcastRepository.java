package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.BinaryBroadcast;

import java.io.Serializable;

public interface BinaryBroadcastRepository extends
        JpaRepository<BinaryBroadcast,Long>,Serializable,
        JpaSpecificationExecutor<BinaryBroadcast> {
//    BinaryBroadcast findByName(String name);
}

