package com.example.springrepositories2.Repositories;

import com.example.springrepositories2.Entities.ProgrammingLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "repo-prog-languages")
public interface ProgrammiLanguageRepository extends JpaRepository<ProgrammingLanguage, Long> {
}
