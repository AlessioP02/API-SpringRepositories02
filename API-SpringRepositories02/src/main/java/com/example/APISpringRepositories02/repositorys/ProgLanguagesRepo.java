package com.example.APISpringRepositories02.repositorys;

import com.example.APISpringRepositories02.entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.Description;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages", collectionResourceDescription = @Description("Description"))
public interface ProgLanguagesRepo extends JpaRepository<ProgrammingLanguage, Long> {
}
