package ru.team.up.teamup.repositories;


import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ru.team.up.teamup.entity.Report;

/**
 * Интерфейс Data Repository
 * Для общих CRUD операций над типом Report (Сущность сообщений для Кафки)
 */
@Repository
public interface DataRepository extends CrudRepository<Report, String> {
}
