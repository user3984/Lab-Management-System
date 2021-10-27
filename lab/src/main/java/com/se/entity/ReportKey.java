package com.se.entity;

public class ReportKey {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPORT.STUDENT_ID
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    private String studentId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPORT.COURSE_ID
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    private String courseId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPORT.SECTION_ID
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    private String sectionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column REPORT.LAB_ID
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    private String labId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPORT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public ReportKey(String studentId, String courseId, String sectionId, String labId) {
        this.studentId = studentId;
        this.courseId = courseId;
        this.sectionId = sectionId;
        this.labId = labId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table REPORT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public ReportKey() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPORT.STUDENT_ID
     *
     * @return the value of REPORT.STUDENT_ID
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public String getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPORT.STUDENT_ID
     *
     * @param studentId the value for REPORT.STUDENT_ID
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public void setStudentId(String studentId) {
        this.studentId = studentId == null ? null : studentId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPORT.COURSE_ID
     *
     * @return the value of REPORT.COURSE_ID
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public String getCourseId() {
        return courseId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPORT.COURSE_ID
     *
     * @param courseId the value for REPORT.COURSE_ID
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public void setCourseId(String courseId) {
        this.courseId = courseId == null ? null : courseId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPORT.SECTION_ID
     *
     * @return the value of REPORT.SECTION_ID
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public String getSectionId() {
        return sectionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPORT.SECTION_ID
     *
     * @param sectionId the value for REPORT.SECTION_ID
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public void setSectionId(String sectionId) {
        this.sectionId = sectionId == null ? null : sectionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column REPORT.LAB_ID
     *
     * @return the value of REPORT.LAB_ID
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public String getLabId() {
        return labId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column REPORT.LAB_ID
     *
     * @param labId the value for REPORT.LAB_ID
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public void setLabId(String labId) {
        this.labId = labId == null ? null : labId.trim();
    }
}