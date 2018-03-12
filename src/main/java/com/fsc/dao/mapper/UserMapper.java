package com.fsc.dao.mapper;

import com.fsc.domain.bo.User;
import org.apache.ibatis.annotations.*;

@Mapper
public interface UserMapper {
    @Results({
        @Result(property = "userId", column = "USER_ID"),
        @Result(property = "companyId", column = "COMPANY_ID"),
        @Result(property = "userName", column = "USER_NAME"),
        @Result(property = "password", column = "PASSWORD"),
        @Result(property = "firstName", column = "FIRST_NAME"),
        @Result(property = "lastName", column = "LAST_NAME"),
        @Result(property = "email", column = "EMAIL"),
        @Result(property = "state", column = "STATE"),
        @Result(property = "createdBy", column = "CREATED_BY"),
        @Result(property = "createdTime", column = "CREATED_TIME")
    })
    @Select("SELECT * FROM users WHERE USER_NAME = #{username} AND COMPANY_ID = #{companyId}")
    User getUserByUsernameAndCompanyId(@Param("username") String username, @Param("companyId") String companyId);
}