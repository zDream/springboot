package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.SafetyBroadcast;

import java.io.Serializable;

public interface SafetyBroadcastRepository extends
        JpaRepository<SafetyBroadcast,Long>,Serializable,
        JpaSpecificationExecutor<SafetyBroadcast> {
//    SafetyBroadcast findByName(String name);
}

