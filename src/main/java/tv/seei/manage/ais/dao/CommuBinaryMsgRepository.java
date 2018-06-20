package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.CommuBinaryMsg;

import java.io.Serializable;

public interface CommuBinaryMsgRepository extends
        JpaRepository<CommuBinaryMsg,Long>,Serializable,
        JpaSpecificationExecutor<CommuBinaryMsg> {
//    CommuBinaryMsg findByName(String name);
}
