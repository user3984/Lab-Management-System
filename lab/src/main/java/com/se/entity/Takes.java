package com.se.entity;

public class Takes extends TakesKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column TAKES.GRADES
     *
     * @mbg.generated Wed Oct 27 21:50:19 CST 2021
     */
    private Integer grades;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAKES
     *
     * @mbg.generated Wed Oct 27 21:50:19 CST 2021
     */
    public Takes(String studentId, String courseId, String sectionId, Integer grades) {
        super(studentId, courseId, sectionId);
        this.grades = grades;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table TAKES
     *
     * @mbg.generated Wed Oct 27 21:50:19 CST 2021
     */
    public Takes() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column TAKES.GRADES
     *
     * @return the value of TAKES.GRADES
     *
     * @mbg.generated Wed Oct 27 21:50:19 CST 2021
     */
    public Integer getGrades() {
        return grades;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column TAKES.GRADES
     *
     * @param grades the value for TAKES.GRADES
     *
     * @mbg.generated Wed Oct 27 21:50:19 CST 2021
     */
    public void setGrades(Integer grades) {
        this.grades = grades;
    }
}