package Group.A.File.System.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Group.A.File.System.repository.FileDB;

@Repository
public interface FileDBRepository extends JpaRepository<FileDB, String> {

}