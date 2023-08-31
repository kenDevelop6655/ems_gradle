package com.example.ems_gradle.domain.mbgModel.ems;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class FirstApproveExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ems.first_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ems.first_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ems.first_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.first_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public FirstApproveExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.first_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.first_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.first_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.first_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.first_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.first_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.first_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.first_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
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
     * This method corresponds to the database table ems.first_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.first_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
     */
    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ems.first_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
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

        public Criteria andRequestActivityIdIsNull() {
            addCriterion("request_activity_id is null");
            return (Criteria) this;
        }

        public Criteria andRequestActivityIdIsNotNull() {
            addCriterion("request_activity_id is not null");
            return (Criteria) this;
        }

        public Criteria andRequestActivityIdEqualTo(Integer value) {
            addCriterion("request_activity_id =", value, "requestActivityId");
            return (Criteria) this;
        }

        public Criteria andRequestActivityIdNotEqualTo(Integer value) {
            addCriterion("request_activity_id <>", value, "requestActivityId");
            return (Criteria) this;
        }

        public Criteria andRequestActivityIdGreaterThan(Integer value) {
            addCriterion("request_activity_id >", value, "requestActivityId");
            return (Criteria) this;
        }

        public Criteria andRequestActivityIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("request_activity_id >=", value, "requestActivityId");
            return (Criteria) this;
        }

        public Criteria andRequestActivityIdLessThan(Integer value) {
            addCriterion("request_activity_id <", value, "requestActivityId");
            return (Criteria) this;
        }

        public Criteria andRequestActivityIdLessThanOrEqualTo(Integer value) {
            addCriterion("request_activity_id <=", value, "requestActivityId");
            return (Criteria) this;
        }

        public Criteria andRequestActivityIdIn(List<Integer> values) {
            addCriterion("request_activity_id in", values, "requestActivityId");
            return (Criteria) this;
        }

        public Criteria andRequestActivityIdNotIn(List<Integer> values) {
            addCriterion("request_activity_id not in", values, "requestActivityId");
            return (Criteria) this;
        }

        public Criteria andRequestActivityIdBetween(Integer value1, Integer value2) {
            addCriterion("request_activity_id between", value1, value2, "requestActivityId");
            return (Criteria) this;
        }

        public Criteria andRequestActivityIdNotBetween(Integer value1, Integer value2) {
            addCriterion("request_activity_id not between", value1, value2, "requestActivityId");
            return (Criteria) this;
        }

        public Criteria andFirstApproverIdIsNull() {
            addCriterion("first_approver_id is null");
            return (Criteria) this;
        }

        public Criteria andFirstApproverIdIsNotNull() {
            addCriterion("first_approver_id is not null");
            return (Criteria) this;
        }

        public Criteria andFirstApproverIdEqualTo(Integer value) {
            addCriterion("first_approver_id =", value, "firstApproverId");
            return (Criteria) this;
        }

        public Criteria andFirstApproverIdNotEqualTo(Integer value) {
            addCriterion("first_approver_id <>", value, "firstApproverId");
            return (Criteria) this;
        }

        public Criteria andFirstApproverIdGreaterThan(Integer value) {
            addCriterion("first_approver_id >", value, "firstApproverId");
            return (Criteria) this;
        }

        public Criteria andFirstApproverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("first_approver_id >=", value, "firstApproverId");
            return (Criteria) this;
        }

        public Criteria andFirstApproverIdLessThan(Integer value) {
            addCriterion("first_approver_id <", value, "firstApproverId");
            return (Criteria) this;
        }

        public Criteria andFirstApproverIdLessThanOrEqualTo(Integer value) {
            addCriterion("first_approver_id <=", value, "firstApproverId");
            return (Criteria) this;
        }

        public Criteria andFirstApproverIdIn(List<Integer> values) {
            addCriterion("first_approver_id in", values, "firstApproverId");
            return (Criteria) this;
        }

        public Criteria andFirstApproverIdNotIn(List<Integer> values) {
            addCriterion("first_approver_id not in", values, "firstApproverId");
            return (Criteria) this;
        }

        public Criteria andFirstApproverIdBetween(Integer value1, Integer value2) {
            addCriterion("first_approver_id between", value1, value2, "firstApproverId");
            return (Criteria) this;
        }

        public Criteria andFirstApproverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("first_approver_id not between", value1, value2, "firstApproverId");
            return (Criteria) this;
        }

        public Criteria andRequestActivityDateIsNull() {
            addCriterion("request_activity_date is null");
            return (Criteria) this;
        }

        public Criteria andRequestActivityDateIsNotNull() {
            addCriterion("request_activity_date is not null");
            return (Criteria) this;
        }

        public Criteria andRequestActivityDateEqualTo(Date value) {
            addCriterionForJDBCDate("request_activity_date =", value, "requestActivityDate");
            return (Criteria) this;
        }

        public Criteria andRequestActivityDateNotEqualTo(Date value) {
            addCriterionForJDBCDate("request_activity_date <>", value, "requestActivityDate");
            return (Criteria) this;
        }

        public Criteria andRequestActivityDateGreaterThan(Date value) {
            addCriterionForJDBCDate("request_activity_date >", value, "requestActivityDate");
            return (Criteria) this;
        }

        public Criteria andRequestActivityDateGreaterThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("request_activity_date >=", value, "requestActivityDate");
            return (Criteria) this;
        }

        public Criteria andRequestActivityDateLessThan(Date value) {
            addCriterionForJDBCDate("request_activity_date <", value, "requestActivityDate");
            return (Criteria) this;
        }

        public Criteria andRequestActivityDateLessThanOrEqualTo(Date value) {
            addCriterionForJDBCDate("request_activity_date <=", value, "requestActivityDate");
            return (Criteria) this;
        }

        public Criteria andRequestActivityDateIn(List<Date> values) {
            addCriterionForJDBCDate("request_activity_date in", values, "requestActivityDate");
            return (Criteria) this;
        }

        public Criteria andRequestActivityDateNotIn(List<Date> values) {
            addCriterionForJDBCDate("request_activity_date not in", values, "requestActivityDate");
            return (Criteria) this;
        }

        public Criteria andRequestActivityDateBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("request_activity_date between", value1, value2, "requestActivityDate");
            return (Criteria) this;
        }

        public Criteria andRequestActivityDateNotBetween(Date value1, Date value2) {
            addCriterionForJDBCDate("request_activity_date not between", value1, value2, "requestActivityDate");
            return (Criteria) this;
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

        public Criteria andRequestTypeIdIsNull() {
            addCriterion("request_type_id is null");
            return (Criteria) this;
        }

        public Criteria andRequestTypeIdIsNotNull() {
            addCriterion("request_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andRequestTypeIdEqualTo(Integer value) {
            addCriterion("request_type_id =", value, "requestTypeId");
            return (Criteria) this;
        }

        public Criteria andRequestTypeIdNotEqualTo(Integer value) {
            addCriterion("request_type_id <>", value, "requestTypeId");
            return (Criteria) this;
        }

        public Criteria andRequestTypeIdGreaterThan(Integer value) {
            addCriterion("request_type_id >", value, "requestTypeId");
            return (Criteria) this;
        }

        public Criteria andRequestTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("request_type_id >=", value, "requestTypeId");
            return (Criteria) this;
        }

        public Criteria andRequestTypeIdLessThan(Integer value) {
            addCriterion("request_type_id <", value, "requestTypeId");
            return (Criteria) this;
        }

        public Criteria andRequestTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("request_type_id <=", value, "requestTypeId");
            return (Criteria) this;
        }

        public Criteria andRequestTypeIdIn(List<Integer> values) {
            addCriterion("request_type_id in", values, "requestTypeId");
            return (Criteria) this;
        }

        public Criteria andRequestTypeIdNotIn(List<Integer> values) {
            addCriterion("request_type_id not in", values, "requestTypeId");
            return (Criteria) this;
        }

        public Criteria andRequestTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("request_type_id between", value1, value2, "requestTypeId");
            return (Criteria) this;
        }

        public Criteria andRequestTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("request_type_id not between", value1, value2, "requestTypeId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ems.first_approve
     *
     * @mbg.generated do_not_delete_during_merge Wed Aug 30 22:13:36 JST 2023
     */
    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ems.first_approve
     *
     * @mbg.generated Wed Aug 30 22:13:36 JST 2023
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