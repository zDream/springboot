package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.AddressedBinary;

import java.io.Serializable;

public interface AddressedBinaryRepository extends
        JpaRepository<AddressedBinary,Long>,Serializable,
        JpaSpecificationExecutor<AddressedBinary> {
//    AddressedBinary findByName(String name);
}
