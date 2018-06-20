package tv.seei.manage.ais.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.ais.entity.StaticDataReport;

import java.io.Serializable;

public interface StaticDataReportRepository extends
        JpaRepository<StaticDataReport,Long>,Serializable,
        JpaSpecificationExecutor<StaticDataReport> {
//    StaticDataReport findByName(String name);
}
