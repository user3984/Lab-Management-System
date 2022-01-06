package com.se.service;

import com.se.entity.Files;

import java.util.List;

public interface FileService {
    int deleteByPrimaryKey(String url);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COURSE
     *
     * @mbg.generated Wed Oct 27 22:15:26 CST 2021
     */
    int insert(Files file);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COURSE
     *
     * @mbg.generated Wed Oct 27 22:15:26 CST 2021
     */
//    int insertSelective(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COURSE
     *
     * @mbg.generated Wed Oct 27 22:15:26 CST 2021
     */
    List<Files> selectByCourseId(String courseId);
    List<Files> selectAllFile();
}
