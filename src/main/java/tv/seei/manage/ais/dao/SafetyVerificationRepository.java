package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.SafetyVerification;

import java.io.Serializable;

public interface SafetyVerificationRepository extends
        JpaRepository<SafetyVerification,Long>,Serializable,
        JpaSpecificationExecutor<SafetyVerification> {
//    SafetyVerification findByName(String name);
}

