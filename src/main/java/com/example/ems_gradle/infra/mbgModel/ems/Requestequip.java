package com.example.ems_gradle.infra.mbgModel.ems;

import java.util.Date;

public class Requestequip {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.RequestEquip.request_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    private Integer requestId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.RequestEquip.equip_name
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    private String equipName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.RequestEquip.equip_type_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    private Integer equipTypeId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.RequestEquip.requester_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    private Integer requesterId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.RequestEquip.request_date
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    private Date requestDate;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.RequestEquip.reason
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    private String reason;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.RequestEquip.progress_status_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    private Integer progressStatusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.RequestEquip.approval_flow_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    private Integer approvalFlowId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.RequestEquip.note
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.RequestEquip.request_id
     *
     * @return the value of ems.RequestEquip.request_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public Integer getRequestId() {
        return requestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.RequestEquip.request_id
     *
     * @param requestId the value for ems.RequestEquip.request_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void setRequestId(Integer requestId) {
        this.requestId = requestId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.RequestEquip.equip_name
     *
     * @return the value of ems.RequestEquip.equip_name
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public String getEquipName() {
        return equipName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.RequestEquip.equip_name
     *
     * @param equipName the value for ems.RequestEquip.equip_name
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void setEquipName(String equipName) {
        this.equipName = equipName == null ? null : equipName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.RequestEquip.equip_type_id
     *
     * @return the value of ems.RequestEquip.equip_type_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public Integer getEquipTypeId() {
        return equipTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.RequestEquip.equip_type_id
     *
     * @param equipTypeId the value for ems.RequestEquip.equip_type_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void setEquipTypeId(Integer equipTypeId) {
        this.equipTypeId = equipTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.RequestEquip.requester_id
     *
     * @return the value of ems.RequestEquip.requester_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public Integer getRequesterId() {
        return requesterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.RequestEquip.requester_id
     *
     * @param requesterId the value for ems.RequestEquip.requester_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void setRequesterId(Integer requesterId) {
        this.requesterId = requesterId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.RequestEquip.request_date
     *
     * @return the value of ems.RequestEquip.request_date
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public Date getRequestDate() {
        return requestDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.RequestEquip.request_date
     *
     * @param requestDate the value for ems.RequestEquip.request_date
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void setRequestDate(Date requestDate) {
        this.requestDate = requestDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.RequestEquip.reason
     *
     * @return the value of ems.RequestEquip.reason
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public String getReason() {
        return reason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.RequestEquip.reason
     *
     * @param reason the value for ems.RequestEquip.reason
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.RequestEquip.progress_status_id
     *
     * @return the value of ems.RequestEquip.progress_status_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public Integer getProgressStatusId() {
        return progressStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.RequestEquip.progress_status_id
     *
     * @param progressStatusId the value for ems.RequestEquip.progress_status_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void setProgressStatusId(Integer progressStatusId) {
        this.progressStatusId = progressStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.RequestEquip.approval_flow_id
     *
     * @return the value of ems.RequestEquip.approval_flow_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public Integer getApprovalFlowId() {
        return approvalFlowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.RequestEquip.approval_flow_id
     *
     * @param approvalFlowId the value for ems.RequestEquip.approval_flow_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void setApprovalFlowId(Integer approvalFlowId) {
        this.approvalFlowId = approvalFlowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.RequestEquip.note
     *
     * @return the value of ems.RequestEquip.note
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.RequestEquip.note
     *
     * @param note the value for ems.RequestEquip.note
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}