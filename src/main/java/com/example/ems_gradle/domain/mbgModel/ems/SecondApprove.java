package com.example.ems_gradle.domain.mbgModel.ems;

import java.util.Date;

public class SecondApprove {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.second_approve.request_second_approve_id
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    private Integer requestSecondApproveId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.second_approve.request_id
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    private Integer requestId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.second_approve.second_approve_user_id
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    private Integer secondApproveUserId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.second_approve.request_second_approve_date
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    private Date requestSecondApproveDate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.second_approve.request_second_approve_id
     *
     * @return the value of ems.second_approve.request_second_approve_id
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    public Integer getRequestSecondApproveId() {
        return requestSecondApproveId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.second_approve.request_second_approve_id
     *
     * @param requestSecondApproveId the value for ems.second_approve.request_second_approve_id
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    public void setRequestSecondApproveId(Integer requestSecondApproveId) {
        this.requestSecondApproveId = requestSecondApproveId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.second_approve.request_id
     *
     * @return the value of ems.second_approve.request_id
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.second_approve.request_id
     *
     * @param requestId the value for ems.second_approve.request_id
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.second_approve.second_approve_user_id
     *
     * @return the value of ems.second_approve.second_approve_user_id
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    public Integer getSecondApproveUserId() {
        return secondApproveUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.second_approve.second_approve_user_id
     *
     * @param secondApproveUserId the value for ems.second_approve.second_approve_user_id
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    public void setSecondApproveUserId(Integer secondApproveUserId) {
        this.secondApproveUserId = secondApproveUserId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.second_approve.request_second_approve_date
     *
     * @return the value of ems.second_approve.request_second_approve_date
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    public Date getRequestSecondApproveDate() {
        return requestSecondApproveDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.second_approve.request_second_approve_date
     *
     * @param requestSecondApproveDate the value for ems.second_approve.request_second_approve_date
     *
     * @mbg.generated Sat Sep 02 09:13:33 JST 2023
     */
    public void setRequestSecondApproveDate(Date requestSecondApproveDate) {
        this.requestSecondApproveDate = requestSecondApproveDate;
    }
}