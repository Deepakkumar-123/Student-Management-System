package com.student.code.repository;

import java.util.List;

import com.student.code.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long>
{
    @Query(value="select s.id, s.stname, c.coursename from student s Inner JOIN course c ON s.course=c.id", nativeQuery=true)
    List<Object[]> findStudent();
}
