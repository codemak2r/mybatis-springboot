package com.example.demo.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TopUserRoleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TopUserRoleExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Long value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Long value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Long value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Long value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Long value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Long value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Long> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Long> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Long value1, Long value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Long value1, Long value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andTopUserIdIsNull() {
            addCriterion("top_user_id is null");
            return (Criteria) this;
        }

        public Criteria andTopUserIdIsNotNull() {
            addCriterion("top_user_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopUserIdEqualTo(Long value) {
            addCriterion("top_user_id =", value, "topUserId");
            return (Criteria) this;
        }

        public Criteria andTopUserIdNotEqualTo(Long value) {
            addCriterion("top_user_id <>", value, "topUserId");
            return (Criteria) this;
        }

        public Criteria andTopUserIdGreaterThan(Long value) {
            addCriterion("top_user_id >", value, "topUserId");
            return (Criteria) this;
        }

        public Criteria andTopUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("top_user_id >=", value, "topUserId");
            return (Criteria) this;
        }

        public Criteria andTopUserIdLessThan(Long value) {
            addCriterion("top_user_id <", value, "topUserId");
            return (Criteria) this;
        }

        public Criteria andTopUserIdLessThanOrEqualTo(Long value) {
            addCriterion("top_user_id <=", value, "topUserId");
            return (Criteria) this;
        }

        public Criteria andTopUserIdIn(List<Long> values) {
            addCriterion("top_user_id in", values, "topUserId");
            return (Criteria) this;
        }

        public Criteria andTopUserIdNotIn(List<Long> values) {
            addCriterion("top_user_id not in", values, "topUserId");
            return (Criteria) this;
        }

        public Criteria andTopUserIdBetween(Long value1, Long value2) {
            addCriterion("top_user_id between", value1, value2, "topUserId");
            return (Criteria) this;
        }

        public Criteria andTopUserIdNotBetween(Long value1, Long value2) {
            addCriterion("top_user_id not between", value1, value2, "topUserId");
            return (Criteria) this;
        }

        public Criteria andTopRoleIdIsNull() {
            addCriterion("top_role_id is null");
            return (Criteria) this;
        }

        public Criteria andTopRoleIdIsNotNull() {
            addCriterion("top_role_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopRoleIdEqualTo(Long value) {
            addCriterion("top_role_id =", value, "topRoleId");
            return (Criteria) this;
        }

        public Criteria andTopRoleIdNotEqualTo(Long value) {
            addCriterion("top_role_id <>", value, "topRoleId");
            return (Criteria) this;
        }

        public Criteria andTopRoleIdGreaterThan(Long value) {
            addCriterion("top_role_id >", value, "topRoleId");
            return (Criteria) this;
        }

        public Criteria andTopRoleIdGreaterThanOrEqualTo(Long value) {
            addCriterion("top_role_id >=", value, "topRoleId");
            return (Criteria) this;
        }

        public Criteria andTopRoleIdLessThan(Long value) {
            addCriterion("top_role_id <", value, "topRoleId");
            return (Criteria) this;
        }

        public Criteria andTopRoleIdLessThanOrEqualTo(Long value) {
            addCriterion("top_role_id <=", value, "topRoleId");
            return (Criteria) this;
        }

        public Criteria andTopRoleIdIn(List<Long> values) {
            addCriterion("top_role_id in", values, "topRoleId");
            return (Criteria) this;
        }

        public Criteria andTopRoleIdNotIn(List<Long> values) {
            addCriterion("top_role_id not in", values, "topRoleId");
            return (Criteria) this;
        }

        public Criteria andTopRoleIdBetween(Long value1, Long value2) {
            addCriterion("top_role_id between", value1, value2, "topRoleId");
            return (Criteria) this;
        }

        public Criteria andTopRoleIdNotBetween(Long value1, Long value2) {
            addCriterion("top_role_id not between", value1, value2, "topRoleId");
            return (Criteria) this;
        }

        public Criteria andTopSourceIdIsNull() {
            addCriterion("top_source_id is null");
            return (Criteria) this;
        }

        public Criteria andTopSourceIdIsNotNull() {
            addCriterion("top_source_id is not null");
            return (Criteria) this;
        }

        public Criteria andTopSourceIdEqualTo(Long value) {
            addCriterion("top_source_id =", value, "topSourceId");
            return (Criteria) this;
        }

        public Criteria andTopSourceIdNotEqualTo(Long value) {
            addCriterion("top_source_id <>", value, "topSourceId");
            return (Criteria) this;
        }

        public Criteria andTopSourceIdGreaterThan(Long value) {
            addCriterion("top_source_id >", value, "topSourceId");
            return (Criteria) this;
        }

        public Criteria andTopSourceIdGreaterThanOrEqualTo(Long value) {
            addCriterion("top_source_id >=", value, "topSourceId");
            return (Criteria) this;
        }

        public Criteria andTopSourceIdLessThan(Long value) {
            addCriterion("top_source_id <", value, "topSourceId");
            return (Criteria) this;
        }

        public Criteria andTopSourceIdLessThanOrEqualTo(Long value) {
            addCriterion("top_source_id <=", value, "topSourceId");
            return (Criteria) this;
        }

        public Criteria andTopSourceIdIn(List<Long> values) {
            addCriterion("top_source_id in", values, "topSourceId");
            return (Criteria) this;
        }

        public Criteria andTopSourceIdNotIn(List<Long> values) {
            addCriterion("top_source_id not in", values, "topSourceId");
            return (Criteria) this;
        }

        public Criteria andTopSourceIdBetween(Long value1, Long value2) {
            addCriterion("top_source_id between", value1, value2, "topSourceId");
            return (Criteria) this;
        }

        public Criteria andTopSourceIdNotBetween(Long value1, Long value2) {
            addCriterion("top_source_id not between", value1, value2, "topSourceId");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNull() {
            addCriterion("create_time is null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIsNotNull() {
            addCriterion("create_time is not null");
            return (Criteria) this;
        }

        public Criteria andCreateTimeEqualTo(Date value) {
            addCriterion("create_time =", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotEqualTo(Date value) {
            addCriterion("create_time <>", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThan(Date value) {
            addCriterion("create_time >", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("create_time >=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThan(Date value) {
            addCriterion("create_time <", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeLessThanOrEqualTo(Date value) {
            addCriterion("create_time <=", value, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeIn(List<Date> values) {
            addCriterion("create_time in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotIn(List<Date> values) {
            addCriterion("create_time not in", values, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeBetween(Date value1, Date value2) {
            addCriterion("create_time between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andCreateTimeNotBetween(Date value1, Date value2) {
            addCriterion("create_time not between", value1, value2, "createTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNull() {
            addCriterion("update_time is null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIsNotNull() {
            addCriterion("update_time is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeEqualTo(Date value) {
            addCriterion("update_time =", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotEqualTo(Date value) {
            addCriterion("update_time <>", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThan(Date value) {
            addCriterion("update_time >", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeGreaterThanOrEqualTo(Date value) {
            addCriterion("update_time >=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThan(Date value) {
            addCriterion("update_time <", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeLessThanOrEqualTo(Date value) {
            addCriterion("update_time <=", value, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeIn(List<Date> values) {
            addCriterion("update_time in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotIn(List<Date> values) {
            addCriterion("update_time not in", values, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeBetween(Date value1, Date value2) {
            addCriterion("update_time between", value1, value2, "updateTime");
            return (Criteria) this;
        }

        public Criteria andUpdateTimeNotBetween(Date value1, Date value2) {
            addCriterion("update_time not between", value1, value2, "updateTime");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

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