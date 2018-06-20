package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.GroupMatching;

import java.io.Serializable;

public interface GroupMatchingRepository extends
        JpaRepository<GroupMatching,Long>,Serializable,
        JpaSpecificationExecutor<GroupMatching> {
//    GroupMatching findByName(String name);
}
