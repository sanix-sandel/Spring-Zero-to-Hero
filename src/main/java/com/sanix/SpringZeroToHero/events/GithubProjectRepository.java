package com.sanix.SpringZeroToHero.events;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GithubProjectRepository extends PagingAndSortingRepository<GithubProject, Long> {

    GithubProject findByRepoName(String repoName);
}
