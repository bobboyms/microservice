package br.com.microservice.microservice.repository;

import br.com.microservice.microservice.model.Course;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface CourseRepository extends PagingAndSortingRepository<Course, Long> {
}
