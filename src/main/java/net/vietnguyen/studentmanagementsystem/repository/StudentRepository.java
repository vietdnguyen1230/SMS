package net.vietnguyen.studentmanagementsystem.repository;

import net.vietnguyen.studentmanagementsystem.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {

}
