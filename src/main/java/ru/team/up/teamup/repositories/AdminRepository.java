package ru.team.up.teamup.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.team.up.teamup.entity.Admin;
import ru.team.up.teamup.entity.Report;

@Repository
public interface AdminRepository extends CrudRepository<Admin, Long> {
    Admin findByUsername(String username);
}
