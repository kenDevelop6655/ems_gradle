package com.example.ems_gradle.infra.mbgModel.ems;

public class Progressstatus {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.ProgressStatus.progress_status_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    private Integer progressStatusId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column ems.ProgressStatus.progress_status
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    private String progressStatus;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.ProgressStatus.progress_status_id
     *
     * @return the value of ems.ProgressStatus.progress_status_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public Integer getProgressStatusId() {
        return progressStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.ProgressStatus.progress_status_id
     *
     * @param progressStatusId the value for ems.ProgressStatus.progress_status_id
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void setProgressStatusId(Integer progressStatusId) {
        this.progressStatusId = progressStatusId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column ems.ProgressStatus.progress_status
     *
     * @return the value of ems.ProgressStatus.progress_status
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public String getProgressStatus() {
        return progressStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column ems.ProgressStatus.progress_status
     *
     * @param progressStatus the value for ems.ProgressStatus.progress_status
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void setProgressStatus(String progressStatus) {
        this.progressStatus = progressStatus == null ? null : progressStatus.trim();
    }
}