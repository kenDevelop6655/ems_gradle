package com.example.ems_gradle.domain.mbgModel.ems;

import java.util.Date;

public class FirstApprove {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.first_approve.request_activity_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    private Integer requestActivityId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.first_approve.first_approver_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    private Integer firstApproverId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.first_approve.request_activity_date
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    private Date requestActivityDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.first_approve.request_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    private Integer requestId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.first_approve.request_type_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    private Integer requestTypeId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.first_approve.request_activity_id
     *
     * @return the value of ems.first_approve.request_activity_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public Integer getRequestActivityId() {
        return requestActivityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.first_approve.request_activity_id
     *
     * @param requestActivityId the value for ems.first_approve.request_activity_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public void setRequestActivityId(Integer requestActivityId) {
        this.requestActivityId = requestActivityId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.first_approve.first_approver_id
     *
     * @return the value of ems.first_approve.first_approver_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public Integer getFirstApproverId() {
        return firstApproverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.first_approve.first_approver_id
     *
     * @param firstApproverId the value for ems.first_approve.first_approver_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public void setFirstApproverId(Integer firstApproverId) {
        this.firstApproverId = firstApproverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.first_approve.request_activity_date
     *
     * @return the value of ems.first_approve.request_activity_date
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public Date getRequestActivityDate() {
        return requestActivityDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.first_approve.request_activity_date
     *
     * @param requestActivityDate the value for ems.first_approve.request_activity_date
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public void setRequestActivityDate(Date requestActivityDate) {
        this.requestActivityDate = requestActivityDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.first_approve.request_id
     *
     * @return the value of ems.first_approve.request_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.first_approve.request_id
     *
     * @param requestId the value for ems.first_approve.request_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.first_approve.request_type_id
     *
     * @return the value of ems.first_approve.request_type_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public Integer getRequestTypeId() {
        return requestTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.first_approve.request_type_id
     *
     * @param requestTypeId the value for ems.first_approve.request_type_id
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public void setRequestTypeId(Integer requestTypeId) {
        this.requestTypeId = requestTypeId;
    }
}