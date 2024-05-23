package com.indeed.server.dao;

import com.indeed.server.model.PostModal;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PostDao extends JpaRepository<PostModal, Long> {

}
