package com.spring.solo.mood.repository;

import com.spring.solo.mood.entity.User;
import lombok.RequiredArgsConstructor;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


@Repository
@RequiredArgsConstructor
public class UserJdbcRepository implements UserRepository {
    private final JdbcTemplate template;


    /**
     *
     * @param user reg_form 에서 사용자가 입력한 계정들의 정보.
     * @return 추가된다면 true 리턴 안된다면 false 리턴.
     */
    @Override
    public boolean save(User user) {
        String sql = "INSERT INTO tbl_mood_user (user_name, user_id, user_password, user_email, " +
                "user_nickname, user_age, user_address " +
                ") VALUES (?, ?, ?, ?, ?, ?, ?)";
        return template.update(sql, user.getUserName(), user.getUserId(), user.getUserPass(), user.getUserMail()
        ,user.getUserNickName(), user.getUserAge(), user.getUserAddress()) == 1;
    }

    @Override
    public boolean registerIdFind(User user) {
        String sql = "SELECT COUNT(*) FROM tbl_mood_user WHERE user_id=?";
        Integer count = template.queryForObject(sql, Integer.class, user.getUserId());
        return count != null && count > 0;
    }

}
