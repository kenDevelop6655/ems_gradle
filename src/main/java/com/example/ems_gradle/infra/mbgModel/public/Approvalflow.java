package com.example.ems_gradle.infra.mbgModel.public;

public class Approvalflow {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.ApprovalFlow.approval_flow_id
     *
     * @mbg.generated Mon Aug 07 22:08:05 JST 2023
     */
    private Integer approvalFlowId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.ApprovalFlow.first_approver_id
     *
     * @mbg.generated Mon Aug 07 22:08:05 JST 2023
     */
    private Integer firstApproverId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column public.ApprovalFlow.second_approver_id
     *
     * @mbg.generated Mon Aug 07 22:08:05 JST 2023
     */
    private Integer secondApproverId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.ApprovalFlow.approval_flow_id
     *
     * @return the value of public.ApprovalFlow.approval_flow_id
     *
     * @mbg.generated Mon Aug 07 22:08:05 JST 2023
     */
    public Integer getApprovalFlowId() {
        return approvalFlowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.ApprovalFlow.approval_flow_id
     *
     * @param approvalFlowId the value for public.ApprovalFlow.approval_flow_id
     *
     * @mbg.generated Mon Aug 07 22:08:05 JST 2023
     */
    public void setApprovalFlowId(Integer approvalFlowId) {
        this.approvalFlowId = approvalFlowId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.ApprovalFlow.first_approver_id
     *
     * @return the value of public.ApprovalFlow.first_approver_id
     *
     * @mbg.generated Mon Aug 07 22:08:05 JST 2023
     */
    public Integer getFirstApproverId() {
        return firstApproverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.ApprovalFlow.first_approver_id
     *
     * @param firstApproverId the value for public.ApprovalFlow.first_approver_id
     *
     * @mbg.generated Mon Aug 07 22:08:05 JST 2023
     */
    public void setFirstApproverId(Integer firstApproverId) {
        this.firstApproverId = firstApproverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column public.ApprovalFlow.second_approver_id
     *
     * @return the value of public.ApprovalFlow.second_approver_id
     *
     * @mbg.generated Mon Aug 07 22:08:05 JST 2023
     */
    public Integer getSecondApproverId() {
        return secondApproverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column public.ApprovalFlow.second_approver_id
     *
     * @param secondApproverId the value for public.ApprovalFlow.second_approver_id
     *
     * @mbg.generated Mon Aug 07 22:08:05 JST 2023
     */
    public void setSecondApproverId(Integer secondApproverId) {
        this.secondApproverId = secondApproverId;
    }
}