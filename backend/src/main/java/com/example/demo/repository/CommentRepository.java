package com.example.demo.repository;

import com.example.demo.model.CommentModel;
import com.example.demo.model.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface CommentRepository extends JpaRepository<CommentModel, Long>, JpaSpecificationExecutor<CommentModel> {
}
