package com.sda.springstarter.demo.repository;

import com.sda.springstarter.demo.model.Publishers;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublishersRepository extends JpaRepository<Publishers, Long>{

    Publishers findById(int id);

}
