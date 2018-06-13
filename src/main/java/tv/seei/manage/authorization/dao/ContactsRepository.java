package tv.seei.manage.authorization.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import tv.seei.manage.authorization.entity.Contact;

import java.io.Serializable;
import java.util.List;

public interface ContactsRepository extends
        JpaRepository<Contact, Long>,Serializable,JpaSpecificationExecutor<Contact> {
    Contact findByName(String name);
    List<Contact> findByNameLike(String name);
}
