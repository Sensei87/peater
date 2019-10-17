package com.examle.repos;

import com.examle.domain.Message;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by ASUS on 10/9/2019.
 */
public interface MessageRepo extends CrudRepository<Message, Long> {

    List<Message> findByTag(String tag);

}
