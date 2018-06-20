package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.InfoChannel;

import java.io.Serializable;

public interface InfoChannelRepository extends
        JpaRepository<InfoChannel,Long>,Serializable,
        JpaSpecificationExecutor<InfoChannel> {
//    InfoChannel findByName(String name);
}
