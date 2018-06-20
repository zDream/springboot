package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.Request;

import java.io.Serializable;

public interface RequestRepository extends
        JpaRepository<Request,Long>,Serializable,
        JpaSpecificationExecutor<Request> {
//    Request findByName(String name);
}
