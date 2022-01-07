package com.se.mapper;

import com.se.entity.Files;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface FileMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COURSE
     *
     * @mbg.generated Wed Oct 27 22:15:26 CST 2021
     */
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

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COURSE
     *
     * @mbg.generated Wed Oct 27 22:15:26 CST 2021
     */
//    int updateByPrimaryKeySelective(Course record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table COURSE
     *
     * @mbg.generated Wed Oct 27 22:15:26 CST 2021
     */
//    int updateByPrimaryKey(Course record);
}