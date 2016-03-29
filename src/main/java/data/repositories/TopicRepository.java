package data.repositories;

import data.entity.Topic;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by dima on 29.03.16.
 */
public interface TopicRepository extends CrudRepository<Topic, Long> {
}
