package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.AddressedSafety;

import java.io.Serializable;

public interface AddressedSafetyRepository extends
        JpaRepository<AddressedSafety,Long>,Serializable,
        JpaSpecificationExecutor<AddressedSafety> {
//    AddressedSafety findByName(String name);
}
