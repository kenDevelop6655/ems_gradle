package com.example.ems_gradle.infra.mbgModel.ems;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class RequestequipExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public RequestequipExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        protected void addCriterionForJDBCDate(String condition, Date value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value.getTime()), property);
        }

        protected void addCriterionForJDBCDate(String condition, List<Date> values, String property) {
            if (values == null || values.size() == 0) {
                throw new RuntimeException("Value list for " + property + " cannot be null or empty");
            }
            List<java.sql.Date> dateList = new ArrayList<>();
            Iterator<Date> iter = values.iterator();
            while (iter.hasNext()) {
                dateList.add(new java.sql.Date(iter.next().getTime()));
            }
            addCriterion(condition, dateList, property);
        }

        protected void addCriterionForJDBCDate(String condition, Date value1, Date value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            addCriterion(condition, new java.sql.Date(value1.getTime()), new java.sql.Date(value2.getTime()), property);
        }

        public Criteria andRequestIdIsNull() {
            addCriterion("request_id is null");
            return (Criteria) this;
        }

        public Criteria andRequestIdIsNotNull() {
            addCriterion("request_id is not null");
            return (Criteria) this;
        }

        public Criteria andRequestIdEqualTo(Integer value) {
            addCriterion("request_id =", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotEqualTo(Integer value) {
            addCriterion("request_id <>", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThan(Integer value) {
            addCriterion("request_id >", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("request_id >=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThan(Integer value) {
            addCriterion("request_id <", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdLessThanOrEqualTo(Integer value) {
            addCriterion("request_id <=", value, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdIn(List<Integer> values) {
            addCriterion("request_id in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotIn(List<Integer> values) {
            addCriterion("request_id not in", values, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdBetween(Integer value1, Integer value2) {
            addCriterion("request_id between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andRequestIdNotBetween(Integer value1, Integer value2) {
            addCriterion("request_id not between", value1, value2, "requestId");
            return (Criteria) this;
        }

        public Criteria andEquipNameIsNull() {
            addCriterion("equip_name is null");
            return (Criteria) this;
        }

        public Criteria andEquipNameIsNotNull() {
            addCriterion("equip_name is not null");
            return (Criteria) this;
        }

        public Criteria andEquipNameEqualTo(String value) {
            addCriterion("equip_name =", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotEqualTo(String value) {
            addCriterion("equip_name <>", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameGreaterThan(String value) {
            addCriterion("equip_name >", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameGreaterThanOrEqualTo(String value) {
            addCriterion("equip_name >=", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLessThan(String value) {
            addCriterion("equip_name <", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLessThanOrEqualTo(String value) {
            addCriterion("equip_name <=", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameLike(String value) {
            addCriterion("equip_name like", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotLike(String value) {
            addCriterion("equip_name not like", value, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameIn(List<String> values) {
            addCriterion("equip_name in", values, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotIn(List<String> values) {
            addCriterion("equip_name not in", values, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameBetween(String value1, String value2) {
            addCriterion("equip_name between", value1, value2, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipNameNotBetween(String value1, String value2) {
            addCriterion("equip_name not between", value1, value2, "equipName");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdIsNull() {
            addCriterion("equip_type_id is null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdIsNotNull() {
            addCriterion("equip_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdEqualTo(Integer value) {
            addCriterion("equip_type_id =", value, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdNotEqualTo(Integer value) {
            addCriterion("equip_type_id <>", value, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdGreaterThan(Integer value) {
            addCriterion("equip_type_id >", value, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("equip_type_id >=", value, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdLessThan(Integer value) {
            addCriterion("equip_type_id <", value, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("equip_type_id <=", value, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdIn(List<Integer> values) {
            addCriterion("equip_type_id in", values, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdNotIn(List<Integer> values) {
            addCriterion("equip_type_id not in", values, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("equip_type_id between", value1, value2, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andEquipTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("equip_type_id not between", value1, value2, "equipTypeId");
            return (Criteria) this;
        }

        public Criteria andRequesterIdIsNull() {
            addCriterion("requester_id is null");
            return (Criteria) this;
        }

        public Criteria andRequesterIdIsNotNull() {
            addCriterion("requester_id is not null");
            return (Criteria) this;
        }

        public Criteria andRequesterIdEqualTo(Integer value) {
            addCriterion("requester_id =", value, "requesterId");
            return (Criteria) this;
        }

        public Criteria andRequesterIdNotEqualTo(Integer value) {
            addCriterion("requester_id <>", value, "requesterId");
            return (Criteria) this;
        }

        public Criteria andRequesterIdGreaterThan(Integer value) {
            addCriterion("requester_id >", value, "requesterId");
            return (Criteria) this;
        }

        public Criteria andRequesterIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("requester_id >=", value, "requesterId");
            return (Criteria) this;
        }

        public Criteria andRequesterIdLessThan(Integer value) {
            addCriterion("requester_id <", value, "requesterId");
            return (Criteria) this;
        }

        public Criteria andRequesterIdLessThanOrEqualTo(Integer value) {
            addCriterion("requester_id <=", value, "requesterId");
            return (Criteria) this;
        }

        public Criteria andRequesterIdIn(List<Integer> values) {
            addCriterion("requester_id in", values, "requesterId");
            return (Criteria) this;
        }

        public Criteria andRequesterIdNotIn(List<Integer> values) {
            addCriterion("requester_id not in", values, "requesterId");
            return (Criteria) this;
        }

        public Criteria andRequesterIdBetween(Integer value1, Integer value2) {
            addCriterion("requester_id between", value1, value2, "requesterId");
            return (Criteria) this;
        }

        public Criteria andRequesterIdNotBetween(Integer value1, Integer value2) {
            addCriterion("requester_id not between", value1, value2, "requesterId");
            return (Criteria) this;
        }

        public Criteria andRequestDateIsNull() {
            addCriterion("request_date is null");
            return (Criteria) this;
        }

        public Criteria andRequestDateIsNotNull() {
            addCriterion("request_date is not null");
            return (Criteria) this;
        }

        public Criteria andRequestDateEqualTo(Date value) {
            addCriterionForJDBCDate("request_date =", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("request_date <>", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateGreaterThan(Date value) {
            addCriterionForJDBCDate("request_date >", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("request_date >=", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateLessThan(Date value) {
            addCriterionForJDBCDate("request_date <", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("request_date <=", value, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateIn(List<Date> values) {
            addCriterionForJDBCDate("request_date in", values, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("request_date not in", values, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("request_date between", value1, value2, "requestDate");
            return (Criteria) this;
        }

        public Criteria andRequestDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("request_date not between", value1, value2, "requestDate");
            return (Criteria) this;
        }

        public Criteria andReasonIsNull() {
            addCriterion("reason is null");
            return (Criteria) this;
        }

        public Criteria andReasonIsNotNull() {
            addCriterion("reason is not null");
            return (Criteria) this;
        }

        public Criteria andReasonEqualTo(String value) {
            addCriterion("reason =", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotEqualTo(String value) {
            addCriterion("reason <>", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThan(String value) {
            addCriterion("reason >", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonGreaterThanOrEqualTo(String value) {
            addCriterion("reason >=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThan(String value) {
            addCriterion("reason <", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLessThanOrEqualTo(String value) {
            addCriterion("reason <=", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonLike(String value) {
            addCriterion("reason like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotLike(String value) {
            addCriterion("reason not like", value, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonIn(List<String> values) {
            addCriterion("reason in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotIn(List<String> values) {
            addCriterion("reason not in", values, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonBetween(String value1, String value2) {
            addCriterion("reason between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andReasonNotBetween(String value1, String value2) {
            addCriterion("reason not between", value1, value2, "reason");
            return (Criteria) this;
        }

        public Criteria andProgressStatusIdIsNull() {
            addCriterion("progress_status_id is null");
            return (Criteria) this;
        }

        public Criteria andProgressStatusIdIsNotNull() {
            addCriterion("progress_status_id is not null");
            return (Criteria) this;
        }

        public Criteria andProgressStatusIdEqualTo(Integer value) {
            addCriterion("progress_status_id =", value, "progressStatusId");
            return (Criteria) this;
        }

        public Criteria andProgressStatusIdNotEqualTo(Integer value) {
            addCriterion("progress_status_id <>", value, "progressStatusId");
            return (Criteria) this;
        }

        public Criteria andProgressStatusIdGreaterThan(Integer value) {
            addCriterion("progress_status_id >", value, "progressStatusId");
            return (Criteria) this;
        }

        public Criteria andProgressStatusIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("progress_status_id >=", value, "progressStatusId");
            return (Criteria) this;
        }

        public Criteria andProgressStatusIdLessThan(Integer value) {
            addCriterion("progress_status_id <", value, "progressStatusId");
            return (Criteria) this;
        }

        public Criteria andProgressStatusIdLessThanOrEqualTo(Integer value) {
            addCriterion("progress_status_id <=", value, "progressStatusId");
            return (Criteria) this;
        }

        public Criteria andProgressStatusIdIn(List<Integer> values) {
            addCriterion("progress_status_id in", values, "progressStatusId");
            return (Criteria) this;
        }

        public Criteria andProgressStatusIdNotIn(List<Integer> values) {
            addCriterion("progress_status_id not in", values, "progressStatusId");
            return (Criteria) this;
        }

        public Criteria andProgressStatusIdBetween(Integer value1, Integer value2) {
            addCriterion("progress_status_id between", value1, value2, "progressStatusId");
            return (Criteria) this;
        }

        public Criteria andProgressStatusIdNotBetween(Integer value1, Integer value2) {
            addCriterion("progress_status_id not between", value1, value2, "progressStatusId");
            return (Criteria) this;
        }

        public Criteria andApprovalFlowIdIsNull() {
            addCriterion("approval_flow_id is null");
            return (Criteria) this;
        }

        public Criteria andApprovalFlowIdIsNotNull() {
            addCriterion("approval_flow_id is not null");
            return (Criteria) this;
        }

        public Criteria andApprovalFlowIdEqualTo(Integer value) {
            addCriterion("approval_flow_id =", value, "approvalFlowId");
            return (Criteria) this;
        }

        public Criteria andApprovalFlowIdNotEqualTo(Integer value) {
            addCriterion("approval_flow_id <>", value, "approvalFlowId");
            return (Criteria) this;
        }

        public Criteria andApprovalFlowIdGreaterThan(Integer value) {
            addCriterion("approval_flow_id >", value, "approvalFlowId");
            return (Criteria) this;
        }

        public Criteria andApprovalFlowIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("approval_flow_id >=", value, "approvalFlowId");
            return (Criteria) this;
        }

        public Criteria andApprovalFlowIdLessThan(Integer value) {
            addCriterion("approval_flow_id <", value, "approvalFlowId");
            return (Criteria) this;
        }

        public Criteria andApprovalFlowIdLessThanOrEqualTo(Integer value) {
            addCriterion("approval_flow_id <=", value, "approvalFlowId");
            return (Criteria) this;
        }

        public Criteria andApprovalFlowIdIn(List<Integer> values) {
            addCriterion("approval_flow_id in", values, "approvalFlowId");
            return (Criteria) this;
        }

        public Criteria andApprovalFlowIdNotIn(List<Integer> values) {
            addCriterion("approval_flow_id not in", values, "approvalFlowId");
            return (Criteria) this;
        }

        public Criteria andApprovalFlowIdBetween(Integer value1, Integer value2) {
            addCriterion("approval_flow_id between", value1, value2, "approvalFlowId");
            return (Criteria) this;
        }

        public Criteria andApprovalFlowIdNotBetween(Integer value1, Integer value2) {
            addCriterion("approval_flow_id not between", value1, value2, "approvalFlowId");
            return (Criteria) this;
        }

        public Criteria andNoteIsNull() {
            addCriterion("note is null");
            return (Criteria) this;
        }

        public Criteria andNoteIsNotNull() {
            addCriterion("note is not null");
            return (Criteria) this;
        }

        public Criteria andNoteEqualTo(String value) {
            addCriterion("note =", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotEqualTo(String value) {
            addCriterion("note <>", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThan(String value) {
            addCriterion("note >", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteGreaterThanOrEqualTo(String value) {
            addCriterion("note >=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThan(String value) {
            addCriterion("note <", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLessThanOrEqualTo(String value) {
            addCriterion("note <=", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteLike(String value) {
            addCriterion("note like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotLike(String value) {
            addCriterion("note not like", value, "note");
            return (Criteria) this;
        }

        public Criteria andNoteIn(List<String> values) {
            addCriterion("note in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotIn(List<String> values) {
            addCriterion("note not in", values, "note");
            return (Criteria) this;
        }

        public Criteria andNoteBetween(String value1, String value2) {
            addCriterion("note between", value1, value2, "note");
            return (Criteria) this;
        }

        public Criteria andNoteNotBetween(String value1, String value2) {
            addCriterion("note not between", value1, value2, "note");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated do_not_delete_during_merge Mon Aug 07 22:26:29 JST 2023
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ems.RequestEquip
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}