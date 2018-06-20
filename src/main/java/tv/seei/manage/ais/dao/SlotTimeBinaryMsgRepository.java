package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.SlotTimeBinaryMsg;

import java.io.Serializable;

public interface SlotTimeBinaryMsgRepository extends
        JpaRepository<SlotTimeBinaryMsg,Long>,Serializable,
        JpaSpecificationExecutor<SlotTimeBinaryMsg> {
//    SlotTimeBinaryMsg findByName(String name);
}