package br.com.microservice.core.repository;

import br.com.microservice.core.model.ApplicationUser;
import br.com.microservice.core.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface ApplicationUserRepository extends PagingAndSortingRepository<ApplicationUser, Long> {

    ApplicationUser findByUserName(String userName);

}
