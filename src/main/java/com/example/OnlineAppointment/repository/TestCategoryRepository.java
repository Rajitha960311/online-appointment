
package com.example.OnlineAppointment.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OnlineAppointment.entity.TestCategory;

@Repository
public interface TestCategoryRepository extends JpaRepository<TestCategory, String> {

}
