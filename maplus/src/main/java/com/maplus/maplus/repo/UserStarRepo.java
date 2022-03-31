package com.maplus.maplus.repo;


import com.maplus.maplus.model.UserStar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface UserStarRepo extends JpaRepository<UserStar,Integer> {
    public List<UserStar> findAllByUserName(String userName);
    @Transactional
    public int deleteAllByUserNameAndActivityId(String userName,int activityId);
}
