package com.se.service;

import com.se.entity.TeacherAccount;

public interface TeacherAccountService {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEACHER_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    int deleteByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEACHER_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    int insert(TeacherAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEACHER_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    int insertSelective(TeacherAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEACHER_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    TeacherAccount selectByPrimaryKey(String id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEACHER_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    int updateByPrimaryKeySelective(TeacherAccount record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TEACHER_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    int updateByPrimaryKey(TeacherAccount record);
}
