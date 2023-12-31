package com.example.ems_gradle.infra.mbgModel.ems;

import java.util.ArrayList;
import java.util.List;

public class ApprovalflowExample {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ems.ApprovalFlow
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    protected String orderByClause;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ems.ApprovalFlow
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    protected boolean distinct;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table ems.ApprovalFlow
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    protected List<Criteria> oredCriteria;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.ApprovalFlow
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public ApprovalflowExample() {
        oredCriteria = new ArrayList<>();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.ApprovalFlow
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.ApprovalFlow
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public String getOrderByClause() {
        return orderByClause;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.ApprovalFlow
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.ApprovalFlow
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public boolean isDistinct() {
        return distinct;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.ApprovalFlow
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.ApprovalFlow
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.ApprovalFlow
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
     * This method corresponds to the database table ems.ApprovalFlow
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
     * This method corresponds to the database table ems.ApprovalFlow
     *
     * @mbg.generated Mon Aug 07 22:26:29 JST 2023
     */
    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table ems.ApprovalFlow
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
     * This class corresponds to the database table ems.ApprovalFlow
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

        public Criteria andSecondApproverIdIsNull() {
            addCriterion("second_approver_id is null");
            return (Criteria) this;
        }

        public Criteria andSecondApproverIdIsNotNull() {
            addCriterion("second_approver_id is not null");
            return (Criteria) this;
        }

        public Criteria andSecondApproverIdEqualTo(Integer value) {
            addCriterion("second_approver_id =", value, "secondApproverId");
            return (Criteria) this;
        }

        public Criteria andSecondApproverIdNotEqualTo(Integer value) {
            addCriterion("second_approver_id <>", value, "secondApproverId");
            return (Criteria) this;
        }

        public Criteria andSecondApproverIdGreaterThan(Integer value) {
            addCriterion("second_approver_id >", value, "secondApproverId");
            return (Criteria) this;
        }

        public Criteria andSecondApproverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("second_approver_id >=", value, "secondApproverId");
            return (Criteria) this;
        }

        public Criteria andSecondApproverIdLessThan(Integer value) {
            addCriterion("second_approver_id <", value, "secondApproverId");
            return (Criteria) this;
        }

        public Criteria andSecondApproverIdLessThanOrEqualTo(Integer value) {
            addCriterion("second_approver_id <=", value, "secondApproverId");
            return (Criteria) this;
        }

        public Criteria andSecondApproverIdIn(List<Integer> values) {
            addCriterion("second_approver_id in", values, "secondApproverId");
            return (Criteria) this;
        }

        public Criteria andSecondApproverIdNotIn(List<Integer> values) {
            addCriterion("second_approver_id not in", values, "secondApproverId");
            return (Criteria) this;
        }

        public Criteria andSecondApproverIdBetween(Integer value1, Integer value2) {
            addCriterion("second_approver_id between", value1, value2, "secondApproverId");
            return (Criteria) this;
        }

        public Criteria andSecondApproverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("second_approver_id not between", value1, value2, "secondApproverId");
            return (Criteria) this;
        }
    }

    /**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table ems.ApprovalFlow
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
     * This class corresponds to the database table ems.ApprovalFlow
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