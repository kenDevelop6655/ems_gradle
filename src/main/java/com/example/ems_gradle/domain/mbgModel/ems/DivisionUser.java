package com.example.ems_gradle.domain.mbgModel.ems;

public class DivisionUser {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.division_user.emp_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    private Integer empId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.division_user.role_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    private Integer roleId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.division_user.division_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    private String divisionId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.division_user.email
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    private String email;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.division_user.manager
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    private String manager;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.division_user.password
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    private String password;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.division_user.user_name
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    private String userName;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.division_user.emp_id
     *
     * @return the value of ems.division_user.emp_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public Integer getEmpId() {
        return empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.division_user.emp_id
     *
     * @param empId the value for ems.division_user.emp_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.division_user.role_id
     *
     * @return the value of ems.division_user.role_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.division_user.role_id
     *
     * @param roleId the value for ems.division_user.role_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.division_user.division_id
     *
     * @return the value of ems.division_user.division_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public String getDivisionId() {
        return divisionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.division_user.division_id
     *
     * @param divisionId the value for ems.division_user.division_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public void setDivisionId(String divisionId) {
        this.divisionId = divisionId == null ? null : divisionId.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.division_user.email
     *
     * @return the value of ems.division_user.email
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.division_user.email
     *
     * @param email the value for ems.division_user.email
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.division_user.manager
     *
     * @return the value of ems.division_user.manager
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public String getManager() {
        return manager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.division_user.manager
     *
     * @param manager the value for ems.division_user.manager
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public void setManager(String manager) {
        this.manager = manager == null ? null : manager.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.division_user.password
     *
     * @return the value of ems.division_user.password
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.division_user.password
     *
     * @param password the value for ems.division_user.password
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.division_user.user_name
     *
     * @return the value of ems.division_user.user_name
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public String getUserName() {
        return userName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.division_user.user_name
     *
     * @param userName the value for ems.division_user.user_name
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }
}