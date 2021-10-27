package com.se.entity;

public class UnactivatedAccount {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNACTIVATED_ACCOUNT.EMAIL
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNACTIVATED_ACCOUNT.NAME
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNACTIVATED_ACCOUNT.PASSWORD
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNACTIVATED_ACCOUNT.IDCARD
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    private String idcard;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNACTIVATED_ACCOUNT.ID
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    private String id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNACTIVATED_ACCOUNT.IS_TEACHER
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    private Boolean isTeacher;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column UNACTIVATED_ACCOUNT.IS_SENIOR_TERCHER
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    private Boolean isSeniorTercher;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNACTIVATED_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public UnactivatedAccount(String email, String name, String password, String idcard, String id, Boolean isTeacher, Boolean isSeniorTercher) {
        this.email = email;
        this.name = name;
        this.password = password;
        this.idcard = idcard;
        this.id = id;
        this.isTeacher = isTeacher;
        this.isSeniorTercher = isSeniorTercher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table UNACTIVATED_ACCOUNT
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public UnactivatedAccount() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNACTIVATED_ACCOUNT.EMAIL
     *
     * @return the value of UNACTIVATED_ACCOUNT.EMAIL
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNACTIVATED_ACCOUNT.EMAIL
     *
     * @param email the value for UNACTIVATED_ACCOUNT.EMAIL
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNACTIVATED_ACCOUNT.NAME
     *
     * @return the value of UNACTIVATED_ACCOUNT.NAME
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNACTIVATED_ACCOUNT.NAME
     *
     * @param name the value for UNACTIVATED_ACCOUNT.NAME
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNACTIVATED_ACCOUNT.PASSWORD
     *
     * @return the value of UNACTIVATED_ACCOUNT.PASSWORD
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNACTIVATED_ACCOUNT.PASSWORD
     *
     * @param password the value for UNACTIVATED_ACCOUNT.PASSWORD
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNACTIVATED_ACCOUNT.IDCARD
     *
     * @return the value of UNACTIVATED_ACCOUNT.IDCARD
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNACTIVATED_ACCOUNT.IDCARD
     *
     * @param idcard the value for UNACTIVATED_ACCOUNT.IDCARD
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard == null ? null : idcard.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNACTIVATED_ACCOUNT.ID
     *
     * @return the value of UNACTIVATED_ACCOUNT.ID
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNACTIVATED_ACCOUNT.ID
     *
     * @param id the value for UNACTIVATED_ACCOUNT.ID
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNACTIVATED_ACCOUNT.IS_TEACHER
     *
     * @return the value of UNACTIVATED_ACCOUNT.IS_TEACHER
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public Boolean getIsTeacher() {
        return isTeacher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNACTIVATED_ACCOUNT.IS_TEACHER
     *
     * @param isTeacher the value for UNACTIVATED_ACCOUNT.IS_TEACHER
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public void setIsTeacher(Boolean isTeacher) {
        this.isTeacher = isTeacher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column UNACTIVATED_ACCOUNT.IS_SENIOR_TERCHER
     *
     * @return the value of UNACTIVATED_ACCOUNT.IS_SENIOR_TERCHER
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public Boolean getIsSeniorTercher() {
        return isSeniorTercher;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column UNACTIVATED_ACCOUNT.IS_SENIOR_TERCHER
     *
     * @param isSeniorTercher the value for UNACTIVATED_ACCOUNT.IS_SENIOR_TERCHER
     *
     * @mbg.generated Wed Oct 27 09:24:02 CST 2021
     */
    public void setIsSeniorTercher(Boolean isSeniorTercher) {
        this.isSeniorTercher = isSeniorTercher;
    }
}